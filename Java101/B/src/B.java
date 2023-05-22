public class B {
    public static void main(String[] args) {
        // Çok boyutlu dizi oluşturulması
        String[][] letter = new String[7][5];

        // Dizinin değerlerinin atanması
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                // B harfinin çizgilerinin atanması
                if ((i == 0 && j != 4) || (i == 3 && j != 4) || (i == 6 && j != 4)) {
                    letter[i][j] = "* ";
                }
                // B harfinin diğer kısımlarının atanması
                else if ((j == 0) || (j == 4 && i != 0 && i != 3 && i != 6)) {
                    letter[i][j] = "* ";
                }
                // Boşluk karakterlerinin atanması
                else {
                    letter[i][j] = "  ";
                }
            }
        }

        // Dizinin ekrana yazdırılması
        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
