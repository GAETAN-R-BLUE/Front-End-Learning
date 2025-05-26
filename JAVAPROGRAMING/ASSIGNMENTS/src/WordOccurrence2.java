import java.util.HashMap;
import java.util.Scanner;

public class WordOccurrence2 {
    public static void main(String[] args) {
        System.out.println("Enter your sentence here: ");
        String[] userInput = new Scanner(System.in).nextLine().split(" ");
        HashMap<String, Integer> words = new HashMap<>();

        for (String word : userInput) {
            // If the word is already in the map, increment its count; otherwise, add it with count 1
            words.put(word, words.getOrDefault(word, 0) + 1);
        }
        // Optionally, print the results
        for (String key : words.keySet()) {
            System.out.println(key + ": " + words.get(key));
        }
    }
}
