import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kontrol etmek istediğiniz sayıyı giriniz : ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " bir palindrom sayıdır.");
        } else {
            System.out.println(number + " bir palindrom sayı değildir.");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverseNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reverseNumber;
    }
}