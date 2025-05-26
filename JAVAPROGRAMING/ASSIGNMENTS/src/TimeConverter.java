// This program get a total number of time in min, do a conversion
//in hours, min and display to the console.

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        System.out.println("Enter your total time in minutes:");
        Scanner input = new Scanner(System.in);
        int totalTime = input.nextInt();
        int timeInHour = (totalTime / 60);
        int timeInMinutes = ((totalTime % 60));

        if (timeInHour < 2) {
            System.out.println(totalTime + " minutes " + " is " + timeInHour + " hour and " + timeInMinutes + " minutes");
        } else {
            System.out.println(totalTime + " minutes " + " is " + timeInHour + " hours and " + timeInMinutes + " minutes");
        }
        input.close();
    }
}
