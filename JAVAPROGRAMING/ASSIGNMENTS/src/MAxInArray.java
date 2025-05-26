import java.util.Scanner;

public class MAxInArray {
    public static void main(String[] args) {

        System.out.println("Enter a list of number separated with space");

        // Read the whole line of input, split it into a String array using space as delimiter
        String[] userInput = new Scanner(System.in).nextLine().split(" ");

        // Create an integer array of the same size to store parsed numbers
        int[] numbers = new int[userInput.length];

        // Initialize max with the first element after conversion (will fix below)
        // Important: numbers[0] hasn't been filled yet, so this should be changed:
        // We'll fix it right after parsing the first value

        int max = Integer.parseInt(userInput[0]); // Set max to the first number entered

        // Loop through the string array to:    public static void main(String[] args) {
        //
        //        // Prompt user to enter a list of numbers separated by spaces
        // 1. Convert each element to integer
        // 2. Store it in the numbers array
        // 3. Compare each number to find the maximum
        for (int i = 0; i < userInput.length; i++) {
            numbers[i] = Integer.parseInt(userInput[i]); // Convert and store

            // Compare with current max and update if needed
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        // Display the result
        System.out.println("The max number is " + max);
    }
}

