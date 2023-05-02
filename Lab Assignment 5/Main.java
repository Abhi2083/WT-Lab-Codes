class Calculator {
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public int subtract(int a, int b, int c) {
        return a - b - c;
    }
    
    public double subtract(double a, double b, double c) {
        return a - b - c;
    }
}

 class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result1 = calc.subtract(10, 5);
        System.out.println("10 - 5 = " + result1);

        double result2 = calc.subtract(7.5, 2.5);
        System.out.println("7.5 - 2.5 = " + result2);

        int result3 = calc.subtract(15, 7, 3);
        System.out.println("15 - 7 - 3 = " + result3);

        double result4 = calc.subtract(10.5, 3.5, 1.5);
        System.out.println("10.5 - 3.5 - 1.5 = " + result4);
    }
}
