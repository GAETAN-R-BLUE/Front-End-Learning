import java.util.Scanner;

public class AverageOddNumb {
    public static void main(String[] args) {
        System.out.println("Enter a list of integers separated with space:");
        String[] userInput = new Scanner(System.in).nextLine().split(" ");

        int sumOfOdd = 0;
        int count = 0;

        for (int i = 0; i < userInput.length; i++) {
            int number = Integer.parseInt(userInput[i]);
            if (number % 2 != 0) {
                sumOfOdd += number;
                count++;
            }
        }
        if (count > 0) {
            double average = (double) sumOfOdd / count;
            System.out.println("The average of all the odd numbers is: " + average);
        } else {
            System.out.println("No odd numbers found.");
        }
    }
}