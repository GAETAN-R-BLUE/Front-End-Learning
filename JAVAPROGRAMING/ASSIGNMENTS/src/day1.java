
import java.util.Scanner;

/*************************************************
 * This program is my first daily challenge from ChatGPT
 * Rodrigue Gaetan
 * 01/01/1998
 **************************************************/

public class day1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: "); // Prompt user for name
        String name = scan.nextLine(); // Accepts full name input

        System.out.print("Enter your age: "); // Prompt user for age
        int age = scan.nextInt();

        // Display how old the user will be in 5 years
        System.out.println("Hello " + name + ", in 5 years you will be " + (age + 5) + " years old.");

        scan.close(); // Close scanner to prevent resource leak
    }
}