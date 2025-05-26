import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("Enter a positive integer:");
        int userInput = new Scanner(System.in).nextInt();

        for (int i = 1; i <= userInput; i++) {
            String result = "";
            if (i % 3 == 0) {
                result += "FIZZ";
            }
            if (i % 5 == 0) {
                result += "BUZZ";
            }
            System.out.println(result.isBlank() ? i : result);
        }
    }
}
