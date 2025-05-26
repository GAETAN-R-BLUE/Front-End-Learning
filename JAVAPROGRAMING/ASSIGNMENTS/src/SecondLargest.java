// This program finds the second largest in an array
import java.util.Scanner; // Scanner object to accept user input
public class SecondLargest {
    public static void main(String[] args) {
        System.out.println("Enter your  numbers separated by space:");
        String [] numbers = new Scanner(System.in).nextLine().split(" ");
        int largest =Integer.parseInt(numbers[0]);
        int secLargest = Integer.parseInt(numbers[0]);

        for (int i = 0; i < numbers.length; i++){
            if( Integer.parseInt(numbers[i]) > largest) {
                secLargest = largest;  // setting the seccond largest equals to the largest
                largest = Integer.parseInt(numbers[i]);
            }
                else if (Integer.parseInt(numbers[i]) > secLargest && Integer.parseInt(numbers[i]) != largest) {
                    secLargest = Integer.parseInt(numbers[i]);  //Integer.parseInt(numbers[i-1]);
                }
            }
        System.out.println("The Second largest is: " + secLargest);
        }
    }

