import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            array[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sıralama
        Arrays.sort(array);

        // Sıralanmış diziyi ekrana yazdırma
        System.out.print("Sıralama: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
