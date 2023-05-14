import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        int digitSum = 0;
        while (number > 0) {
            digitSum += number % 10;
            number /= 10;
        }

        System.out.println("Basamak sayılarının toplamı: " + digitSum);
    }
}