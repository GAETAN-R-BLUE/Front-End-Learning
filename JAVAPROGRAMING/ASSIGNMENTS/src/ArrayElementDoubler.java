/* *****************************************************************
 * This program prompts the user for a list of number using an array
 * and display the double of the array
 * *****************************************************************/

import java.util.Scanner;

public class ArrayElementDoubler {
    public static void main(String[] args) {
        System.out.println("Enter the element of your array separated with the space");
        String[] numberInArray = new Scanner(System.in).nextLine().split(" ");
        int[] number = new int[numberInArray.length];
        System.out.println("The updated Array is ");
        for (int i = 0; i < numberInArray.length; i++) {
            number[i] = (2 * Integer.parseInt(numberInArray[i]));
            System.out.print(number[i] + " ");
        }
    }
}
