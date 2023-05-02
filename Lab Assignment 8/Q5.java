abstract class Shape {
    public final void printName() {
        System.out.println("Name: Shape");
    }
}

class Rectangle extends Shape {
}

public class Q5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.printName();
    }
}
