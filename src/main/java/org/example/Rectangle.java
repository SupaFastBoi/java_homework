package org.example;

public class Rectangle {

    //  declaring class fields
    private int length;
    private int width;

    //  class constructors just for the sake of chaining
    public Rectangle() {
        this(1);
    }

    public Rectangle(int length) {
        this(length, 1);
    }

    public Rectangle(int length, int width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("This type of field cannot hold a negative value");
        }
        this.length = length;
        this.width = width;
    }

    //  getters and setters
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0) {
            throw new IllegalArgumentException("This type of field cannot hold a negative value");
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("This type of field cannot hold a negative value");
        }
        this.length = length;
    }

    //  class methods
    public void calculatePerimeter() {
        System.out.println("Perimeter of Rectangle is: " + (getLength() + getWidth()));
    }
}
