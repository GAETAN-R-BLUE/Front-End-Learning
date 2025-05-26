// This program finds the largest number in an array

import java.util.Scanner;

public class ArrayLargest {
    public static void main(String[] args) {
        System.out.println("Enter you numbers separated with space:");
        String [] userInput = new Scanner(System.in).nextLine().split(" ");

        int largest = Integer.parseInt(userInput[0]);
        for (String number: userInput){
            int currentNum = Integer.parseInt(number);
            if(currentNum > largest){
                largest = currentNum;
            }
        }
        System.out.println("The largest number is: " + largest);
    }
}
