import java.util.Scanner;

public class HarmonikSeriHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        double toplam = 0.0;
        for (int i = 1; i <= n; i++) {
            toplam += (1.0 / i);
        }

        System.out.println("Harmonik seri: " + toplam);
    }
}
