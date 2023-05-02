import java.util.Scanner;

class GradeCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your mark: ");
    int mark = sc.nextInt();
    sc.close();
    if (mark >= 90) {
      System.out.println("Grade: O");
    } else if (mark >= 80) {
      System.out.println("Grade: E");
    } else if (mark >= 70) {
      System.out.println("Grade: A");
    } else if (mark >= 60) {
      System.out.println("Grade: B");
    } else {
      System.out.println("Grade: C");
    }
  }
}
