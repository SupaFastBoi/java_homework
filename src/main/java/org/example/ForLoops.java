package org.example;

public class ForLoops {

    //adding private constructor to hide the implicit public one
    private ForLoops() {}

    //  class methods
    public static void multiplicationTable(int number) {
        System.out.println("The multiplication table for " + number + " is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + number + " = " + (i * number));
        }
    }

    public static void factorial(int number) {
        int result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        System.out.println(number + "! = " + result);
    }

    public static void countdownTimer(int number) {
        System.out.println("Timer of " + number + " seconds starts:");
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Time ran out!");
    }
}
