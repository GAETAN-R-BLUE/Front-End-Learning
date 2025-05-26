import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Enter 2 positive integer separated with a comma");
        String [] userInput = new Scanner(System.in).nextLine().split(",");
        int num1 = Integer.parseInt(userInput[0]);
        int num2 = Integer.parseInt(userInput[1]);

        while (num2 != 0){
            int divisor = num1 % num2;
            num1 = num2;
            num2 = divisor;

        }
        System.out.println("The greatest common divisor between "+ Integer.parseInt(userInput[0]) + " and " + Integer.parseInt(userInput[1]) + " is " + num1 );
    }
}
