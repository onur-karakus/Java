import java.util.Scanner;

public class HesapMakinesiProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz : ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        int num2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpman\n4-Bölme");
        char operator = scanner.next().charAt(0);

        int result = 0;

        switch (operator) {
            case '1':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '2':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '3':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '4':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Hatalı Giriş Yaptınız!");
                return;
        }
    }
}
