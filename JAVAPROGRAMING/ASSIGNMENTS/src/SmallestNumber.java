/* *****************************************************************
 * This program ask the user for 3 numbers and compares them to find the
 * smallest, then display the smallest to the end user.
 * Date: 01/01/1111
 * ********************************************************************/
import java.util.Scanner; // Importing the scanner object

public class SmallestNumber {
    public static void main(String[] args) {

        System.out.println("Enter your number integer separated with coma:"); // Prompts the user for the numbers
        String [] userInput = new Scanner(System.in).nextLine().split(",");
        int smallest = Integer.parseInt(userInput[0]);
        for(int i=0; i < userInput.length; i++){
            int currentNum = Integer.parseInt(userInput[i]);
            if(currentNum < smallest){
                smallest = currentNum;
            }
        }
        System.out.println("The smallest number in you array is:" + smallest);
    }
}
