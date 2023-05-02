import java.util.Scanner;

 class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the elements of the 3x3 matrix:");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        
        int leftDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            leftDiagonalSum += matrix[i][i];
        }
        
        int rightDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            rightDiagonalSum += matrix[i][2 - i];
        }
        
        System.out.println("Sum of the elements on the left diagonal: " + leftDiagonalSum);
        System.out.println("Sum of the elements on the right diagonal: " + rightDiagonalSum);
    }
}
