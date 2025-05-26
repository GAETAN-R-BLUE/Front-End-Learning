/* *********************************************************
 * This program get a series of numbers, calculate the sum
 * and then display their average
 * Date:01/01/1111
 * Rodrigue
 * ********************************************************/
import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        System.out.println("Enter the series of your numbers separated with space:");
        String [] numberArray = new Scanner(System.in).nextLine().split(" ");
        double sum = 0;
        for(String number : numberArray){
            sum += Double.parseDouble(number);
        }
        System.out.println("The average of your number is: " + (sum/(numberArray.length)));
    }
}
