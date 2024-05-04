package org.example;

public class BooleanHomework {

    //  declaring class fields
    public static boolean var;
    public static boolean result;
    public static boolean isSunny;
    public static boolean isWarm;
    public static boolean chanceOfRain;
    public static boolean shouldGoOut;

    //  class constructors just for the sake of chaining
    public BooleanHomework() {}

    public BooleanHomework(boolean var) {
        BooleanHomework.var = var;
    }

    //  getters and setters
    public static boolean isVar() {
        return var;
    }

    public static void setVar(boolean var) {
        BooleanHomework.var = var;
    }

    public static void setIsSunny(boolean isSunny) {
        BooleanHomework.isSunny = isSunny;
    }

    public static void setIsWarm(boolean isWarm) {
        BooleanHomework.isWarm = isWarm;
    }

    public static void setChanceOfRain(boolean chanceOfRain) {
        BooleanHomework.chanceOfRain = chanceOfRain;
    }

    //  class methods
    public static boolean firstSmaller(int a, int b) {
        return a < b;
    }

    public static boolean checkWeather() {
        if (isSunny && isWarm) {
            return true;
        }else if (!chanceOfRain && isWarm) {
            return true;
        }else return false;
    }

}
