import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class FizzBuzzEnhanced {
    public static void main(String[] args) {
        System.out.println(" Enter the multiples, the word to print for each multiple, and the last number in the range. Example: '3 fizz 5 buzz 4 fuzz 40");
        String[] userInput = new Scanner(System.in).nextLine().split(" ");
        //String[] userInput = "3 fizz 5 buzz 4 fuzz 40".split(" ");

        HashMap<Integer, String> elements = new HashMap<>();
        for (int i = 0; i < userInput.length - 1; i += 2) {

            elements.put(Integer.parseInt(userInput[i]), userInput[i + 1]);
        }
        TreeMap<Integer, String> rules = new TreeMap<>(elements);
        for (int i = 1; i <= Integer.parseInt(userInput[userInput.length - 1]); i++) {
            StringBuilder result = new StringBuilder();
            for (Map.Entry<Integer, String> entry : rules.entrySet()) {

                if (i % entry.getKey() == 0) {
                    result.append(entry.getValue());
                }
            }
            System.out.println(result.length() > 0 ? result : i);
        }
    }
}
