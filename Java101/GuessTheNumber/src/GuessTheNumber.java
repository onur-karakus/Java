import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100); // Select a random number between 0 and 99

        Scanner input = new Scanner(System.in);
        int right = 0; // Number of correct guesses
        int selected; // User's selected number
        int[] wrong = new int[5]; // Array to store incorrect guesses
        boolean isWin = false; // Flag to track if the user won the game
        boolean isWrong = false; // Flag to track if the user made wrong inputs

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : "); // Prompt for user input
            selected = input.nextInt(); // Read user's guess from input

            if (selected < 0 || selected > 99) { // Check if the guess is out of the valid range
                System.out.println("Lütfen 0-100 arasında bir değer giriniz."); // Prompt for valid input
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir dahaki hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue; // Skip the rest of the loop and start the next iteration
            }

            if (selected == number) { // Check if the guess is correct
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break; // Exit the loop since the user has guessed correctly
            } else {
                System.out.println("Hatalı bir sayı girdiniz !"); // Inform the user about incorrect guess
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected; // Store the incorrect guess in the wrong array
                System.out.println("Kalan hakkı : " + (5 - right)); // Display the remaining guesses
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! "); // Inform the user about losing the game
            System.out.println("Gizli Sayı : " + number); // Display the hidden number
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong)); // Display the incorrect guesses
            }
        }
    }
}