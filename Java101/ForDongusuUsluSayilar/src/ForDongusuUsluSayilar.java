import java.util.Scanner;

public class ForDongusuUsluSayilar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Tabanı giriniz: ");
        int taban = input.nextInt();

        System.out.print("Üssü giriniz: ");
        int us = input.nextInt();

        int sonuc = 1;

        for(int i = 1; i <= us; i++){
            sonuc *= taban;
        }

        System.out.println(taban + " üzeri " + us + " = " + sonuc);

        input.close();
    }
}