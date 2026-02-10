import java.util.Scanner;
import java.util.Random;

//Imports above and class selection

public class RockPaperScissors {
    public static void main(String[] args) {

        //String for the selected choices in Rock Paper Scissors
        String[] choices = {"Rock", "Paper", "Scissors"};

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int computer = rand.nextInt(3);

        //Prints the selection for user input
        System.out.print("rock (0), paper (1), scissors (2): ");
        int user = input.nextInt();

        System.out.print("The computer is " + choices[computer] + ". ");
        System.out.print("You are " + choices[user] + ". ");

        //If program for deciding and printing the results on who won
        if (user == computer) {
            System.out.println("It's a draw! You should try again.");
        }
        else if ((user == 0 && computer == 2) ||
                 (user == 1 && computer == 0) ||
                 (user == 2 && computer == 1)) {
            System.out.println("You won! Congrats on beating the computer.");
        }
        else {
            System.out.println("The computer wins! Better luck next time.");
        }

        input.close();
    }
}
