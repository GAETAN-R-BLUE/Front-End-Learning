import java.util.Scanner;
import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        System.out.println("Enter a list of fruits separated with a coma");
        Stack <String> fruits = new Stack<>();
        for (String fruit:new Scanner(System.in).nextLine().split(",")){
            fruits.push(fruit);
        }
        System.out.println(fruits);
        System.out.println(fruits.pop());
        System.out.println(fruits);
        System.out.println(fruits.peek());
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
    }
}
