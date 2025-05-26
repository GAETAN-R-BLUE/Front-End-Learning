/* ************************************************
 * This program gets a set of number from the user
 * and calculate the average, prints out average
 * and the largest in the set._____________________
 * Rodrigue Gaetan 01/01/1111
 * ************************************************/
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment6_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner object to accept user input
        ArrayList<Double>numbers = new ArrayList<Double>(); // Declaring a new array list

        System.out.println("Enter the size of your list:"); // Prompts the user for the size of the array
        int size = input.nextInt();  // Accepting the user input

        /* The following loop ask the user to enter all the elements of the array
         * and adding them in the list++++++++++++++++++++++++++++++++++++++++++*/

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Number " + (i + 1));
            double num = input.nextInt();
            numbers.add(num);

        }
        double sum = 0;  // sum variable
        double largest = numbers.get(0);

        /* The following loo goes through my array list a pull the largest and
         * calculates the sum of the list */


        for (int j = 0; j < numbers.size(); j++){
        sum += numbers.get(j);
        if (largest < numbers.get(j)){
          largest = numbers.get(j);
        }
        }
        System.out.println("The average of your list is: " + (sum/ numbers.size()));
        input.close();
        System.out.println("The largest element of your list is: " + largest);
    }
}

