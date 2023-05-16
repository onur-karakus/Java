import java.util.Scanner;

public class RecursivePrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }
    }

    // Recursive asal sayı kontrol metodu
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        return isPrimeRecursive(number, 2);
    }

    private static boolean isPrimeRecursive(int number, int divisor) {
        if (divisor == number) {
            return true;
        }

        if (number % divisor == 0) {
            return false;
        }

        return isPrimeRecursive(number, divisor + 1);
    }
}
