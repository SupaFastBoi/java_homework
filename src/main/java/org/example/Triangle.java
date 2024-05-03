package org.example;

public class Triangle {

    //  declaring class fields
    private double firstSide;
    private double secondSide;

    //  class constructors just for the sake of chaining
    public Triangle() {
        this(1);
    }

    public Triangle(double firstSide) {
        this(firstSide, 1);
    }

    public Triangle(double firstSide, double secondSide) {
        if (firstSide < 0 || secondSide < 0) {
            throw new IllegalArgumentException("This type of field cannot hold a negative value");
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    //  getters and setters
    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        if (firstSide < 0) {
            throw new IllegalArgumentException("This type of field cannot hold a negative value");
        }
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        if (secondSide < 0) {
            throw new IllegalArgumentException("This type of field cannot hold a negative value");
        }
        this.secondSide = secondSide;
    }

    //  class methods
    public void calculateHypotenuse() {
        System.out.println("Hypotenuse's length is: " + Math.sqrt(Math.pow(getFirstSide(), 2) + Math.pow(getSecondSide(), 2)));
    }
}
