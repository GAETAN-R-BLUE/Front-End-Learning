// this program find the largest number out of 3 given by the user.
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("Enter your 3 number separated by space:");
        String [] numbers = new Scanner(System.in).nextLine().split(" ");
        int largest =Integer.parseInt(numbers[0]);
        for (int i = 0; i < numbers.length; i++){
            if(largest < Integer.parseInt(numbers[i])){
                largest = Integer.parseInt(numbers[i]);
            }
        }
        System.out.println("The largest is: " + largest);
    }
}
