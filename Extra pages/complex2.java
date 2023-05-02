class complex{
    int real;
    int imaginary;
    public complex(int real, int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public complex2 add(complex c2){
        int sumreal = this.real + c2.real;
        int sumimg = this.imaginary + c2.imaginary;
        complex2 obj = new complex2(sumreal,sumimg);
        return obj;
    }

    public void display(){
        System.out.println("No is " + this.real + this.imaginary +"i" );
    }
}

public class complex2 {
    public int imaginary;
    public int real;

    public complex2(int sumreal, int sumimg) {
    }

    public static void main(String [] args){
        complex c1 = new complex(4,7);
        complex c2 = new complex(5,-9);
        complex2 sum = c1.add(c2);
        sum.display();
    }

   
}
