
import java.util.HashMap;
import java.util.Scanner;

/* ****************************************************************
 * This program counts how many times a word appears in a sentence
 * Date: 01/01/0101
 * ****************************************************************/
public class OccurrenceWord {
    public static void main(String[] args) {

        System.out.println("Enter you sentence: ");
        String [] words = new Scanner(System.in).nextLine().split(" "); // Split the sentence into words

        HashMap  <String,Integer> sentenceMap = new HashMap<>();

        for( String word : words) {
            if (sentenceMap.containsKey(word)){
                sentenceMap.put( word, sentenceMap.get(word ) +1);
            }
            else {
                sentenceMap.put( word, 1 );
            }
        }
        System.out.println(sentenceMap);
    }
}
