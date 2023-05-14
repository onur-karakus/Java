import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();
        input.close();

        for(int i=n; i>=1; i--) { // i değişkeni dış döngümüz
            for(int j=1; j<=n-i; j++) { // j değişkeni iç döngümüz
                System.out.print(" "); // boşluk yazdırma
            }
            for(int k=1; k<=2*i-1; k++) {
                System.out.print("*"); // yıldız yazdırma
            }
            System.out.println(); // bir alt satıra geçme
        }
    }
}