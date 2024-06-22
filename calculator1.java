

import java.util.InputMismatchException;
import java.util.Scanner;

class MaxInputException extends Exception {
    public String toString() {
        return "Your input is greater than 1000";
    }
}

class MaxMultiplyException extends Exception {
    public String toString() {
        return "Your input is greater than 7000 for multiplication";
    }
}

class Calculator1  {
    private int firstNumber;
    private int secondNumber;
    private int result;

    Calculator1() throws MaxInputException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter first number:");
                firstNumber = scanner.nextInt();
                System.out.println("Enter second number:");
                secondNumber = scanner.nextInt();
                if (firstNumber > 1000 || secondNumber > 1000) {
                    throw new MaxInputException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integer values.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }
    }

    public void addition() {
        result = firstNumber + secondNumber;
        System.out.println("Addition = " + result);
    }

    public void subtraction() {
        result = firstNumber - secondNumber;
        System.out.println("Subtraction = " + result);
    }

    public void multiplication() throws MaxMultiplyException {
        if ((long) firstNumber * secondNumber > 7000) {
            throw new MaxMultiplyException();
        }
        result = firstNumber * secondNumber;
        System.out.println("Multiplication = " + result);
    }

    public void division() {
        try {
            result = firstNumber / secondNumber;
            System.out.println("Division = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }
}

public class calculator1 {
    public static void main(String[] args) {
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");

        int option;
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();

        Calculator1 calculator;
        try {
            calculator = new Calculator1();
            switch (option) {
                case 1:
                    calculator.addition();
                    break;
                case 2:
                    calculator.subtraction();
                    break;
                case 3:
                    calculator.multiplication();
                    break;
                case 4:
                    calculator.division();
                    break;
                default:
                    System.out.println("You entered an invalid number.");
            }
        } catch (MaxInputException | MaxMultiplyException e) {
            System.out.println(e);
        }
    }
}
