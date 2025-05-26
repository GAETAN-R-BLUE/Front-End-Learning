import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random number = new Random();
        int numberToGuess = number.nextInt(100) + 1; // Generate between 1–100
        Scanner input = new Scanner(System.in); // Scanner declared once
        int attempts = 0;

        while (true) {
            System.out.println("Guess the number: Enter a positive integer between 1 and 100");
            int guess = input.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid entry, the number should be between 1 and 100.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("🎉 Congratulations! The number was " + numberToGuess);
                System.out.println("You found it in " + attempts + " attempt(s).");
                break;
            }
        }
        input.close();
    }
}