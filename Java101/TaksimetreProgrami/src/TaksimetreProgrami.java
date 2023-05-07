package TaksimetreProgrami;

import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması işlemi
        int km;
        double perKm = 2.20, total, startPrice = 10;

        //Scanner sıfınının tanımlanması işlemi
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan gidilen mesafe değerinin alınması işlemi
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        //Toplam mesafenin hesaplanması işlemi
        total = (km * perKm);
        total += startPrice;

        //Toplam tutarın 20 TL'den az olmaması koşulunun sağlanması
        total = (total < 20) ? 20 : total;

        //Toplam tutarın ekrana yazdırılması işlemi
        System.out.println("Toplam Tutar : " + total + " TL");

    }
}


