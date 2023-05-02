class Shape {
    double area;

    public void showArea() {
        System.out.println("Area of the shape is :- " + area);
    }
}

class Circle extends Shape {
    double radius;

    public void calculateArea() {
        area = 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    public void calculateArea() {
        area = length * breadth;
    }
}

public class Area {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5.7;
        c.calculateArea();
        c.showArea();

        Rectangle r = new Rectangle();
        r.length = 110;
        r.breadth = 20;
        r.calculateArea();
        r.showArea();
    }
}
