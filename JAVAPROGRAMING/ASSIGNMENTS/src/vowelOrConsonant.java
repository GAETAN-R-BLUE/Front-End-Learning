import java.util.Scanner;

public class vowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Enter an alphabetical character");
        String character = new Scanner(System.in).nextLine().toLowerCase();

        if (character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o") || character.equals("u")) {
            System.out.println(character + " is a vowel");
        } else {
            System.out.println(character + " is a consonant");
        }
    }
}
