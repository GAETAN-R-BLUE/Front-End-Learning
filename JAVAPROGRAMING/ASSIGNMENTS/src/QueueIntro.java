import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueIntro {
    public static void main(String[] args) {
        System.out.println("Enter the elements of your queue:");
        Queue<String> myQueue = new LinkedList<>(Arrays.asList(new Scanner(System.in).nextLine().split(" ")));// I do not know how I came up with this, but I surely did not use AI.
        System.out.println(myQueue);
        System.out.println(myQueue.remove());// remove and return the first element in m,y queue
        System.out.println(myQueue.element());
        System.out.println(false); // Check id the queue is empty and return a boolean expression
        System.out.println(myQueue.peek());  //Returns the first element in my queue without removing it
    }
}
