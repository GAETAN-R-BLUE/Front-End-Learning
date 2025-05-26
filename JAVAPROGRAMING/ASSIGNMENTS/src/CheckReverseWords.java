/* ************************************************************************
 * This program prompts the user for a word, and check if one word is the
 * reverse of the other. RGG
 * ************************************************************************/

import java.util.Scanner;

public class CheckReverseWords {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1 = userInput.nextLine().toLowerCase();
        System.out.println("Enter the second word");
        String word2 = userInput.nextLine().toLowerCase();
        String word3 = "";

        for (int i = word1.length() - 1; i >= 0; i--) {
            word3 += String.valueOf(word1.charAt(i));
        }
        System.out.println("are the the 2 words reverses? " + (word3.equals(word2)));
    }
}
