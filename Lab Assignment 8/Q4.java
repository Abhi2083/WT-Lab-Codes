abstract class Shape {
    public void printArea() {
        System.out.println("Area: ");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Shape shape = new Shape() {
            public void printArea() {
                System.out.println("Area: 100 sq units");
            }
        };
        shape.printArea();
    }
}
