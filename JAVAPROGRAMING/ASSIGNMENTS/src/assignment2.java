
import java.util.Scanner;
public class assignment2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The amount to be changed:");
        int amount = scan.nextInt();
        if( amount <= 0){
            System.out.println("No change:");
        }
        else {
            int dollarCount = (amount/100);
            int quarterCount = ((amount % 100) / 25);
            int dimeCount = ((amount % 100) % 25 / 10);
            int nickelCount = ((((amount % 100) % 25) % 10) / 5);
            int pennieCount = ((((amount % 100) % 25) % 10) % 5) ;

            if(dollarCount <= 1){
                System.out.println(dollarCount + " Dollar");
            } else {
                System.out.println(dollarCount + " Dollars");
            }
            if(quarterCount <= 1){
                System.out.println(quarterCount + " Quarter");
            } else {
                System.out.println(quarterCount + " Quarters");
            }
            if(dimeCount <= 1){
                System.out.println(dimeCount + " Dime");
            } else {
                System.out.println(dimeCount + " Dimes");
            }
            if(nickelCount <= 1){
                System.out.println(nickelCount + " Nickel");
            } else {
                System.out.println(nickelCount + " Nickels");
            }
            if(pennieCount <= 1){
                System.out.println(pennieCount + " Penny");
            } else {
                System.out.println(pennieCount + " Pennies");
            }
//            System.out.println(dollarCount + " Dollars");
//            System.out.println(quarterCount + " Quarter");
//            System.out.println(dimeCount + " Dime");
//            System.out.println(nickelCount + " Nickels");
//            System.out.println(pennieCount + " Pennies");
        }

    }
}

