import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator1449 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate in ddmmyyyy format: ");
        String birthdateStr = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        LocalDate birthdate = LocalDate.parse(birthdateStr, formatter);
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - birthdate.getYear();

        
        if (birthdate.getDayOfYear() > currentDate.getDayOfYear()) {
            age--;
        }

        try {
            if (age < 0) {
                throw new IllegalArgumentException("Invalid birthdate. Age cannot be negative.");
            }
            System.out.println("Current age is: " + age + " years.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}