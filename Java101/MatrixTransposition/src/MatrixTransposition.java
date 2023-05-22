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

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matris:");
        printMatrix(matrix);

        System.out.println("Transpoze:");
        printMatrix(transposedMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
