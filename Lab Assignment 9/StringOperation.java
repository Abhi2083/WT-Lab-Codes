import java.util.*;

public class StringOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        
        String str1Upper = str1.toUpperCase();
        String str1Lower = str1.toLowerCase();
        System.out.println("Uppercase of first string: " + str1Upper);
        System.out.println("Lowercase of first string: " + str1Lower);

        
        StringBuilder str2Reverse = new StringBuilder(str2);
        str2Reverse = str2Reverse.reverse();
        System.out.println("Reverse of second string: " + str2Reverse);

        
        int comparison = str1.compareTo(str2);
        if (comparison == 0) {
            System.out.println("Both entered strings are equal.");
        } else if (comparison < 0) {
            System.out.println("The first string is smaller than the second string.");
        } else {
            System.out.println("The first string is greater than the second string.");
        }

        
        System.out.print("Enter position to insert second string into first string: ");
        int pos = sc.nextInt();
        String str1Insert = str1.substring(0, pos) + str2 + str1.substring(pos);
        System.out.println("New string after inserting second string into first string: " + str1Insert);

        sc.close();
    }
}
