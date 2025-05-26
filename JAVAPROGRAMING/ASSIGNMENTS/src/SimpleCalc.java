//This program is a simple calculator
import java.util.Scanner;
public class SimpleCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers and hit Enter:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println("Select and operation to be perform:\n");
        System.out.println("1. Addition (+)");
        System.out.println("2. Addition (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/) \n");
        int selection = input.nextInt();
        double result;
        if (selection == 1){
        result = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
        }
         else if (selection == 2){
            result = num1 - num2;
            System.out.println("The difference  of " + num1 + " and " + num2 + " is " + result);
        }
        else if (selection == 3){
            result = num1 * num2;
            System.out.println("The product of " + num1 + " and " + num2 + " is " + result);
        }
        else {
            if(num2 == 0){
                System.out.println("Division by 0 is impossible");
            }
            else {
                result = num1 / num2;
                System.out.println("The division of " + num1 + " by " + num2 + " is " + result);
            }
        }
    }
    public static void add(int numa, int numb){
        int result = numa + numb;
        System.out.println(result);
    }
}

