abstract class figure{
    double dim1;
    double dim2;
    figure(double a, double b){
        dim1 = a; 
        dim2 = b;
    }
    abstract double area();
}

class Rectangle extends figure{
    Rectangle(double a , double b){
        super(a,b);
    }
    double area(){
        System.out.println("Area of Rectangle is ");
        return dim1*dim2;
    }
}
class Triangle extends figure{
    Triangle(double a , double b){
        super(a,b);
    }
    double area(){
        System.out.println("Area of Triangle is ");
        return (dim1*dim2)/2;
    }
}

public class findArea {
    public static void main(String [] args){
        Rectangle r = new Rectangle(20 , 30);
        Triangle t = new Triangle (5 , 4);
        figure fig;   
        fig = r;
        System.out.println("Rect Area :- " + fig.area());
        
        fig = t;
        System.out.println("Triangle area :- " + fig.area());
        
    }
}
