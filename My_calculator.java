import java.util.Scanner;
class Calculator4 {
    Scanner ac = new Scanner(System.in);
    // Private variables for storing calculation results and operands
    private int add, subtract, multiply, Operand1, Operand2;
    private double division;
    private String expression;

    // Method to perform multiplication
    void multiplication() {
        multiply = Operand1 * Operand2;
        System.out.println(Operand1 + "*" + Operand2 + "=" + multiply);
    }

    // Method to perform division
    void division1() {
        if (Operand2 != 0) {
            division = (double) Operand1 / Operand2;
            System.out.println(Operand1 + "/" + Operand2 + "=" + division);
        } else {
            System.out.println("Error: Division by zero is not allowed");
        }
    }

    // Method to perform subtraction
    void subtraction() {
        subtract = Operand1 - Operand2;
        System.out.println(Operand1 + "-" + Operand2 + "=" + subtract);
    }

    // Method to perform addition
    void addition() {
        add = Operand1 + Operand2;
        System.out.println(Operand1 + "+" + Operand2 + "=" + add);
    }

    // Method to display menu and perform calculations based on user input
    void menu() {
        System.out.println("ENTER THE EXPRESSION");
        expression = ac.next();
        char operator;
        // Extracting operator from expression
        operator = expression.charAt(1);
        // Extracting operands from expression
        Operand1 = Integer.parseInt(expression.substring(0, 1));
        Operand2 = Integer.parseInt(expression.substring(2));
        switch (operator) {
            case '+':
                addition();
                break;
            case '-':
                subtraction();
                break;
            case '*':
                multiplication();
                break;
            case '/':
                division1();
                break;
            default:
                System.out.println("INVALID INPUT !");
        }
        // Asking for continuation or exit
        System.out.println("Press any key to continue " + " \n\n\n" + "NO for exit ");
        String choice = ac.next();
        if (choice.equalsIgnoreCase("NO")) {
            System.out.println("THANKS !");
        } else {
            menu(); // Recursive call to menu for continued operation
        }
    }
}

public class My_calculator {
    public static void main(String[] args) {
//        Calculator c = new Calculator();
//        c.menu(); // Starting the calculator
    }
}
