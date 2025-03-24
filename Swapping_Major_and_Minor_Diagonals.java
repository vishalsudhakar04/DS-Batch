// Java Program to swap diagonals of a matrix using a 2D array
import java.util.*;

class GfG {

    // Function to swap diagonal elements of the matrix
    static void swapDiagonal(int[][] matrix) {

        int n = matrix.length;
        for (int i = 0; i < n; i++) {
          
            // Swap major and minor diagonal elements.
            int temp = matrix[i][i];
            matrix[i][i] = matrix[i][n - i - 1];
            matrix[i][n - i - 1] = temp;
        }
    }

    // Function to display the matrix
    static void displayMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
      
        int[][] matrix = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}
        };

        swapDiagonal(matrix);
        displayMatrix(matrix);
    }
}
