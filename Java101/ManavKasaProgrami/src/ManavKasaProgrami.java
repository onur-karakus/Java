package ManavKasaProgrami;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;
import java.util.Locale;
public class ManavKasaProgrami {
    public static final String ANSI_RESET = "\u001b[0m";

    public static final String ANSI_YELLOW = "\u001b[33m";
    public static final String ANSI_ORANGE = "\u001b[38;2;238;124;43m";
    public static void main(String[] args){
        double toplam, armutFiyati = 2.14 , elmaFiyati = 3.67, domatesFiyati = 1.11 , muzFiyati = 0.95 , patlicanFiyati = 5.0;
        String armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double armutToplam, elmaToplam, domatesToplam, muzToplam, patlicanToplam;

        Scanner input = new Scanner(System.in).useLocale(Locale.UK);

        System.out.print("Kaç kg Armut aldınız ? = ");

        armutKg = input.next();
        boolean kosul1 = armutKg.contains(",");
        armutKg = kosul1 ? armutKg = armutKg.replace(",", "."): armutKg;

        double dArmutKg = Double.parseDouble(armutKg);
        armutToplam = (armutFiyati * dArmutKg);


        System.out.print("Kaç kg Elma aldınız ? = ");
        elmaKg = input.next();
        boolean kosul2 = elmaKg.contains(",");
        elmaKg = kosul2 ? elmaKg = elmaKg.replace(",", ".") : elmaKg;

        double dElmaKg = Double.parseDouble(elmaKg);
        elmaToplam = (elmaFiyati * dElmaKg);

        System.out.print("Kaç kg Domates aldınız ? = ");
        domatesKg = input.next();

        boolean kosul3 = domatesKg.contains(",");
        domatesKg = kosul3 ? domatesKg = domatesKg.replace(",", ".") : domatesKg;

        double dDomatesKg = Double.parseDouble(domatesKg);
        domatesToplam = (domatesFiyati * dDomatesKg);

        System.out.print("Kaç kg Muz aldınız ? = ");
        muzKg = input.next();

        boolean kosul4 = muzKg.contains(",");
        muzKg = kosul4 ? muzKg = muzKg.replace(",", ".") : muzKg;

        double dMuzKg = Double.parseDouble(muzKg);
        muzToplam = (muzFiyati * dMuzKg);

        System.out.print("Kaç kg Patlıcan aldınız ? = ");
        patlicanKg = input.next();

        boolean kosul5 = patlicanKg.contains(",");
        patlicanKg = kosul5 ? patlicanKg = patlicanKg.replace(",", ".") : patlicanKg;

        double dPatlicanKg = Double.parseDouble(patlicanKg);
        patlicanToplam = (patlicanFiyati * dPatlicanKg);

        DecimalFormat formatter = new DecimalFormat("##.##");

        toplam = ( armutToplam + elmaToplam + domatesToplam + muzToplam + patlicanToplam );


        String sToplam = Double.toString(toplam);

        boolean kosul6 = sToplam.contains(",") && sToplam.contains(".");
        sToplam = kosul6 ? sToplam = sToplam.replace(".", ",") : sToplam;





        System.out.println("");
        System.out.println(ANSI_ORANGE + "Armut " + ANSI_RESET + "Kaç Kilo ? :" + ANSI_YELLOW + formatter.format(dArmutKg) + "KG");
        System.out.println(ANSI_ORANGE + "Elma " + ANSI_RESET +" Kaç Kilo ? :" + ANSI_YELLOW + formatter.format(dElmaKg) + "KG" );
        System.out.println(ANSI_ORANGE + "Domates " + ANSI_RESET + "Kaç Kilo ? :" + ANSI_YELLOW +formatter.format(dDomatesKg) + "KG");
        System.out.println(ANSI_ORANGE + "Muz " + ANSI_RESET + "Kaç Kilo ? :" + ANSI_YELLOW +formatter.format(dMuzKg) + "KG");
        System.out.println(ANSI_ORANGE + "Patlıcan "+ ANSI_RESET +"Kaç Kilo ? :" + ANSI_YELLOW +formatter.format(dPatlicanKg) + "KG");
        System.out.println(ANSI_ORANGE + "Toplam " + ANSI_RESET +"Tutar :" + ANSI_YELLOW + sToplam + " TL");


    }
}