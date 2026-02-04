//Import for Java
import java.util.Scanner;

//Public class for the assignment
public class Ch2Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompts the user for subtotal
        System.out.print("Please enter the subtotal: ");
        double subtotal = input.nextDouble();

        //Prompts the user for gratuity rate (makes it a percentage)
        System.out.print("Please enter the gratuity rate (this will be taken as a percentage): ");
        double gratuityRate = input.nextDouble();

        //Calculates the gratuity and total
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        //Displays the results
        System.out.printf("The gratuity is $%.2f and the total is $%.2f%n",
                gratuity, total);

        input.close();
    }
}
