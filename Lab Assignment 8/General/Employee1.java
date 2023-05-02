

package General;

public class Employee1 {
    protected int empid;
    private String ename;
    public double basic;

    public Employee1(int empid, String ename, double basic) {
        this.empid = empid;
        this.ename = ename;
        this.basic = basic;
    }

    public void printInfo() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Basic Salary: " + basic);
    }
}

