import java.util.Scanner;

class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void display() {
        System.out.println("The area of the circle is: " + getArea());
    }
}

class Square {
    private double side;

    Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public void display() {
        System.out.println("The area of the square is: " + getArea());
    }
}

class Triangle {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public void display() {
        System.out.println("The area of the triangle is: " + getArea());
    }
}

public class MenuArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of shape you want to calculate the area for: ");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                Circle circle = new Circle(radius);
                circle.display();
                break;
            case 2:
                System.out.println("Enter the side of the square: ");
                double side = sc.nextDouble();
                Square square = new Square(side);
                square.display();
                break;
            case 3:
                System.out.println("Enter the base and height of the triangle: ");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                Triangle triangle = new Triangle(base, height);
                triangle.display();
                break;
            default:
                System.out.println("Wrong choice!! Please recheck");
                break;
        }

        sc.close();
    }
}
