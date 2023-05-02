import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private double cgpa;
    
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        this.rollNo = sc.nextInt();
        System.out.print("Enter name: ");
        this.name = sc.next();
        System.out.print("Enter CGPA: ");
        this.cgpa = sc.nextDouble();
    }
    
    public void displayDetails() {
        System.out.println("Roll Number: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("CGPA: " + this.cgpa);
    }
    
    public double getCGPA() {
        return this.cgpa;
    }
    
    public String getName() {
        return this.name;
    }
    
}

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i+1) + ":");
            students[i] = new Student();
            students[i].setDetails();
        }
        

        System.out.println("\nDetails of all students:");
        for (int i = 0; i < n; i++) {
            students[i].displayDetails();
            System.out.println();
        }
        
     
        double lowestCGPA = students[0].getCGPA();
        String lowestCGPAStudentName = students[0].getName();
        for (int i = 1; i < n; i++) {
            if (students[i].getCGPA() < lowestCGPA) {
                lowestCGPA = students[i].getCGPA();
                lowestCGPAStudentName = students[i].getName();
            }
        }
        System.out.println("student with lowest CGPA: " + lowestCGPAStudentName);

    }
    
}
