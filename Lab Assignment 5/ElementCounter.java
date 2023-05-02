import java.util.HashMap;
import java.util.Scanner;

public class ElementCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the numbers separated by spaces: ");
        String numbersString = input.nextLine();
        
        String[] numbersArray = numbersString.split(" ");
        
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < numbersArray.length; i++) {
            int number = Integer.parseInt(numbersArray[i]);
            
            if (counts.containsKey(number)) {
                counts.put(number, counts.get(number) + 1);
            } else {
                counts.put(number, 1);
            }
        }
        
        System.out.println("Number of occurrences of each number:");
        for (int number : counts.keySet()) {
            System.out.println(number + " - " + counts.get(number));
        }
    }
}
