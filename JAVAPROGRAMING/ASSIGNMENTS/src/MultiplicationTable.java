import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        System.out.println("The Multiplication Table for " + number );
        for(int i = 1; i <= 10 ; i++){
            System.out.println( number +"x" + i + "= "+ (number * i));
        }
    }
}
