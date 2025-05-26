import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        System.out.println("Enter your sentence:");
        String [] sentence = new Scanner(System.in).nextLine().split(" ");
        for (int i = sentence.length-1; i >= 0; i--){
            System.out.print(sentence[i] + " ");
        }
    }
}
