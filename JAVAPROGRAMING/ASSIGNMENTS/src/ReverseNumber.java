/* *******************************************************
 * This program tales a number from the user, reverse it
 * and print it on the console.
 * Rodrigue Gaetan
 * date:01/01/1111
 * *******************************************************/
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number integer:");
        int numInt = new Scanner(System.in).nextInt();
        String number = Integer.toString(Math.abs(numInt)); // Do the absolute value so that negatives are ignore
        if(numInt < 0) System.out.print("-"); // handles negatives entries
        for(int i = number.length()-1; i >= 0; i--){
                System.out.print(number.charAt(i));
        }
    }
}
