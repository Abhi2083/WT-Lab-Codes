class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex c2) {
        double realSum = this.real + c2.real;
        double imaginarySum = this.imaginary + c2.imaginary;
        Complex result = new Complex(realSum, imaginarySum);
        return result;
    }

    public void display() {
        System.out.println("Result: " + this.real + " + " + this.imaginary + "i");
}
}
public class complex1 {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, -5);

        Complex sum = c1.add(c2);
        sum.display();
}
}
