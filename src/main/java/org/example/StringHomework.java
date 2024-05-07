package org.example;

public class StringHomework {

    //  declaring class fields
    public static String printed;

    //adding private constructor to hide the implicit public one
    private StringHomework() {}

    //  getters and setters

    public static String getPrinted() {
        return printed;
    }

    public static void setPrinted(String printed) {
        StringHomework.printed = printed;
    }

    //  class methods
    public static void concatStrings(String first, String second) {
        System.out.println(first.concat(second));
    }
}
