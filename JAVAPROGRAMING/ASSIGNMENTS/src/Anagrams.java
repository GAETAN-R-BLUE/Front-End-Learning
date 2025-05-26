// This program checks if two user-provided words are anagrams by comparing their sorted character arrays.
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println("Enter the 2 word");
    String word1 = new Scanner(System.in).next().toLowerCase();  // getting the 1rst word from the user
    String word2 = new Scanner(System.in).next().toLowerCase(); // getting the second word from the user
        if (word1.length() != word2.length()) {
            System.out.println(word1 + " and " + word2 + " are not Anagrams"); // in case the lenght of the 2 words are different, quit
            return;
        }
    char [] lowWord1 = word1.toCharArray(); // convert the String to a character array
    char [] lowWord2 = word2.toCharArray(); // convert the second string to a character array

        Arrays.sort(lowWord1); // sorts the characters in alphabetical order
        Arrays.sort(lowWord2); // sort the second array in alphabetical order

        // The following directly compare the elements of the array and display the message accordingly
        if( Arrays.equals(lowWord1, lowWord2)){
            System.out.println( word1 + " and " + word2 + " are Anagram");
        }
        else{
            System.out.println( word1 + " and " + word2 + " are not Anagram");
        }
    }
}
