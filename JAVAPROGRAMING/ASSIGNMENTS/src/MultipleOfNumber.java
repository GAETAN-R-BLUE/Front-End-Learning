/* ***************************************************
 * This program ask the user for a based number and a
 * limit number , and the print all the multiple of that
 * based number up to the limit number: RGG
 * -----------------------------------------------------*/

import java.util.Scanner;

public class MultipleOfNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your base number");
        int baseNumber = userInput.nextInt();
        System.out.println("Enter the limit");
        int limitNumber = userInput.nextInt();
        System.out.println("Multiples of " + baseNumber + " up to " + limitNumber + ":");
        for (int i = 1; i <= limitNumber; i++) {
            if (i % baseNumber == 0) {
                System.out.print(i + " ");
            }
        }
        userInput.close();
    }
}
