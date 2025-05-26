import java.util.Scanner;
import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        System.out.println("Enter the list of you fruits separated with a coma:");
        String [] fruits = new Scanner(System.in).nextLine().split(",");

        Stack <String> myFirstStack = new Stack<String>();
        for(String fruit : fruits){
            myFirstStack.push(fruit);
        }
        System.out.println(myFirstStack + " is my initial tack");
        System.out.println(myFirstStack.peek());
        System.out.println(myFirstStack.push("Apple"));
        System.out.println(myFirstStack.empty());
        System.out.println(myFirstStack);
        System.out.println(myFirstStack.pop());
        System.out.println(myFirstStack.pop());
        System.out.println(myFirstStack);

    }
}
