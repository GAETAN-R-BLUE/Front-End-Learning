/* **************************************************************************
 * This program prompts the user for a number with at least 2 digits and then
 * finds the sum of those numbers using a for loop.
 * **************************************************************************/

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer with at least 2 digits");
        String userInput = input.nextLine();

        if (!userInput.matches("\\d{2,}")) {
            System.out.println("Invalid input. Please enter a number with at least 2 digits.");
            input.close();
            return;
        }
        int number = 0;
        for (int i = 0; i < userInput.length(); i++) {
            number += userInput.charAt(i) - '0';
        }
        System.out.println("The sum of the digits of your number is: " + number);
        input.close();
    }
}
