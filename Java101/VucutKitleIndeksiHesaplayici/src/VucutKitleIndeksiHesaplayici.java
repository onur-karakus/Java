import java.text.DecimalFormat;
import java.util.Scanner;

public class VucutKitleIndeksiHesaplayici {
    public static void main(String[] args) {
        String kilo, boy;
        double bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.next();

        boolean kosul1 = boy.contains(",");
        boy = kosul1 ? boy = boy.replace(",", ".") : boy;

        double dboy = Double.parseDouble(boy);

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.next();

        boolean kosul2 = kilo.contains(",");
        kilo = kosul2 ? kilo = kilo.replace(",", ".") : kilo;

        double dkilo = Double.parseDouble(kilo);

        bmi = (dkilo / ( dboy * dboy ));
        DecimalFormat formatter = new DecimalFormat("##.##");

        System.out.println("Vücut kitle İndeksiniz :  " + formatter.format(bmi));

    }
}
