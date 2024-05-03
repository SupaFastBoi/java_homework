package org.example;

public class Converter {

    //  declaring class fields
    private int minutes;
    private double fahrenheit;

    //  class constructors just for the sake of chaining
    public Converter() {}

    public Converter(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("Minutes cannot be negative");
        }
        this.minutes = minutes;
    }

    public Converter(double fahrenheit) {
        this.fahrenheit = fahrenheit;
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

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    //  class methods
    public void minutesToSeconds() {
        System.out.println(getMinutes() + " minutes equals to " + (getMinutes() * 60) + " seconds");
    }

    public void fahrenheitToCelsius() {
        System.out.println(getFahrenheit() + " Fahrenheit degrees equals to " + ((getFahrenheit() - 32) * (5.0 / 9.0)) + " Celsius degrees");
    }
}
