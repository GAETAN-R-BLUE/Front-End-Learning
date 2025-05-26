import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a list of numbers separated with a coma: ");
        String [] userInput = new Scanner(System.in).nextLine().split(",");
        int [] numbers = new int[userInput.length];
        for (int i =0; i < numbers.length; i++){
            int currNumber =numbers[0];
            numbers [i] = Integer.parseInt(userInput[i]);
            if(currNumber <= numbers[i]){
                System.out.println(currNumber);
            }
        }

    }
}
