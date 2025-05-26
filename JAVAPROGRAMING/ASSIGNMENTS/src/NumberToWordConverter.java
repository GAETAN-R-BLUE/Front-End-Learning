import java.util.Objects;
import java.util.Scanner;

public class NumberToWordConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String response = "y";
        while (true) {
            System.out.println("Enter a positive integer between 0 and 99 ");
            int number = input.nextInt();
            String[] singleDigit = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            String[] doubleDigit1 = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
            String[] doubleDigit2 = {"Twenty", "thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String result = "";

            if (number < 10) {
                result = singleDigit[number];
            }
            if (number > 9 && number < 20) {
                result = doubleDigit1[number - 10];
            }
            if (number > 19) {
                int tenthDigit = (number / 10);
                int unitDigit = (number % 10);
                result = unitDigit > 0 ? doubleDigit2[tenthDigit - 2] + "-" + singleDigit[unitDigit] : doubleDigit2[tenthDigit - 2];
            }
            System.out.println(result);
            System.out.println("Would you like to continue? y/n");
            input.nextLine();
            response = input.nextLine();
            if (Objects.equals(response, "n")) {
                break;
            }
        }
    }
}

