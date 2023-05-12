import java.text.DecimalFormat;
import java.util.Scanner;

public class SinifGecmeDurumu {

    public static void main(String[] args) {

        //Değişkenlerin tanımlanması işlemi
        int mat, fizik, kimya, turkce, muzik;

        //Scanner sınıfının oluşturulması işlemi
        Scanner input = new Scanner(System.in);

        //Kulllanıcıdan değerlerin alınması işlemi
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Girdiğiniz not 0 ile 100 arasında olmalıdır. Hatalı Giriş yaptınız!");
            mat = 0;
        }

        //Kulllanıcıdan değerlerin alınması işlemi
        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Girdiğiniz not 0 ile 100 arasında olmalıdır. Hatalı Giriş yaptınız!");
            turkce = 0;
        }

        //Kulllanıcıdan değerlerin alınması işlemi
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Girdiğiniz not 0 ile 100 arasında olmalıdır. Hatalı Giriş yaptınız!");
            fizik = 0;
        }

        //Kulllanıcıdan değerlerin alınması işlemi
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Girdiğiniz not 0 ile 100 arasında olmalıdır. Hatalı Giriş yaptınız!");
            kimya = 0;
        }

        //Kulllanıcıdan değerlerin alınması işlemi
        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Girdiğiniz not 0 ile 100 arasında olmalıdır. Hatalı Giriş yaptınız!");
            muzik = 0;
        }

        int toplam = (mat + fizik + turkce + kimya + muzik);
        double sonuc = toplam / 6.0;

        DecimalFormat formatter = new DecimalFormat("##.##");

        System.out.println("Ortalamanız : " + formatter.format(sonuc));

        }
    }

