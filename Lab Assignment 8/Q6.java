abstract class Shape {
    public static void printInfo() {
        System.out.println("This is a Shape");
    }
}

class Rectangle extends Shape {
}

public class Q6{
    public static void main(String[] args) {
        Shape.printInfo();
    }
}

