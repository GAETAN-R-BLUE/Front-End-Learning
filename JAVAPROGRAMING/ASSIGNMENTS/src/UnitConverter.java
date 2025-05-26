import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("==== Unit Converter Menu ====");
            System.out.println("1. Kilometers to Miles");
            System.out.println("2. Miles to Kilometers");
            System.out.println("3. Kilograms to Pounds");
            System.out.println("4. Pounds to Kilograms");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter kilometers: ");
                    double km = scanner.nextDouble();
                    double miles = km * 0.621371;
                    System.out.println(km + " kilometers is " + miles + " miles.");
                    break;
                case 2:
                    System.out.print("Enter miles: ");
                    miles = scanner.nextDouble();
                    km = miles / 0.621371;
                    System.out.println(miles + " miles is " + km + " kilometers.");
                    break;
                case 3:
                    System.out.print("Enter kilograms: ");
                    double kg = scanner.nextDouble();
                    double pounds = kg * 2.20462;
                    System.out.println(kg + " kilograms is " + pounds + " pounds.");
                    break;
                case 4:
                    System.out.print("Enter pounds: ");
                    pounds = scanner.nextDouble();
                    kg = pounds / 2.20462;
                    System.out.println(pounds + " pounds is " + kg + " kilograms.");
                    break;
                case 5:
                    System.out.println("Exiting the converter. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1 and 5.");
            }

            System.out.println();

        } while (choice != 5);

        scanner.close();
    }
}