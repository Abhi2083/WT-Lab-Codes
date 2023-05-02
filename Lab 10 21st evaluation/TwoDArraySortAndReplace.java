// Q3. write a prog in java to create 2d array of 3*3. sort the right diagonal elements in decending order . replace the left diagonal element with the smallest element of the 2d array.

import java.util.Arrays;

public class TwoDArraySortAndReplace {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 9, 1 }, { 3, 1, 5 }, { 8, 6, 1 } }; 

        System.out.println("Original 2D Array:");
        printMatrix(matrix); 

        
        int[] rightDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            rightDiagonal[i] = matrix[i][matrix.length - 1 - i];
        }
        Arrays.sort(rightDiagonal);
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][matrix.length - 1 - i] = rightDiagonal[rightDiagonal.length - 1 - i];
        }

        System.out.println("2D Array with Sorted Right Diagonal:");
        printMatrix(matrix); 
        
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] < min) {
                min = matrix[i][i];
            }
         matrix[0][0] = min;
        }
        
        System.out.println("2D Array with Replaced Left Diagonal Element:");
        printMatrix(matrix);
    }

    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}