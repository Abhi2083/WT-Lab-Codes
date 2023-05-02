abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }
}
class Student extends Person{

    public Student(String name) {
        super(name);
    }
    
}

public class Q3 {
    public static void main(String[] args) {
        Person p = new Student("Abhi");
        p.printName();
    }
}
