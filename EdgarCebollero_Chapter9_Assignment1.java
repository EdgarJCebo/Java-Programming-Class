/**
 * EdgarCebollero_Chapter9_Assignment1.java
 * COP 2250 -- Chapter 9, Assignment 1
 *
 * Compile: javac EdgarCebollero_Chapter9_Assignment1.java
 * Run:     java EdgarCebollero_Chapter9_Assignment1
 */

// ============================================================
// Rectangle_EC class -- NO public keyword on this class
// ============================================================
class Rectangle_EC {

    // STEP 1: Declare two double data fields: width and height
    //         Both should have a default value of 1

    double width = 1;
    double height = 1;


    // STEP 2: Write a no-arg constructor
    //         Field defaults handle initialization -- body can be empty

    Rectangle_EC() {
    }


    // STEP 3: Write a parameterized constructor that accepts width and height

    Rectangle_EC(double width, double height) {
        this.width = width;
        this.height = height;
    }


    // STEP 4: Write getArea() -- returns width * height

    double getArea() {
        return width * height;
    }


    // STEP 5: Write getPerimeter() -- returns 2 * (width + height)

    double getPerimeter() {
        return 2 * (width + height);
    }

}


// ============================================================
// Test class -- this one IS public, and matches the filename
// ============================================================
public class EdgarCebollero_Chapter9_Assignment1 {

    public static void main(String[] args) {

        // STEP 6: Create rectangle 1 with width=4 and height=40

        Rectangle_EC r1 = new Rectangle_EC(4, 40);


        // STEP 7: Print width, height, area, and perimeter for r1

        System.out.println("Rectangle 1");
        System.out.println("Width: " + r1.width);
        System.out.println("Height: " + r1.height);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println();


        // STEP 8: Create rectangle 2 with width=3.5 and height=35.9

        Rectangle_EC r2 = new Rectangle_EC(3.5, 35.9);


        // STEP 9: Print width, height, area, and perimeter for r2

        System.out.println("Rectangle 2");
        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

    }
}