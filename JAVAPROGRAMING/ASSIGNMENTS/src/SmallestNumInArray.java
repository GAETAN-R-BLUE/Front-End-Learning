import java.util.Scanner;

public class SmallestNumInArray {
    public static void main(String[] args) {
        System.out.println("Enter your integer separated with a come: Example: 1,2,3,4 etc..");
        String[] userInput = new Scanner(System.in).nextLine().split(",");
        int[] numbers = new int[userInput.length];

        int smallest = Integer.parseInt(userInput[0]);
        for (int i = 0; i < userInput.length; i++) {
            numbers[i] = Integer.parseInt(userInput[i]);
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest in your array is :" + smallest);
    }
}
