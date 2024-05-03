package org.example;

public class Converter {

    //  declaring class fields
    private int minutes;

    //  class constructors just for the sake of chaining
    public Converter() {
        this(0);
    }
    public Converter(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("Minutes cannot be negative");
        }
        this.minutes = minutes;
    }

    //  getters and setters
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("Minutes cannot be negative");
        }
        this.minutes = minutes;
    }

    //  class methods
    public void minutesToSeconds() {
        System.out.println(getMinutes() + " minutes equals to " + (getMinutes() * 60) + " seconds");
    }
}
