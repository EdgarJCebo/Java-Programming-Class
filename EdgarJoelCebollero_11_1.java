import java.util.Scanner;

public class EdgarJoelCebollero_11_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Prompt the user for the triangle sides
        System.out.print("Please enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        //Creates the Triangle object
        Triangle_EJC triangle = new Triangle_EJC(side1, side2, side3);

        //Prompts the user for triangle color
        System.out.print("Please enter the color: ");
        String color = input.next();

        //Prompts the user for filled status
        System.out.print("Is this triangle filled? (true/false): ");
        boolean filled = input.nextBoolean();

        //Sets the properties
        triangle.setColor(color);
        triangle.setFilled(filled);

        //Displays the results
        System.out.println("\nTriangle Information:");
        System.out.println(triangle.toString());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());

        input.close();
    }
}