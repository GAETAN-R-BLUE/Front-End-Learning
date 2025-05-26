/* ***********************************************************
 * Asks the user to enter a positive integer n.
 * Calculates the sum of all natural numbers from 1 to n.
 * Displays the result.
 * ***********************************************************/

import java.util.Scanner;

public class sumOfNaturalNum {
    public static void main(String[] args) {
        System.out.println(" Enter a positive integer ");
        int number = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
