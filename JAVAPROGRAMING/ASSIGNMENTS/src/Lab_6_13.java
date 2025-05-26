/*----------------------------------------------------
 This program gets a list of integer from inputs, and
 * outputs non-negative numbers (integer) in ascending
 * order ( lowest to highest)
 * Rodrigue Gaetan 01/01/1111
 * ****************************************************/
import java.util.Arrays;
import java.util.Scanner;

public class Lab_6_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter all you numbers");
        String numbers = input.nextLine();

        String[] array = numbers.split(" "); // splitting the string into an array
        System.out.println();

//        int [] newArray = new int[array.length];
//        for(int i = 0; i < array.length; i ++) {
//            newArray[i] = Integer.parseInt(array[i]);
//        }
//        Arrays.sort(newArray);
        for(int i = 0; i < array.length; i ++){
            int number = Integer.parseInt(array[i]);
            if (number >= 0 ) {
                System.out.print( number + " ");
            }
        }
        input.close();
    }
}
