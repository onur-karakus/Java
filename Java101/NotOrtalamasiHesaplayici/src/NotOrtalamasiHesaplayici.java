package NotOrtalamasiHesaplayici;

import java.util.Scanner;

public class NotOrtalamasiHesaplayici {

    public static void main(String[] args) {

        //Değişkenlerin tanımlanması işlemi
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfının oluşturulması işlemi
        Scanner input = new Scanner(System.in);

        //Kulllanıcıdan değerlerin alınması işlemi
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        //Kulllanıcıdan değerlerin alınması işlemi
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        //Kulllanıcıdan değerlerin alınması işlemi
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        //Kulllanıcıdan değerlerin alınması işlemi
        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();

        //Kulllanıcıdan değerlerin alınması işlemi
        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();

        //Kulllanıcıdan değerlerin alınması işlemi
        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);

        boolean mezuniyet = sonuc >= 60;
        String  str = mezuniyet ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(str);

    }
}
