import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        input.close();
        
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        
        System.out.println("The largest number is " + largest);
    }
}
