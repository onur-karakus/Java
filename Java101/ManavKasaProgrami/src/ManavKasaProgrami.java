import javax.management.modelmbean.ModelMBeanAttributeInfo;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ManavKasaProgrami {

    public static final String RESET = "\033[0m";  // Text Reset

    public static final String YELLOW = "\033[0;33m";  // YELLOW

    public static final String ORANGE = "\u001b[38;2;238;124;43m";  // ORANGE
    public static void main(String[] args) {

        double armutFiyat = 2.14, elmaFiyat = 3.67,domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.0;
        double  dArmutkg, dElmaKg, dDomatesKg, dMuzkg, dPatlicanKg;
        String armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Armut Ağırlığını KG cinsinden giriniz : ");
        armutKg = input.next();

        boolean kosul1 = armutKg.contains(",");
        armutKg = kosul1 ? armutKg = armutKg.replace(",", ".") : armutKg;

        dArmutkg = Double.parseDouble(armutKg);

        System.out.print("Lütfen Elma Ağırlığını KG cinsinden giriniz : ");
        elmaKg = input.next();

        boolean kosul2 = elmaKg.contains(",");
        elmaKg = kosul2 ? elmaKg = elmaKg.replace(",", ".") : elmaKg;

        dElmaKg = Double.parseDouble(elmaKg);

        System.out.print("Lütfen Domates Ağırlığını KG cinsinden giriniz : ");
        domatesKg = input.next();

        boolean kosul3 = domatesKg.contains(",");
        domatesKg = kosul3 ? domatesKg = domatesKg.replace(",", ".") : domatesKg;

        dDomatesKg = Double.parseDouble(domatesKg);

        System.out.print("Lütfen Muz Ağırlığını KG cinsinden giriniz : ");
        muzKg = input.next();

        boolean kosul4 = muzKg.contains(",");
        muzKg = kosul4 ? muzKg = muzKg.replace(",", ".") : muzKg;

        dMuzkg = Double.parseDouble(muzKg);

        System.out.print("Lütfen Patlıcan Ağırlığını KG cinsinden giriniz : ");
        patlicanKg = input.next();

        boolean kosul5 = patlicanKg.contains(",");
        patlicanKg = kosul5 ? patlicanKg = patlicanKg.replace(",", ".") : patlicanKg;

        dPatlicanKg = Double.parseDouble(patlicanKg);

        double armutToplam = (armutFiyat * dArmutkg);
        double elmaToplam = (elmaFiyat * dElmaKg);
        double domatesToplam = (domatesFiyat * dDomatesKg);
        double muzToplam = (muzFiyat * dMuzkg);
        double patlicanToplam = (patlicanFiyat * dPatlicanKg);

        double toplam = armutToplam + elmaToplam + domatesToplam + muzToplam + patlicanToplam;

        DecimalFormat formatter = new DecimalFormat("##.##");

        String sToplam = String.valueOf(formatter.format(toplam));
        boolean kosul6= sToplam.contains(",");
        sToplam = kosul6 ? sToplam = sToplam.replace(",", ".") : sToplam;;


        System.out.println(ORANGE + "Armut "+ RESET + "Kaç Kilo ? : " + YELLOW + armutKg);
        System.out.println(ORANGE + "Elma " + RESET + "Kaç Kilo ? : " + YELLOW + elmaKg);
        System.out.println(ORANGE + "Domates "+ RESET + "Kaç Kilo ? : "+ YELLOW +  domatesKg);
        System.out.println(ORANGE + "Muz " + RESET + "Kaç Kilo ? : " + YELLOW + muzKg);
        System.out.println(ORANGE + "Patlıcan " + RESET + "Kaç Kilo ? : " + YELLOW + patlicanKg);
        System.out.println(ORANGE + "Toplam " + RESET +  "Tutar : " + YELLOW + sToplam + RESET +" TL");

    }
}

