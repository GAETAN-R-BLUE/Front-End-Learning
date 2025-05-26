import java.util.HashMap; // Importing HashMap for character frequency storage
import java.util.Scanner; // Importing Scanner to read input from user

public class MostFrequentCharacter {
    public static void main(String[] args) {
        // Prompt user to input a word in lowercase letters
        System.out.println("Enter a Word in lower case:");

        // Read the input from user
        String input = new Scanner(System.in).nextLine();

        // HashMap to store the count of each character
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            // Get the current character at index i
            char c = input.charAt(i);

            // Update the count for the character: if it’s not present, default to 0 and add 1
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Variable to hold the most frequent character, initially set to a default value
        char mostFrequentChar = 0;

        // Variable to track the highest count seen so far
        int maxCount = 0;

        // Iterate through the entries in the HashMap
        for (HashMap.Entry<Character, Integer> entry : charCount.entrySet()) {
            // If the current character's count is greater than the maxCount
            if (entry.getValue() > maxCount) {
                // Update maxCount to the current character's count
                maxCount = entry.getValue();

                // Set the most frequent character to the current character
                mostFrequentChar = entry.getKey();
            }
        }

        // Print the character with the highest frequency
        System.out.println("The most frequent character is: " + mostFrequentChar);

        // Print how many times the most frequent character appears
        System.out.println("It appears " + maxCount + " times.");
    }
}