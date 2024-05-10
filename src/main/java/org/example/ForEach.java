package org.example;

public class ForEach {

    //adding private constructor to hide the implicit public one
    private ForEach() {}

    //  class methods
    public static void findMax(int[] values) {
        int comp = values[0];
        for (int value : values) {
            if (value >= comp) {
                comp = value;
            }
        }
        System.out.println("The biggest number in the given array is " + comp);
    }

    public static void countVowels(String input) {
        int counter = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char letter : input.toCharArray()) {
            if (isCharInArray(letter, vowels)) {
                counter++;
            }
        }
        System.out.println("The given string has a total of " + counter + " vowels.");
    }

    public static boolean isCharInArray(char ch, char[] letters) {
        for (char letter : letters) {
                if (Character.toLowerCase(ch) == letter) return true;
        }
        return false;
    }

    public static void sumOfEven(int[] values) {
        int sum = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                sum += value;
            }
        }
        System.out.println("Them sum of the even numbers present in the array is " + sum);
    }
}
