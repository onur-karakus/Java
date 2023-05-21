import java.util.Arrays;
import java.util.Scanner;

public class FindNearestNumbers {
    public static void main(String[] args) {
        // Önceden tanımlanmış dizi
        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};

        // Kullanıcıdan giriş almak için Scanner kullanımı
        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayı: ");
        int target = input.nextInt();

        // Girilen sayıya en yakın küçük ve büyük sayıları bulma
        int nearestSmaller = findNearestSmaller(numbers, target);
        int nearestGreater = findNearestGreater(numbers, target);

        // Sonuçları ekrana yazdırma
        System.out.println("Dizi: " + Arrays.toString(numbers));
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + nearestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + nearestGreater);
    }

    // Girilen sayıdan küçük en yakın sayıyı bulan metot
    private static int findNearestSmaller(int[] numbers, int target) {
        int nearestSmaller = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number < target && number > nearestSmaller) {
                nearestSmaller = number;
            }
        }

        return nearestSmaller;
    }

    // Girilen sayıdan büyük en yakın sayıyı bulan metot
    private static int findNearestGreater(int[] numbers, int target) {
        int nearestGreater = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number > target && number < nearestGreater) {
                nearestGreater = number;
            }
        }

        return nearestGreater;
    }
}
