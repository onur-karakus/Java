import java.util.Scanner;

public class ElmasPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen tek bir sayı giriniz: ");
        int n = input.nextInt();

        for(int i=1; i<=n; i+=2) {
            for(int j=1; j<=(n-i)/2; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-2; i>=1; i-=2) {
            for(int j=1; j<=(n-i)/2; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
