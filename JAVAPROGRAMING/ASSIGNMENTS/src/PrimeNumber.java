import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        while (true){ int count = 0;
            System.out.println("Enter a number");
            int number = new Scanner(System.in).nextInt();
            if (number <= 0){
                System.out.println("incorrect entry, try again");
            }
            else {
                for(int i = 1; i <= number; i++){ // counts how many times the number can be divisible
                    if (number % i == 0){
                        count++;
                    }
                }
                if(count == 2){
                    System.out.println(number + " is a prime number"); // if the count is equals to 2, it is a prime number
                }
                else {
                    System.out.println(number + " is not a prime number"); //if it is more than 2, it is not a prime number
                }
                break;
            }
        }
    }
}
