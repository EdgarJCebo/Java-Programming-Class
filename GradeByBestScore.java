/**
 * GradeByBestScore.java
 * COP2250 - Assignment 7 (Exercise 7.1)
 * Edgar Joel Cebollero
 * 3/6/26
 * This code takes the amount of students input by the user, takes the scores from the 2nd input, 
 * and assigns grades to them based on a curve
 * 
 * Read student scores, find the best, assign grades on a curve.
 * 
 * DIRECTIONS: Follow each STEP below. Do them in order.
 *             Compile and test after each STEP.
 */

import java.util.Scanner;

public class GradeByBestScore {

    public static void main(String[] args) {

        // STEP 1: Create a Scanner
        Scanner input = new Scanner(System.in);


        // STEP 2: Ask how many students
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();


        // STEP 3: Create an int array of size n
        int[] scores = new int[n];


        // STEP 4: Read scores into the array
        System.out.print("Enter " + n + " scores: ");
        for (int i = 0; i < n; i++) {
            scores[i] = input.nextInt();
        }


        // STEP 5: Find the best (maximum) score
        int best = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }


        // STEP 6: Assign grades based on the curve
        // Loop through the array again.
        // For each score, determine the grade using if-else:
        //
        for (int i = 0; i < scores.length; i++) {
            char grade;
            if (scores[i] >= best - 10)
                grade = 'A';
            else if (scores[i] >= best - 20)
                grade = 'B';
            else if (scores[i] >= best - 30)
                grade = 'C';
            else if (scores[i] >= best - 40)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }


        // STEP 7: Close the Scanner
        input.close();

    }
}