package org.example;

public class CharHomework {

    //  declaring class fields
    public static char printed;
    public static char storeLower;
    public static char storeUpper;
    public static String storeConcat;

    //adding private constructor to hide the implicit public one
    private CharHomework() {}

    //  getters and setters
    public static char getPrinted() {
        return printed;
    }

    public static void setPrinted(char printed) {
        CharHomework.printed = printed;
    }

    public static char getStoreLower() {
        return storeLower;
    }

    public static char getStoreUpper() {
        return storeUpper;
    }

    public static String getStoreConcat() {
        return storeConcat;
    }

    //  class methods
    public static String addCharToString(char c, String s) {
        return (c + s + c);
    }
}
