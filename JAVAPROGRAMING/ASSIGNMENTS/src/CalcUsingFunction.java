import java.util.Scanner;

// Main class
public class CalcUsingFunction {

    // Main method - execution starts here
    public static void main(String[] args) {

        // Create Scanner object for reading input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first integer");
        int number1 = input.nextInt(); // Store the first number

        // Prompt the user to enter the second number
        System.out.println("Enter the second integer");
        int number2 = input.nextInt(); // Store the second number

        // Display available operations
        System.out.println("Choose the operation to be performed");
        System.out.println(); // Empty line for spacing
        System.out.println("1-Addition");
        System.out.println("2-Difference");
        System.out.println("3-Division");
        System.out.println("4-Product");

        // Get user's choice of operation
        int response = input.nextInt();

        // Perform operation based on user selection
        if (response == 1) {
            System.out.println("The sum of the 2 number is " + add(number1, number2));
        } else if (response == 2) {
            System.out.println("The difference of the 2 numbers is " + diff(number1, number2));
        } else if (response == 3) {
            System.out.println("The quotient of the 2 number is " + div(number1, number2));
        } else if (response == 4) {
            System.out.println("The product of the 2 numbers is " + prod(number1, number2));
        } else {
            // Handle invalid operation
            System.out.println("Invalid operation selected");
        }
    }

    // Method to add two integers
    public static int add(int a, int b) {
        return (a + b);
    }

    // Method to subtract two integers
    public static int diff(int a, int b) {
        return (a - b);
    }

    // Method to divide two integers with error handling
    public static int div(int a, int b) {
        try {
            return a / b; // Attempt division
        } catch (ArithmeticException e) {
            System.out.println("Division by ZERO is not allowed.");
            return 0; // Return 0 if division fails
        }
    }

    // Method to multiply two integers
    public static int prod(int a, int b) {
        return (a * b);
    }
}

