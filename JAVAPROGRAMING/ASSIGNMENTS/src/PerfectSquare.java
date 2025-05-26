/* *****************************************************
 * This program check if a given number is a perfect
 * square: Rodrigue Gaetan
 * 01/01/1111*******************************************/
import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer:"); // prompts the user for a positive integer
        int userInput = new Scanner(System.in).nextInt(); // accept the user input

        double rootNumber = Math.sqrt( new Scanner(System.in).nextInt()); // Calculate the root of the number using a Math method
        if(rootNumber % 1 == 0){
            System.out.println(userInput + " is a perfect square");
        }
        else {
            System.out.println(userInput + " is not a perfect square");
        }
    }
}
