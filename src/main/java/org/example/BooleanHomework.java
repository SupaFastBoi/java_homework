package org.example;

public class BooleanHomework {

    //  declaring class fields
    public static boolean var;
    public static boolean result;
    public static boolean isSunny;
    public static boolean isWarm;
    public static boolean chanceOfRain;
    public static boolean shouldGoOut;

    //adding private constructor to hide the implicit public one
    private BooleanHomework() {}

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
        }else return (!chanceOfRain && isWarm);
    }

}
