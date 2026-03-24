/**
 * SumColumn.java
 * COP2250 - Assignment 8 (Exercise 8.1)
 *
 * Edgar Joel Cebollero
 * Write a method that returns the sum of all elements in a
 * specified column in a matrix. Write a test program that
 * reads a 3-by-4 matrix and displays the sum of each column.
 *
 * DIRECTIONS: Follow each STEP below. Do them in order.
 *             Compile and test after each STEP.
 */

import java.util.Scanner;

public class SumColumn {

    // ========================================
    // STEP 1: Write the sumColumn method
    // ========================================
    // Use this exact header:
    //
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {

        // STEP 2: Create a Scanner
        Scanner input = new Scanner(System.in);

        // STEP 3: Declare a 3-by-4 matrix
        double[][] m = new double[3][4];

        // STEP 4: Prompt and read the matrix row by row
        System.out.println("Please enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }

        // STEP 5: Display the sum of each column
        for (int col = 0; col < m[0].length; col++) {
            System.out.println("The sum of column " + col + " is " + sumColumn(m, col));
        }

        // STEP 6: Close the Scanner
        input.close();

    }

}