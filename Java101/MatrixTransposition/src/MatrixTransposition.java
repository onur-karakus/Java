import java.util.Scanner;

public class MatrixTransposition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını giriniz: ");
        int rows = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını giriniz: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        int[][] transposedMatrix = new int[columns][rows];

        System.out.println("Matrisin elemanlarını giriniz:");

        // Kullanıcıdan matrisin elemanlarını alıyoruz
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
                // Transpoze matrisinde satır ve sütunları yer değiştiriyoruz
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matris:");
        // Matrisi ekrana yazdırma
        printMatrix(matrix);

        System.out.println("Transpoze:");
        // Transpoze matrisi ekrana yazdırma
        printMatrix(transposedMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; matrix.length > i; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
