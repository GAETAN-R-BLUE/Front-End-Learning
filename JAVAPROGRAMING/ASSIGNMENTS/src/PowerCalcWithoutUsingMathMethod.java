import java.util.Scanner;

public class PowerCalcWithoutUsingMathMethod {
    public static void main(String[] args) {
        System.out.println("Enter the base and the exponent separated with space");
        String[] numbers = new Scanner(System.in).nextLine().split(" ");
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        System.out.println();
        System.out.println(num1 + "to the power of " + num2 + " is " + power(num1, num2));
    }

    public static double power(double num1, double num2) {
        double result = 1;
        for (double i = 0; i < num2; i++) {
            result *= num1;
        }
        return result;
    }
}
