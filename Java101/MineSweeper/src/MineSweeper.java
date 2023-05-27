import java.util.Scanner;

public class MineSweeper {
    private char[][] mineField; // Mayın tarlasının görüntüsü
    private boolean[][] revealed; // Hücrelerin açılıp açılmadığını tutar
    private boolean[][] mines; // Mayınların konumlarını tutar
    private boolean gameOver; // Oyunun bitip bitmediğini tutar
    private int rows; // Mayın tarlasının satır sayısı
    private int cols; // Mayın tarlasının sütun sayısı
    private int mineCount; // Mayın sayısı

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        mineField = new char[rows][cols];
        revealed = new boolean[rows][cols];
        mines = new boolean[rows][cols];
        mineCount = rows * cols / 4; // Mayın sayısı elemanSayisi / 4
        gameOver = false;
    }

    public void play() {
        initializeGame();
        while (!gameOver) {
            printMineField();
            int row = getRowInput();
            int col = getColInput();
            revealCell(row, col);
            if (mineField[row][col] == '*') {
                gameOver = true;
                System.out.println("Game Over!!");
            } else if (checkWin()) {
                gameOver = true;
                System.out.println("Oyunu Kazandınız!");
            }
        }
        revealAllMines();
        printMineField();
    }

    private void initializeGame() {
        placeMines();
        fillMineField();
    }

    private void placeMines() {
        int count = 0;
        while (count < mineCount) {
            int row = (int) (Math.random() * rows);
            int col = (int) (Math.random() * cols);
            if (!mines[row][col]) {
                mines[row][col] = true;
                count++;
            }
        }
    }

    private void fillMineField() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mines[i][j]) {
                    mineField[i][j] = '*';
                } else {
                    mineField[i][j] = '-';
                }
                revealed[i][j] = false;
            }
        }
    }

    private void printMineField() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (revealed[i][j]) {
                    System.out.print(mineField[i][j] + " "); // Açılmış hücreleri gösterir
                } else {
                    System.out.print("- "); // Henüz açılmamış hücreleri gösterir
                }
            }
            System.out.println();
        }
    }

    private int getRowInput() {
        Scanner scanner = new Scanner(System.in);
        int row;
        do {
            System.out.print("Satır Giriniz: ");
            row = scanner.nextInt() - 1; // Kullanıcının girdiği satırı alır
        } while (row < 0 || row >= rows); // Geçerli bir satır girilene kadar tekrar sorar
        return row;
    }

    private int getColInput() {
        Scanner scanner = new Scanner(System.in);
        int col;
        do {
            System.out.print("Sütun Giriniz: ");
            col = scanner.nextInt() - 1; // Kullanıcının girdiği sütunu alır
        } while (col < 0 || col >= cols); // Geçerli bir sütun girilene kadar tekrar sorar
        return col;
    }

    private void revealCell(int row, int col) {
        if (revealed[row][col]) {
            System.out.println("Bu hücre zaten açık!"); // Zaten açılmış bir hücre seçildiğinde uyarı verir
            return;
        }

        revealed[row][col] = true;

        if (mineField[row][col] == '-') {
            int count = countAdjacentMines(row, col);
            mineField[row][col] = (char) (count + '0'); // Hücrenin etrafındaki mayın sayısını gösterir
            if (count == 0) {
                //  Etrafındaki tüm boş hücreleri aç
                for (int i = row - 1; i <= row + 1; i++) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        if (i >= 0 && i < rows && j >= 0 && j < cols) {
                            revealCell(i, j);
                        }
                    }
                }
            }
        }
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rows && j >= 0 && j < cols && mineField[i][j] == '*') {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean checkWin() {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (revealed[i][j] || mineField[i][j] == '*') {
                    count++;
                }
            }
        }
        return count == rows * cols; // Tüm hücreler açılmış veya mayınlar bulunmuşsa true döner
    }

    private void revealAllMines() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mineField[i][j] == '*') {
                    revealed[i][j] = true; // Tüm mayınları gösterir
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");

        System.out.print("Mayın Tarlası Boyutunu Giriniz\nSatır Sayısı: ");
        int rows = scanner.nextInt();
        System.out.print("Sütun Sayısı: ");
        int cols = scanner.nextInt();

        MineSweeper game = new MineSweeper(rows, cols);
        game.play();
    }
}
