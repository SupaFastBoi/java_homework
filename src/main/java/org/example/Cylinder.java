package org.example;

public class Cylinder {

    //  declaring class fields
    private double radius;
    private double height;

    //  class constructors just for the sake of chaining
    public Cylinder() {
        this(1);
    }

    public Cylinder(double radius) {
        this(radius, 1);
    }

    public Cylinder(double radius, double height) {
        if (radius < 0 || height < 0) {
            throw new IllegalArgumentException("This type of field cannot hold a negative value");
        }
        this.radius = radius;
        this.height = height;
    }

    //  getters and setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("This type of field cannot hold a negative value");
        }
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("This type of field cannot hold a negative value");
        }
        this.radius = radius;
    }

    //  class methods
    public void calculateVolume() {
        System.out.println("Volume of Cylinder is: " + (Math.PI * Math.pow(getRadius(), 2) * getHeight()));
    }
}
