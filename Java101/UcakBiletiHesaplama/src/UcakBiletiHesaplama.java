import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mesafe (KM) bilgisini kullanıcıdan alın
        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        // Yaş bilgisini kullanıcıdan alın
        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        // Yolculuk tipi bilgisini kullanıcıdan alın
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        scanner.close();

        // Hatalı veri kontrolü yapın
        if (mesafe <= 0 || yas <= 0 || yolculukTipi < 1 || yolculukTipi > 2) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // Ücret hesaplayın
        double fiyat = mesafe * 0.10;

        // Yaş indirimini uygulayın
        if (yas < 12) {
            fiyat *= 0.5;
        } else if (yas <= 24) {
            fiyat *= 0.9;
        } else if (yas >= 65) {
            fiyat *= 0.7;
        }

        // Yolculuk tipi indirimini uygulayın
        if (yolculukTipi == 2) {
            fiyat *= 0.8;
            fiyat *= 2;
        }

        // Sonuçları ekrana yazdırın
        System.out.printf("Toplam Tutar: %.2f TL", fiyat);
    }
}