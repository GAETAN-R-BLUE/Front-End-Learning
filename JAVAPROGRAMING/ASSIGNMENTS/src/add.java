import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        num1 += 3;
        System.out.println(num1);
    }
}
