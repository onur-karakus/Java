package UcgenAlanHesaplayici;

import java.util.Scanner;

public class UcgenAlanHesaplayici {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması işlemi
        double a,b,c,u,alan;

        //Scanner sınıfının tanımlanması işlemi
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değişken değerlerinin alınması işlemi
        System.out.print("Birinci Kenarın Uzunluğunu Giriniz : ");
        a = input.nextDouble();

        System.out.print("İkinci Kenarın Uzunluğunu Giriniz : ");
        b = input.nextDouble();

        System.out.print("Üçüncü Kenarın Uzunluğunu Giriniz : ");
        c = input.nextDouble();

        //üçgenin alanının hesaplanması işlemi
        u = ((a + b + c) / 2);
        alan = Math.sqrt(u * (u - a) * (u - b) * (u -c));

        //Üçgenin Alanının ekrana yazdırılması işlemi
        System.out.println("Üçgenin Alanı : " + alan + " metrekare");

    }
}
