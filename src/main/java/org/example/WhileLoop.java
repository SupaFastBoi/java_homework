package org.example;

import java.util.Random;
import java.util.Scanner;

public class WhileLoop {

    //adding private constructor to hide the implicit public one
    private WhileLoop() {}

    //  class methods
    public static void inputSummation() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Insert the numbers you wish to add (inserting 0 exits the program)");
        int input = scanner.nextInt();
        while (input != 0) {
            sum += input;
            input = scanner.nextInt();
        }
        System.out.println("The resulting sum is " + sum);
    }

    public static void guessGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;
        int guess = 0;
        System.out.println("Guess the secret number between 1 and 100 (unlimited attempts): ");

        while (guess != randomInt) {
            guess = scanner.nextInt();
            if (guess == randomInt) {
                System.out.println("You won!");
                break;
            } else if (guess < randomInt) {
                System.out.println("Too low");
            } else if (guess > randomInt) {
                System.out.println("Too high");
            }
        }
    }

    public static void palChecker(String input) {
        input = input.toLowerCase();
        boolean result = true;
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                result = false;
            }
            start++;
            end--;
        }
        System.out.println("Palindrome checks " + result);
    }
}
