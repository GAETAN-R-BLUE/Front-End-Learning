/* ****************************************************************
 * This program is a simple time implementation for practice
 * ****************************************************************/

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class SimpleTimer {
    public static void main(String[] args) {
        // Prompt the user to enter the number of seconds for the countdown
        System.out.println("Enter the number of second:");
        int timeInSecond = new Scanner(System.in).nextInt();

        // Create a Timer object to handle the timing functionality
        Timer newTimer = new Timer();

        // Create a TimerTask object that defines what happens at each tick
        TimerTask newTask = new TimerTask() {
            int count = timeInSecond; // Set the initial countdown value

            @Override
            public void run() {
                // Print the current count
                System.out.println(count);
                count--; // Decrement the count

                // When count is less than zero, stop the timer and print "The time is up"
                if (count < 0) {
                    System.out.println("The time is up");
                    newTimer.cancel();
                }
            }
        };

        // Schedule the task to run at a fixed rate (every 1000ms or 1 second)
        newTimer.scheduleAtFixedRate(newTask, 0, 1000);
    }
}
