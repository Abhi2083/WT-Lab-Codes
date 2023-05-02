abstract class Student {
    int rollNo;
    String regNo;

    public Student(int rollNo, String string) {
        this.rollNo = rollNo;
        this.regNo = string;
    }

    public abstract void course();
}
class KiiTian extends Student {
     KiiTian(int rollNo, String string) {
        super(rollNo, string);
    }

    public void course() {
        System.out.println("I am a KiiTian and my course is Computer Science Engineering");
    }
}

public class Q1 {
    public static void main(String[] args) {
        KiiTian kiiTian = new KiiTian(101, "2105101");

        System.out.println("Roll No: " + kiiTian.rollNo);
        System.out.println("Reg No: " + kiiTian.regNo);
        kiiTian.course();
    }
}

