import java.util.Arrays;

public class DuplicatedNumbers {
    public static void main(String[] args) {
        // Rastgele bir dizi oluşturulması
        int[] numbers = new int[20];
        System.out.print("\nDizi : ");
        for (int i = 0; i < numbers.length; i++) {
            int randomNum = (int) (Math.random() * 9) + 1; // 1 ile 10 arasında rastgele sayı üretme
            System.out.print(randomNum + " ");
            numbers[i] = randomNum;
        }


        // Diziyi sıralama
        Arrays.sort(numbers);

        // Tekrar eden sayıları ve tekrar sayılarını hesaplama
        System.out.println("\n###### Tekrar Eden Sayılar ######\n");
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


