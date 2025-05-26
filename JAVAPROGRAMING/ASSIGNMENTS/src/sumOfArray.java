import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        System.out.println("Enter the elements of your array separated with space");
        String[] userInput = new Scanner(System.in).nextLine().split(" ");
        int sumArray = 0;
        for (int i = 0; i < userInput.length; i++) {
            sumArray += Integer.parseInt(userInput[i]);
        }
        System.out.println("The sum of the element of the array is " + sumArray);
    }
}
