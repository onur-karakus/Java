import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100); // 0 ile 100 arasında rastgele bir sayı seçiliyor
        Scanner input = new Scanner(System.in);

        int right = 0; // Doğru tahmin sayısı
        int selected; // Kullanıcının seçtiği sayı
        int[] wrong = new int[5]; // Yanlış tahminleri saklamak için dizi
        boolean isWin = false; // Kullanıcının oyunu kazanıp kazanmadığını takip eden bayrak
        boolean isWrong = false; // Kullanıcının yanlış giriş yapıp yapmadığını takip eden bayrak

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : "); // Kullanıcıdan giriş isteniyor
            selected = input.nextInt(); // Kullanıcının tahmini okunuyor

            if (selected < 0 || selected > 99) { // Tahminin geçerli aralıkta olup olmadığı kontrol ediliyor
                System.out.println("Lütfen 0-100 arasında bir değer giriniz."); // Geçerli bir giriş isteniyor
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir dahaki hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue; // Döngünün geri kalanını atlayarak bir sonraki döngüye geç
            }

            if (selected == number) { // Tahminin doğru olup olmadığı kontrol ediliyor
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı: " + number);
                isWin = true;
                break; // Kullanıcı doğru tahmini yaptığı için döngüden çık
            } else {
                System.out.println("Sayıyı tahmin edemediniz!"); // Kullanıcıya yanlış tahmin hakkında bilgi veriliyor
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected; // Yanlış tahmin diziye kaydediliyor
                System.out.println("Kalan hakkınız: " + (5 - right)); // Kalan tahminler gösteriliyor
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz!"); // Kullanıcıya oyunu kaybettiği bilgisi veriliyor
            System.out.println("Gizli Sayı: " + number); // Gizli sayı gösteriliyor
            if (!isWrong) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong)); // Yanlış tahminler gösterili
            }
        }
    }
}