//Q2.  define a user defined exception for the following :
//     A class student with roll no and marks as data members with method getdata() and putdata() write an exception if marks less than 20 and provide for handling for exception 




class Student {
    private int rollNo;
    private int marks;

    public void getData(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void putData() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public void checkMarks() throws MarksOutOfBoundsException {
        if (marks < 20) {
            throw new MarksOutOfBoundsException("Marks are less than 20!");
        }
    }
}
class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String message) {
        super(message);
    }
}
public class StudentExceptionHandling {
    public static void main(String[] args) {
        Student student = new Student();
        student.getData(101, 18); 

        try {
            student.checkMarks(); 
            student.putData(); 
        } catch (MarksOutOfBoundsException e) {
            System.out.println(e.getMessage()); 
        }
    }
}