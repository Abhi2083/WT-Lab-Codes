import java.util.Arrays;
import java.util.Scanner;

class NumberSorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the numbers separated by spaces: ");
        String numbersString = input.nextLine();
        input.close();
        String[] numbersArray = numbersString.split(" ");
        
        int[] numbers = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            numbers[i] = Integer.parseInt(numbersArray[i]);
        }
        
        Arrays.sort(numbers);
        
        System.out.print("Sorted numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
