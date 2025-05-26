// This program counts how many words are in a sentence
import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        System.out.println("Type your full sentence");
        System.out.println("your sentence has " + new Scanner(System.in).nextLine().split(" ").length + " words");
    }
}
