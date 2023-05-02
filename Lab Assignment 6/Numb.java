import java.util.Scanner;

class Number {
    private int[] numbers;

    Number(int n) {
        numbers = new int[n];
    }

    public void read() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter " + numbers.length + " integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        sc.close();
    }

    public void swap() {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }

        int temp = numbers[minIndex];
        numbers[minIndex] = numbers[maxIndex];
        numbers[maxIndex] = temp;
    }

    public void display() {
        System.out.print("Swapped array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

public class Numb{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of integers: ");
        int n = sc.nextInt();

        Number number = new Number(n);
        number.read();
        number.swap();
        number.display();

        sc.close();
    }
}