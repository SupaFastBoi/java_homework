package org.example;

import java.util.Random;
import java.util.Scanner;

public class BreakAndContinue {

    //adding private constructor to hide the implicit public one
    private BreakAndContinue() {}

    //  class methods
    public static void firstDivisor(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " is the first positive divisor");
                break;
            }
        }
    }

    public static void skipNegative() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to add (add 0 to stop):");
        int number = scanner.nextInt();

        while (number != 0) {
            if (number < 0) {
                number = scanner.nextInt();
                continue;
            }
            sum += number;
            number = scanner.nextInt();
        }

        System.out.println("The sum of input numbers is " + sum);
    }

    public static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomInt = random.nextInt(10) + 1;
        int attempts = 5;

        System.out.println("Guess the secret number between 1 and 10 (you have 5 attempts): ");

        while (attempts > 0) {
            int number = scanner.nextInt();
            if (number == randomInt) {
                System.out.println("You won!");
                break;
            } else {
                attempts--;
                System.out.println("You are wrong. Attempts left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("You've used all your attempts. The secret number was: " + randomInt);
        }
    }
}
