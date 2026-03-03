/**
 * SortThreeNumbers.java
 * Edgar Joel Cebollero
 * 2/28/26
 * Writes a method that sorts three numbers and displays them in increasing order.
 */

import java.util.Scanner;

public class SortThreeNumbers {

    // ========================================
    // STEP 1: Define the method signature
    // ========================================
    // Write the method header for displaySortedNumbers.
    // It takes three double parameters: num1, num2, num3
    // It returns void (it prints, not returns).
    //
    public static void displaySortedNumbers(double num1, double num2, double num3) {

        // ========================================
        // STEP 2: Sort the three numbers
        // ========================================
        // Inside the method, you need to rearrange num1, num2, num3
        // so that num1 <= num2 <= num3.
        //
        // STRATEGY: Use comparisons and a temp variable to swap.
        //
        // HINT: One approach:
        //   - If num1 > num2, swap them
        //   - If num1 > num3, swap them
        //   - Now num1 is the smallest
        //   - If num2 > num3, swap them
        //   - Now all three are in order

        double temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // ========================================
        // STEP 3: Display the sorted numbers
        // ========================================
        // Print the three numbers on one line, separated by spaces.
        //
        // System.out.println(num1 + " " + num2 + " " + num3);

        System.out.println("Your sorted numbers are: " 
                            + num1 + " " 
                            + num2 + " " 
                            + num3);

        // ========================================
        // STEP 4: Close the method with }
        // ========================================
    }

    // ========================================
    // STEP 5: Write the main method
    // ========================================

    public static void main(String[] args) {

        // STEP 6: Create a Scanner
        Scanner input = new Scanner(System.in);

        // STEP 7: Prompt the user for three numbers
        System.out.print("Please enter three numbers: ");

        // STEP 8: Read the three numbers into doubles
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        // STEP 9: Call displaySortedNumbers with the three values
        displaySortedNumbers(num1, num2, num3);

        // STEP 10: Close the Scanner
        input.close();
    }
}