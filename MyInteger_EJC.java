/**
 * MyInteger_EJC.java
 * COP 2250 - Assignment 10
 * Name: Edgar Joel Cebollero
 * Date: 4/3/26
 */
public class MyInteger_EJC {

    // STEP 1 - Declare private int field: value
    private int value;

    // STEP 2 - Constructor
    public MyInteger_EJC(int value) {
        this.value = value;
    }

    // STEP 3 - getValue()
    public int getValue() {
        return value;
    }

    // STEP 4 - isEven() [instance]
    public boolean isEven() {
        return value % 2 == 0;
    }

    // STEP 5 - isOdd() [instance]
    public boolean isOdd() {
        return value % 2 != 0;
    }

    // STEP 6 - isPrime() [instance]
    public boolean isPrime() {
        return isPrime(value);
    }

    // STEP 7 - isEven(int n) [static]
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // STEP 8 - isOdd(int n)  [static]
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    // STEP 9 - isPrime(int n) [static]
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // STEP 10 - isEven(MyInteger_EJC m)  [static]
    public static boolean isEven(MyInteger_EJC m) {
        return isEven(m.getValue());
    }

    // STEP 11 - isOdd(MyInteger_EJC m)   [static]
    public static boolean isOdd(MyInteger_EJC m) {
        return isOdd(m.getValue());
    }

    // STEP 12 - isPrime(MyInteger_EJC m) [static]
    public static boolean isPrime(MyInteger_EJC m) {
        return isPrime(m.getValue());
    }

    // STEP 13 - equals(int n)
    public boolean equals(int n) {
        return value == n;
    }

    // STEP 14 - equals(MyInteger_EJC m)
    public boolean equals(MyInteger_EJC m) {
        return value == m.getValue();
    }

    // STEP 15 - parseInt(String s) [static]
    // Do NOT use Integer.parseInt()
    public static int parseInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = result * 10 + (c - '0');
        }

        return result;
    }

    // STEP 16 - parseInt(char[] chars) [static]
    public static int parseInt(char[] chars) {
        int result = 0;

        for (int i = 0; i < chars.length; i++) {
            result = result * 10 + (chars[i] - '0');
        }

        return result;
    }

    public static void main(String[] args) {
        // Test objects
        MyInteger_EJC m1 = new MyInteger_EJC(7);
        MyInteger_EJC m2 = new MyInteger_EJC(4);

        // Instance methods
        System.out.println("The Value: " + m1.getValue());
        System.out.println("isEven (instance): " + m1.isEven());
        System.out.println("isOdd (instance): " + m1.isOdd());
        System.out.println("isPrime (instance): " + m1.isPrime());

        // Static int methods
        System.out.println("isEven(int 4): " + MyInteger_EJC.isEven(4));
        System.out.println("isOdd(int 7): " + MyInteger_EJC.isOdd(7));
        System.out.println("isPrime(int 7): " + MyInteger_EJC.isPrime(7));

        // Static object methods
        System.out.println("isEven(MyInteger m2): " + MyInteger_EJC.isEven(m2));
        System.out.println("isOdd(MyInteger m1): " + MyInteger_EJC.isOdd(m1));
        System.out.println("isPrime(MyInteger m1): " + MyInteger_EJC.isPrime(m1));

        // equals methods
        System.out.println("equals(int 7): " + m1.equals(7));
        System.out.println("equals(MyInteger m2): " + m1.equals(m2));

        // parseInt methods
        System.out.println("parseInt(String): " + MyInteger_EJC.parseInt("1234"));
        System.out.println("parseInt(char[]): " + MyInteger_EJC.parseInt(new char[]{'5','6','7'}));
    }
}