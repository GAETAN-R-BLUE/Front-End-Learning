import java.util.Scanner;

/* **************************************************************
 * The following program check for a unique character in a word
 * Name: Rodrigue Gaetan Gansob
 * Date: 01/01/1998
 * **************************************************************/
public class UniqueCharacterChecker {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        String input = new Scanner(System.in).nextLine();
        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
        }
    }
}
