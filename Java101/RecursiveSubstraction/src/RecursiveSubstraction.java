import java.util.Scanner;

public class RecursiveSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        // Kullanıcıdan n değerini almak için gereken kod buraya yazılır.

        recursiveOperation(n);
    }

    public static void recursiveOperation(int n) {
        if (n <= 0) {
            System.out.print( n + " ");
            return;
        }

        System.out.print( n + " ");
        recursiveOperation(n - 5);

        System.out.print(n + " ");
    }
}
