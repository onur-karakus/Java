import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " bir palindromik kelimedir.");
        } else {
            System.out.println(word + " bir palindromik kelime değildir.");
        }
    }


    // Bir kelimenin palindromik olup olmadığını kontrol eden fonksiyon
    public static boolean isPalindrome(String word) {
        // Kelimenin karakter dizisini ters çevirerek yeni bir String oluşturuyoruz
        String reversed = new StringBuilder(word).reverse().toString();

        // Ters çevrilmiş kelime ile orijinal kelimeyi karşılaştırıyoruz
        // Eğer eşitse palindromik, değilse değil
        return word.equals(reversed);
    }
}