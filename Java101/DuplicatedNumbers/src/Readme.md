# Patika.Dev - Java Eğitimi
# Duplicated Numbers

Bu Java programı, rastgele oluşturulan bir dizide tekrar eden sayıları ve tekrar sayılarını bulmayı sağlar.

## Kod

```java
import java.util.Arrays;

public class DuplicatedNumbers {
    public static void main(String[] args) {
        // Rastgele bir dizi oluşturulması
        int[] numbers = new int[20];
        System.out.print("\nDizi: ");
        for (int i = 0; i < numbers.length; i++) {
            int randomNum = (int) (Math.random() * 9) + 1; // 1 ile 10 arasında rastgele sayı üretme
            System.out.print(randomNum + " ");
            numbers[i] = randomNum;
        }

        // Diziyi sıralama
        Arrays.sort(numbers);

        // Tekrar eden sayıları ve tekrar sayılarını hesaplama
        System.out.println("\n\n###### Tekrar Eden Sayılar ######\n");
        int count = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println(numbers[i - 1] + " Dizi içinde " + count + " kere tekrar ediyor");
                }
                count = 1;
            }
        }
        if (count > 1) {
            System.out.println(numbers[numbers.length - 1] + " Dizi içinde " + count + " kere tekrar ediyor");
        }
    }
}

Nasıl Çalışır?

Program, numbers adında bir dizi oluşturur ve rastgele 1 ile 9 arasında sayılarla doldurur.
Dizi, küçükten büyüğe doğru sıralanır.
Döngü ile tekrar eden sayılar ve tekrar sayıları hesaplanır ve ekrana yazdırılır.
Örnek çıktı:

Dizi: 5 9 3 2 7 3 1 4 8 5 6 9 3 7 4 1 3 5 2 1 

###### Tekrar Eden Sayılar ######

3 Dizi içinde 3 kere tekrar ediyor
1 Dizi içinde 3 kere tekrar ediyor
2 Dizi içinde 2 kere tekrar ediyor
4 Dizi içinde 2 kere tekrar ediyor
5 Dizi içinde 3 kere tekrar ediyor
7 Dizi içinde 2 kere tekrar ediyor
9 Dizi içinde 2 kere tekrar ediyor
