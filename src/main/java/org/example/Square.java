package org.example;

public class Square {

    //  declaring class fields
    private int side;

    //  class constructors just for the sake of chaining
    public Square() {
        this(1);
    }

    public Square(int side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side must be a positive integer");
        }
        this.side = side;
    }

    //  getters and setters
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side must be a positive integer");
        }
        this.side = side;
    }

    //  class methods
    public void calculateArea() {
        System.out.println("Area of Square is: " + (getSide() * getSide()));
    }
}
