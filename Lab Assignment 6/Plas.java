import java.util.Scanner;

class Plastic2D {
    protected double length;
    protected double width;

    Plastic2D(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getCost() {
        return getArea() * 40;
    }
}

class Plastic3D extends Plastic2D {
    private double height;

    Plastic3D(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    public double getCost() {
        return getVolume() * 60;
    }
}

public class Plas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimensions of the plastic:");
        System.out.println("1. 2D Sheet");
        System.out.println("2. 3D Box");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the length and width of the sheet:");
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                Plastic2D plastic2D = new Plastic2D(length, width);
                System.out.println("The cost of the plastic sheet is: Rs." + plastic2D.getCost());
                break;
            case 2:
                System.out.println("Enter the length, width and height of the box:");
                length = sc.nextDouble();
                width = sc.nextDouble();
                double height = sc.nextDouble();
                Plastic3D plastic3D = new Plastic3D(length, width, height);
                System.out.println("The cost of the plastic box is: Rs." + plastic3D.getCost());
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        sc.close();
    }
}

