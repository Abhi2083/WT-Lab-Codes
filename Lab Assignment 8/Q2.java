import Marketing.Sales;

public class Q2 {
    public static void main(String[] args) {
        Sales salesperson = new Sales(101, "Abhi Tiwari", 50000.0);
        Sales salesperson2 = new Sales(102, "Abhi Arya", 5000.0);
        double totalEarnings = salesperson.earnings() + salesperson.tallowance();
        double totalEarnings2 = salesperson2.earnings() + salesperson.tallowance();

        System.out.println("Employee ID: " + salesperson.empid);
        System.out.println("Total Earnings: " + totalEarnings);
        System.out.println("Employee ID: " + salesperson2.empid);
        System.out.println("Total Earnings: " + totalEarnings2);
    }
}

