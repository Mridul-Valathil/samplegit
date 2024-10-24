import java.util.Scanner;

/**
 * This is the main class that creates and manages the calculator operations.
 */
public class Calculator {

    /**
     * Main method that runs the calculator program.
     * @param args Command-line arguments (not used here).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display options 
        //second commmit
        System.out.println("Simple Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");

        // Get user's choice
        int choice = scanner.nextInt();

        // Get two numbers from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Create Operation object and perform the operation
        Operation operation = new Operation();
        double result = 0;
        boolean valid = true;

        switch (choice) {
            case 1:
                result = operation.add(num1, num2);
                break;
            case 2:
                result = operation.subtract(num1, num2);
                break;
            case 3:
                result = operation.multiply(num1, num2);
                break;
            case 4:
                result = operation.divide(num1, num2);
                if (Double.isNaN(result)) {
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid operation.");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}

/**
 * This class contains methods for performing arithmetic operations.
 */
class Operation {

    /**
     * Adds two numbers.
     * @param a First number.
     * @param b Second number.
     * @return The sum of a and b.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first.
     * @param a First number.
     * @param b Second number.
     * @return The result of a - b.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     * @param a First number.
     * @param b Second number.
     * @return The product of a and b.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second. Returns NaN if division by zero.
     * @param a First number.
     * @param b Second number.
     * @return The result of a / b, or NaN if division by zero.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }
}
import java.util.Scanner;

/**
 * This is the main class that creates and manages the calculator operations.
 */
public class Calculator {

    /**
     * Main method that runs the calculator program.
     * @param args Command-line arguments (not used here).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display options
        System.out.println("Simple Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");

        // Get user's choice
        int choice = scanner.nextInt();

        // Get two numbers from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Create Operation object and perform the operation
        Operation operation = new Operation();
        double result = 0;
        boolean valid = true;

        switch (choice) {
            case 1:
                result = operation.add(num1, num2);
                break;
            case 2:
                result = operation.subtract(num1, num2);
                break;
            case 3:
                result = operation.multiply(num1, num2);
                break;
            case 4:
                result = operation.divide(num1, num2);
                if (Double.isNaN(result)) {
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid operation.");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}

/**
 * This class contains methods for performing arithmetic operations.
 */
class Operation {

    /**
     * Adds two numbers.
     * @param a First number.
     * @param b Second number.
     * @return The sum of a and b.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first.
     * @param a First number.
     * @param b Second number.
     * @return The result of a - b.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     * @param a First number.
     * @param b Second number.
     * @return The product of a and b.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second. Returns NaN if division by zero.
     * @param a First number.
     * @param b Second number.
     * @return The result of a / b, or NaN if division by zero.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }
}
