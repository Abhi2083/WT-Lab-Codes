import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a shape: ");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("The area of the circle is: " + area(radius));
                break;
            case 3:
                System.out.println("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.println("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                System.out.println("The area of the triangle is: " + area(base, height));
                break;
            case 2:
                System.out.println("Enter the side of the square: ");
                double side = scanner.nextDouble();
                System.out.println("The area of the square is: " + area(side));
                break;
            default:
                System.out.println("Wrong choice.");
        }
    }

    public static double area(int radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static double area(double side) {
        return side * side;
    }
}
