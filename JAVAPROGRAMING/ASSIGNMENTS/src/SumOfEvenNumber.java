/* ************************************************************************
 * This program calculate the sum of even number buy checking if the number
 * entered by the user is even or not by using the modulo, and then
 * add all the even number in the for look when the condition is true.
 * This program was written by Rodrigue Gaetan Gansob
 * ************************************************************************/

import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        System.out.println("Enter a list of number separated with a coma");
        String[] number = new Scanner(System.in).nextLine().split(",");

        int sumOfEvenNum = 0;

        for (int i = 0; i < number.length; i++) {
            //Parse each number from my input array and,check if the current number is even
            if (Integer.parseInt(number[i]) % 2 == 0) {
                // If even, add it to the num of all the even number.
                sumOfEvenNum += Integer.parseInt(number[i]);
            }
        }
        // Return the sum of all the even number.
        System.out.println("The sum of all the even number is: " + sumOfEvenNum);
    }
}
