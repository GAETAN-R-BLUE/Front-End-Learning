/* **************************************************************
 *  This programme prompts the user for the temperature in degree
 * Celsius, convert it in degree Fahrenheit and display the result
 * **************************************************************/
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the temperature level:");// prompts the user for the temperature
        double temperatureInF = scan.nextDouble(); // Using the scanner object to accept the user input

        /* Will be using the following to make my conversion easy to read.
        A = (temperatureInF - 32)*5 .....................................*/

        double A =((temperatureInF - 32) * 5);
        double temperatureInC = Math.round (A / 9);

        System.out.println("The temperature in degree celsius is: " + temperatureInC + "C");

        scan.close();
    }
}
