/******************************************************
 * This program prompts the user for a sentence, counts
 * the number of vowels in the sentence and display the
 * vowels count to the console.-----------------------
 * 01/01/1111, Rodrigue Gaetan Gansob
 * ****************************************************/
import java.util.Scanner;
public class CharacterCounts {
    public static void main(String[] args) {
        System.out.println("Type in your sentence");
        String userInput = new Scanner(System.in).nextLine().replaceAll("[^a-zA-Z0-9\\s]","").replace(" ","").toLowerCase();
        int count = userInput.length();
        int vowCount = 0;
      for (int i = 0; i < userInput.length(); i++){
          if(userInput.charAt(i) == 'a' ||userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i'||userInput.charAt(i) == 'o'||userInput.charAt(i) == 'u' ){
            count--;
            vowCount++;
          }
      }
        System.out.println("your sentence has "+ count + " consonants and " + vowCount + " vowels" );
    }
}
