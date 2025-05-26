// This program check if a number is a palindrome

import java.util.Scanner;
public class palindromeNumber {
    public static void main(String[] args) {
        System.out.println("enter a positive number with at least 3 digit: ");
        String number =(new Scanner(System.in).nextLine());
        String newNumber = "";
        for( int i = number.length()-1; i >= 0; i-- ){
            newNumber += number.charAt(i);
        }
        if(number.equals(newNumber)){
            System.out.println(number + " is a palindrome");
        }
        else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
