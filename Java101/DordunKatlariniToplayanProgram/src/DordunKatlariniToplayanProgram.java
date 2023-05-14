import java.util.Scanner;

public class DordunKatlariniToplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int number;

        do {
            System.out.print("Bir sayı giriniz (Programı sonlandırmak için tek sayı giriniz): ");
            number = input.nextInt();

            if ( number % 4 == 0) {
                sum += number;
            }
        } while (number % 2 == 0);

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + sum);
    }
}