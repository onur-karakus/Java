import java.util.Scanner;

public class UcVeDordeTamBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        int toplam = 0;
        int adet = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        if (adet > 0) {
            double ortalama = (double) toplam / adet;
            System.out.println("0-" + n + " arasındaki 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("0-" + n + " arasında 3 ve 4'e tam bölünen sayı yok.");
        }
    }
}