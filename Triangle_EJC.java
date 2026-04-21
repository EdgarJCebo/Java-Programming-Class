/**
 * Triangle.java
 * COP 2250 - Assignment 11
 * Inheritance - Extending GeometricObject (Liang 11.1)
 *
 * Name: Edgar Joel Cebollero
 * Date: 4/18/26
 */
public class Triangle_EJC extends GeometricObject {

    // -------------------------------------------------------
    // STEP 1 - Declare three private double fields:
    //          side1, side2, side3
    // -------------------------------------------------------
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // -------------------------------------------------------
    // STEP 2 - Default constructor
    // All three sides default to 1.0
    // Must call super()
    // -------------------------------------------------------
    public Triangle_EJC() {
        super();
    }

    // -------------------------------------------------------
    // STEP 3 - Parameterized constructor
    // Accepts side1, side2, side3
    // Must call super() — no color/filled required
    // -------------------------------------------------------
    public Triangle_EJC(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // -------------------------------------------------------
    // STEP 4 - Getters for side1, side2, side3
    // No setters required
    // -------------------------------------------------------
    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }

    // -------------------------------------------------------
    // STEP 5 - getArea()
    // Use Heron's formula:
    //   s = (side1 + side2 + side3) / 2
    //   area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3))
    // -------------------------------------------------------
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // -------------------------------------------------------
    // STEP 6 - getPerimeter()
    // Sum of all three sides
    // -------------------------------------------------------
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // -------------------------------------------------------
    // STEP 7 - toString()
    // Must call super.toString() and append side info
    // -------------------------------------------------------
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 +
               " side2 = " + side2 +
               " side3 = " + side3;
    }
}