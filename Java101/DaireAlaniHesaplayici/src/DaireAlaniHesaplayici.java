package DaireAlaniHesaplayici;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DaireAlaniHesaplayici {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r = input.nextInt();

        System.out.print("Dairenin Merkez Açısının Ölçüsünü Giriniz : ");
        a = input.nextInt();

        DecimalFormat formatter = new DecimalFormat("##.##");

        alan = (((pi * (r * r) * a))/ 360);
        System.out.println("Daire Diliminin Alanı : " + formatter.format(alan) + " metrekare");

        }
}