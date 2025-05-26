import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        System.out.println("Enter you sentence here:");
        String userInput = new Scanner(System.in).nextLine();
        String sentence = userInput.toLowerCase();
        boolean pangramString = false;

        for(char alphabet = 'a'; alphabet <= 'z'; alphabet++ ){
            if (sentence.indexOf(alphabet) == -1){
                pangramString = false;
            }
            break;
        }
        if (pangramString == false){
            System.out.println("Your sentence is not a pangram");
        }
        else {
            System.out.println("Your sentence is not a pangram");
        }

    }
}
