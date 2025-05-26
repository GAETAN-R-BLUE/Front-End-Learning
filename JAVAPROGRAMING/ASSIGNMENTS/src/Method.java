import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        System.out.println("Enter 2 positive numbers separated with a comma:");
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(",");

        // Ensure we have exactly two numbers before proceeding
        if (numbers.length == 2) {
            try {
                int num1 = Integer.parseInt(numbers[0].trim());
                int num2 = Integer.parseInt(numbers[1].trim());

                // Call the add method and store the result
                int sum = add(num1, num2);

                // Display the result
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter two positive integers separated by a comma.");
            }
        } else {
            System.out.println("Please enter exactly two numbers separated by a comma.");
        }
    }

    static public int add(int num1, int num2) {
        // Returns the sum of the two numbers
        return num1 + num2;
    }
}