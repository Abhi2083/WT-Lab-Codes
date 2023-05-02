interface Employee {
    double earnings(double basicSalary);
    double deductions(double basicSalary);
    double bonus(double basicSalary);
}

abstract class Manager implements Employee {
     public double earnings(double basicSalary) {
        double DA = 0.8 * basicSalary;
        double HRA = 0.15 * basicSalary;
        return basicSalary + DA + HRA;
    }

    public double deductions(double basicSalary) {
        double PF = 0.12 * basicSalary;
        return PF;
    }
}

class Substaff extends Manager {
    public double bonus(double basicSalary) {
        return 0.5 * basicSalary;
    }
}

public class Sallary {
    public static void main(String[] args) {
        double basicSalary = 250000;

        Employee emp = new Substaff();

        double earnings = emp.earnings(basicSalary);
        double deductions = emp.deductions(basicSalary);
        double bonus = emp.bonus(basicSalary);

        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Earnings: " + earnings);
        System.out.println("Deductions: " + deductions);
        System.out.println("Bonus: " + bonus);
    }
}
