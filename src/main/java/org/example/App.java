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

//      By default, minutes are set to 1
        Square square = new Square(10);
        square.calculateArea();
    }
}
