/*****************************************************
 * This progran get a string from a user reverse it
 * Rodrigue Gaetan
 * 01/01/1234
 * ***************************************************/
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter your string:"); // prompts the user for a word to be reversed
        String userInput = new Scanner(System.in).nextLine();
        for(int i = userInput.length()-1 ; i >= 0 ; i--){
            System.out.print(userInput.charAt(i));
        }
    }
}
