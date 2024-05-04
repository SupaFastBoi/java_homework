package org.example;


public class App
{
    public static void main( String[] args )
    {
//      By default, length and width are set to 1 unit
        Rectangle rectangle = new Rectangle(2 ,3);
        rectangle.calculatePerimeter();

//      By default, minutes are set to 0
        Converter converter = new Converter(5);
        converter.minutesToSeconds();

//      By default, minutes are set to 1 unit
        Square square = new Square(10);
        square.calculateArea();

//      By default, radius and height are set to 1 unit
        Cylinder cylinder = new Cylinder(2.4, 10.25);
        cylinder.calculateVolume();

//      By default, fahrenheit degrees are set to 0
        Converter converter2 = new Converter(1.0);
        converter2.fahrenheitToCelsius();

//      By default, both sides are set to 1 unit
        Triangle triangle = new Triangle(2.3, 4.5);
        triangle.calculateHypotenuse();

//      Boolean value assignment and printing
        BooleanHomework.setVar(true);
        System.out.println("Chosen boolean value is: " + BooleanHomework.isVar());

//      Boolean Comparison
        System.out.println("First integer values is smaller than the second one: " + (BooleanHomework.result = BooleanHomework.firstSmaller(3,4)));

//      Checking weather conditions
        BooleanHomework.setIsSunny(false);
        BooleanHomework.setIsWarm(true);
        BooleanHomework.setChanceOfRain(true);
        System.out.println("Should I go out: " + (BooleanHomework.shouldGoOut = BooleanHomework.checkWeather()));
    }
}
