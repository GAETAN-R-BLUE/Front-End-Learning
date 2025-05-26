import java.util.Scanner;

public class PrimeNum2 {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer:");
        int number = new Scanner(System.in).nextInt();
        boolean isPrime =true;
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
              isPrime = false;
              break;
            }
        }
        if(isPrime){
            System.out.println(number + " is a prime number");
        }
        else{
            System.out.println(number + " is not a prime number");
        }
    }
}
