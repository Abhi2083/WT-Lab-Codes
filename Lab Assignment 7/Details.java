class Account {
    int acc_no;
    float balance;

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    int aadhar_no;

    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp();
    }
}

public class Details {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        
        persons[0] = new Person();
        persons[0].name = "John";
        persons[0].aadhar_no = 123456789;
        persons[0].acc_no = 1001;
        persons[0].balance = 5000;
        
        persons[1] = new Person();
        persons[1].name = "Sarah";
        persons[1].aadhar_no = 234567890;
        persons[1].acc_no = 1002;
        persons[1].balance = 10000;
        
        persons[2] = new Person();
        persons[2].name = "David";
        persons[2].aadhar_no = 345678901;
        persons[2].acc_no = 1003;
        persons[2].balance = 7500;
        
        persons[3] = new Person();
        persons[3].name = "Jane";
        persons[3].aadhar_no = 456789012;
        persons[3].acc_no = 1004;
        persons[3].balance = 3000;
        
        persons[4] = new Person();
        persons[4].name = "Michael";
        persons[4].aadhar_no = 567890123;
        persons[4].acc_no = 1005;
        persons[4].balance = 20000;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Person " + (i+1) + " Details:");
            persons[i].disp();
            System.out.println();
        }
    }
}
