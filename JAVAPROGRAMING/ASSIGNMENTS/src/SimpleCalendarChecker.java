/* **********************************************************************************************
 * This program prompts the user for a number corresponding to a day of the week and display the
 * day. The program also have invalid inputs gracefully.
 * Date: 01-/01/1111; Name: Gaetan
 * **********************************************************************************************/

import java.util.Scanner;

public class SimpleCalendarChecker {
    public static void main(String[] args) {
        while (true) {
            // Prompts the user for a number
            System.out.println("Enter an integer corresponding to the date or 0 to exit.");
            int choice = new Scanner(System.in).nextInt();
            // Check if the number is within the range (1-7)
            if (choice < 0 || choice > 7) {
                // if not within the range, display an error message
                System.out.println("Try again, invalid input");
            }
            if (choice == 0) {
                break;
            } else {
                switch (choice) {
                    case 1: {
                        System.out.println("1 = Monday");
                        break;
                    }
                    case 2: {
                        System.out.println("2 = Tuesday");
                        break;
                    }
                    case 3: {
                        System.out.println("3 = Wednesday");
                        break;
                    }
                    case 4: {
                        System.out.println("4 = Thursday");
                        break;
                    }
                    case 5: {
                        System.out.println("5 = Friday");
                        break;
                    }
                    case 6: {
                        System.out.println("6 = Saturday");
                        break;
                    }
                    case 7: {
                        System.out.println("7 = Sunday");
                        break;
                    }
                }
            }
        }
    }
}

