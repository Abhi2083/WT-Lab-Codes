class Base {
    private int num;

    public Base(int num) {
        this.num = num;
        System.out.println("Base class constructor with parameter num=" + num);
    }

    public int getNum() {
        return num;
    }
}

class Derived extends Base {
    private String str;

    public Derived(int num, String str) {
        super(num); 
        this.str = str;
        System.out.println("Derived class constructor with parameters num=" + num + " and str=" + str);
    }

    public String getStr() {
        return str;
    }
}

public class Parameterized {
    public static void main(String[] args) {
        Derived derived = new Derived(123, "Hello");
        System.out.println("Derived class num=" + derived.getNum() + " str=" + derived.getStr());
    }
}


