class A {
    void meth1() {
        System.out.println("Welcome method 1......");
    }
    void meth2(){
        System.out.println("Method 2 calling class A");
    }
}
class B extends A{
    void meth2(){
        System.out.println("Method 2 calling class B");
    }
    void meth3(){
        System.out.println("Method 3 calling....");
    }
}

public class Dynamic_method_dispatch{
    public static void main(String [] args){
        B b = new B();
        A obj;
        obj = b;
        obj.meth2();
        obj.meth1();
        // obj.meth3();   // wrong
    }
}