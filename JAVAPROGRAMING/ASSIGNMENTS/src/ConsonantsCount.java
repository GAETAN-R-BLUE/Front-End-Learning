
/* ************************************************************
 * this program counts the number of consonants in a sentence
 * date: 01/01/1111
 * ************************************************************/

import java.util.Scanner;

public class ConsonantsCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object to accept the user input

        System.out.println("Enter your sentence: ");
        String sentence = input.nextLine(); // Accepting the user input
        String sentenceToCount = sentence.toLowerCase();

        int count = sentence.length();
        for (int i = 0; i < sentence.length(); i++) {
            char character = sentenceToCount.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == ' ') {
                count -= 1;
            }
        }
        System.out.println("Your sentence has: " + count + " consonants and " + (sentence.length() - count - 1) + " vowels");
        input.close();
    }
}
