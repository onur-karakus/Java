import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, max, min, number;

        System.out.print("Kaç adet sayı gireceksiniz? ");
        n = input.nextInt();

        System.out.print("1. sayıyı giriniz: ");
        number = input.nextInt();
        max = number;
        min = number;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            number = input.nextInt();
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
