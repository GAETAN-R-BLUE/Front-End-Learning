/* =====================================================================
This program used the scanner object to accept two number from the user,
and prints out the sum of the 2 numbers, their difference, their product
and their quotient.=====================================================
Rodrigue Gaetan 01/01/111===============================================
* ******************************************************************** */

import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers"); // prompt the user to enter the 2 numbers
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        double sum = (x + y);  // Calculate the sum
        double diff =(x - y);  // Calculate the difference
        double product = (x * y); // Calculate the product

        System.out.println("The sum of x and y: "+ sum);  // Display the sum
        System.out.println("The difference of x and y: "+diff); // Display the difference
        System.out.println("The product of x and y: " + product); // Display the product
        if(y == 0){
            System.out.println("Division by 0 is impossible"); // Handle the division by 0, and display a message
        }
        else {
            double quotient = (x / y);
            System.out.println("The quotient of x/y: "+ quotient); // Display the quotient
        }
        scan.close();
    }
}
