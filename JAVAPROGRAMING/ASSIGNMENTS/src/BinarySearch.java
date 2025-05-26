// tHIS PROGRAM PERFORM A BINARY SEARCH TO DETERMINE IF A NUMBER INPUT BY THE USER EXIST IN AN ARRAY
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        int[] inArray = {2, 4, 6, 8, 10, 11, 13, 15, 17, 19, 20, 22, 24, 26, 28, 30};
        System.out.println("Enter a number integer");  // PROMPTS THE USER FOR THE NUMBER
        int number = new Scanner(System.in).nextInt(); //Accepts the user input
        int result = -1;
        int lowerBound = 0;
        int upperBound = (inArray.length-1);
        while(lowerBound <= upperBound){
            int newBound = (lowerBound + upperBound) /2;
            if (number == inArray[newBound] ){
               System.out.println("The number's position is " + newBound );
               result = newBound;
               break;
           }
           if(number < inArray[newBound]){
               upperBound = newBound;
           }
           if (number > inArray[newBound]){
               lowerBound = newBound;
           }
        }
        System.out.println(result == -1 ? "Number not found." : "");
    }
}

