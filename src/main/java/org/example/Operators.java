package org.example;

public class Operators {

    //adding private constructor to hide the implicit public one
    private Operators() {}

    //  class methods
    public static void calculator(int firstOperand, int secondOperand) {
        System.out.println("The sum is equal to " + (firstOperand + secondOperand));
        System.out.println("The difference is equal to " + (firstOperand - secondOperand));
        System.out.println("The product is equal to " + (firstOperand * secondOperand));
        try {
            System.out.println("The division is equal to " + (firstOperand / secondOperand));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero occurred");
        }
    }

    public static void evenOrOdd(int input) {
        String[] options = {"even", "odd"};
        System.out.println("The chosen number is " + options[input % 2]);
    }

    public static void compound(int result, int b) {
        System.out.println("Adding b to result and printing result: " + (result += b));
        System.out.println("Substracting b from result and printing result: " + (result -= b));
        System.out.println("Multiplying result by b and printing result: " + (result *= b));
        System.out.println("Dividing result by b and printing result: " + (result /= b));
    }
}
