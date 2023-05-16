# Patika.Dev - Java Eğitimi
Gelişmiş Hesap Makinesi

Bu basit hesap makinesi programı, kullanıcıdan girdi alarak toplama, çıkarma, çarpma, bölme, üslü sayı hesaplama, faktoriyel hesaplama, mod alma ve dikdörtgen alanı ve çevresi hesaplama işlemlerini yapar.

## Nasıl Kullanılır?

1. Proje dosyalarını bilgisayarınıza kopyalayın veya klonlayın.
2. Proje dosyalarını bir Java IDE'sinde açın.
3. `AdvancedCalculator.java` dosyasını çalıştırın.
4. Menüdeki işlem seçeneklerini takip ederek istediğiniz hesaplama işlemini yapabilirsiniz.
5. İşlem yapmak istemediğiniz zaman 0 tuşuna basarak programdan çıkabilirsiniz.

## Örnek

```java
import java.util.Scanner;

public class AdvancedCalculator {
    // Metotlar ve main metodu buraya gelecek
    // ...
    // ...

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulus();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
