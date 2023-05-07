package TaksimetreProgrami;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması işlemi
        int km;
        double perKm = 2.25, total, startPrice = 10;

        //Scanner sınıfının tanımlanması işlemi
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan gidilen mesafe değerinin alınması işlemi
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        //Toplam mesafenin hesaplanması işlemi
        total = (km * perKm);
        total += startPrice;

        //Toplam tutarın 20 TL'den az olmaması koşulunun sağlanması
        total = (total < 20) ? 20 : total;
        DecimalFormat formatter = new DecimalFormat("##.##");


        //Toplam tutarın ekrana yazdırılması işlemi
        System.out.println("Toplam Tutar : " + formatter.format(total) + " TL");

    }
}


