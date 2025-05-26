import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        System.out.println("Enter a number an the exponent separated with space");
        String[] numbers = new Scanner(System.in).nextLine().split(" ");
        double num1 = Double.parseDouble(numbers[0]);
        double num2 = Double.parseDouble(numbers[1]);

        System.out.println(num1 + " to the power of " + num2 + " is " + power(num1, num2));
    }

    public static double power(double numb1, double num2) {
        return Math.pow(numb1, num2);
    }
}
