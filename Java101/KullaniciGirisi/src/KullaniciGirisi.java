import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName = "patika", password = "java123";

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        String nextUserName = inp.nextLine();

        System.out.print("Şifreniz :");
        String nextPassword = inp.nextLine();

        if (nextUserName.equals(userName) && nextPassword.equals(password)) {
            System.out.print("Giriş Yaptınız !");
        } else {
            System.out.print("Bilgileriniz Yanlış !");

            System.out.print("Şifrenizi sıfırlamak istiyor musunuz? (E/H)");
            String resetAnswer = inp.nextLine();

            if (resetAnswer.equalsIgnoreCase("E")) {
                System.out.print("Yeni Şifreniz: ");
                String newPassword = inp.nextLine();

                if (newPassword.equals(password)) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.print("Şifre oluşturuldu.");
                    password = newPassword;
                }
            }
        }
    }
}
