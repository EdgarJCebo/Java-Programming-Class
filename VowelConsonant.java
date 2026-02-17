/**
 * Assignment 4: Vowel or Consonant Checker
 * 
 * COP2250 Java Programming
 * Kevin Pyatt, Ph.D. | Pyatt Labs
 * 
 * Write a program that prompts the user to enter a letter
 * and checks whether it is a vowel or consonant.
 * For non-letter input, display "invalid input".
 */

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        
        // ============================================
        // ACT 1: SET THE STAGE
        // ============================================
        
        // TODO 1: Create a Scanner object called "input"
        Scanner input = new Scanner(System.in);
        
        // ============================================
        // ACT 2: GET USER INPUT
        // ============================================
        
        // TODO 2: Print the prompt
        System.out.print("Enter a letter: ");
        
        // TODO 3: Read the input as a String
        String s = input.nextLine();
        
        // TODO 4: Extract the first character
        char ch = s.charAt(0);
        
        // ============================================
        // ACT 3: VALIDATE INPUT
        // ============================================
        
        // TODO 5: Check if ch is a letter
        if (!Character.isLetter(ch)) {
            System.out.println(ch + " is invalid input.");
        } 
        else {
            
            // ============================================
            // ACT 4: CHECK VOWEL OR CONSONANT
            // ============================================
            
            // TODO 6: Convert to lowercase
            char lower = Character.toLowerCase(ch);
            
            // TODO 7: Check if vowel
            if (lower == 'a' || lower == 'e' || lower == 'i' 
                || lower == 'o' || lower == 'u') {
                System.out.println(ch + " is a vowel.");
            } 
            else {
                System.out.println(ch + " is a consonant.");
            }
        }
        
        input.close();
    }
}
