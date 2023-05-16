import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int base = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int exponent = scanner.nextInt();

        int result = power(base, exponent);
        System.out.println("Sonuç: " + result);
    }

    // Recursive üs alma metodu
    public static int power(int base, int exponent) {
        // Üs 0 ise 1 döndürülür
        if (exponent == 0) {
            return 1;
        } else {
            // Üs değeri bir azaltılarak recursive olarak kendisine çağrılır
            // Sonuç, taban ile recursive çağrı sonucu çarpılarak hesaplanır
            return base * power(base, exponent - 1);
        }
    }
}