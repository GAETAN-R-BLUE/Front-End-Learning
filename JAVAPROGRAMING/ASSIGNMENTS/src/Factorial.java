import java.util.Scanner;

/* ************************************************************
 * This program get a number from the user input, Calculate
 * the factorial and display the result
 * Name: Rodrigue Gaetan
 * Date Modified: 01/01/1111
 * ************************************************************/
public class Factorial {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter your number: ");
            int number = new Scanner(System.in).nextInt();
            if (number <= 0) {
                System.out.println("Invalid entry");
            } else {
                long numFactorial = 1;
                for (int i = 1; i <= number; i++) {
                    numFactorial *= i;
                }
                System.out.println(number + "! is: " + numFactorial);
                break;
            }
        }
    }
}
