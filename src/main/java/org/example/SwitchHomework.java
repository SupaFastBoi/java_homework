package org.example;

public class SwitchHomework {

    //adding private constructor to hide the implicit public one
    private SwitchHomework() {}

    //  class methods
    public static void dayOfWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void simpleCalculator(int operand1, int operand2, char operation) {
        switch (operation) {
            case '+':
                System.out.println("operand1 + operand2 = " + (operand1 + operand2));
                break;
            case '-':
                System.out.println("operand1 - operand2 = " + (operand1 - operand2));
                break;
            case '*':
                System.out.println("operand1 * operand2 = " + (operand1 * operand2));
                break;
            case '/':
                System.out.println("operand1 / operand2 = " + (operand1 / operand2));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    public static void trafficLight(String color) {
        switch (color.toLowerCase()) {
            case "red":
                System.out.println("STOP");
                break;
            case "green":
                System.out.println("GO");
                break;
            case "yellow":
                System.out.println("PREPARE TO STOP");
                break;
            default:
                System.out.println("Invalid color");
        }
    }
}
