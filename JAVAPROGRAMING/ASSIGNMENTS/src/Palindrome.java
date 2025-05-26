/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 This program checks whether a given string is a palindrome. It uses
 replaceAll to remove all special characters, replaces whitespace, and
  converts the string to lowercase. A for loop is then used to reverse
  the string and compare it to the original, determining if the input
  is a palindrome.
 *************************************************************************/
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter your sentence"); // prompts the user for the sentence input

       // Accepts the user input.
        String  sentence = new Scanner(System.in).nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9 ]","").replace(" ","");
        System.out.println("Your sentence without special character and space:");
        System.out.println(sentence);
        String newSentence = "";
        for (int i = sentence.length()-1; i >= 0; i--){
            newSentence += sentence.charAt(i);
        }
        System.out.println(newSentence);
        if (newSentence.equals(sentence)){
            System.out.println(sentence + " is a palindrome");
        }
        else {
            System.out.println(sentence + " is not a palindrome");
        }
    }
}


