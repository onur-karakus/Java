import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        int yil = input.nextInt();

        String[] hayvanlar = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        int mod = yil % 12;
        String burc = hayvanlar[mod];

        System.out.println("Çin Zodyağı Burcunuz: " + burc);

        input.close();
    }
}