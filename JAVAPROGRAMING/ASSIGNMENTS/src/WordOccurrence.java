import java.util.HashMap;
import java.util.Scanner;

public class WordOccurrence {
    public static void main(String[] args) {
        System.out.println("Enter your sentence");
        String [] sentence = new Scanner(System.in).nextLine().toLowerCase().split(" ");
        HashMap <String , Integer > words  = new HashMap<>();

        for (String word :sentence){
           if (words.containsKey(word)){
               words.put(word, words.get(word)+1);
           }
           else {
               words.put(word, 1);
           }
        }
        System.out.println(words);
    }
}
