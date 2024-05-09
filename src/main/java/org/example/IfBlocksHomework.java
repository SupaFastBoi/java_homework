package org.example;

public class IfBlocksHomework {

    //adding private constructor to hide the implicit public one
    private IfBlocksHomework() {}

    //  class methods
    public static void gradeCalculator(int grade) {
        if (grade >= 90 && grade <= 100) {
            System.out.println(grade + " points gives you the A grade");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println(grade + " points gives you the B grade");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println(grade + " points gives you the C grade");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println(grade + " points gives you the D grade");
        } else if (grade >= 0 && grade <= 59) {
            System.out.println(grade + " points gives you the F grade");
        } else {
            System.out.println("Invalid grade");
        }
    }

    public static void passCheck(String pass) {
        boolean containsNumbers = false;
        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) {
                containsNumbers = true;
                break;
            }
        }
        if (pass.length() >= 8 && containsNumbers) {
            System.out.println("Strong password");
        } else if (pass.length() >= 8) {
            System.out.println("Moderate password");
        } else System.out.println("Weak password");
    }

    public static void leapYearCheck(int year) {
        if (year >= 0) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year");
            } else System.out.println(year + " is not a leap year");
        }
    }

}
