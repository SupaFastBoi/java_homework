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

//      Char value assignment and printing
        CharHomework.setPrinted('s');
        System.out.println("Chosen char value is: " + CharHomework.getPrinted());

//      Convert Case
        CharHomework.storeLower = Character.toLowerCase('C');
        System.out.println("storeLower value is " + CharHomework.getStoreLower());
        CharHomework.storeUpper = Character.toUpperCase('v');
        System.out.println("storeUpper value is " + CharHomework.getStoreUpper());

//      Concatenate character with String
        CharHomework.storeConcat = CharHomework.addCharToString('^', "_>_" );
        System.out.println("storeConcat value is " + CharHomework.getStoreConcat());

//      String value assignment and printing
        StringHomework.setPrinted("homework");
        System.out.println("Chosen String value is: " + StringHomework.getPrinted());

//      Concatenate two Strings
        StringHomework.concatStrings("Hello ", "there!");

//      Replace characters
        System.out.println(StringHomework.printed.replace('o', 'x'));

//      Basic arithmetic operators
        Operators.calculator(2,0);

//      Modulus Magic
        Operators.evenOrOdd(14);

//      Compound assignment operators
        Operators.compound(2,3);

//      Grade Calculator
        IfBlocksHomework.gradeCalculator(89);

//      Password Checker
        IfBlocksHomework.passCheck("awcd4dfd");

//      Leap Year Checker
        IfBlocksHomework.leapYearCheck(1224);

//      Day of the week
        SwitchHomework.dayOfWeek(5);

//      Simple Calculator
        SwitchHomework.simpleCalculator(12, 4, '*');

//      Traffic light simulator
        SwitchHomework.trafficLight("yellow");

//      First positive divisor
        BreakAndContinue.firstDivisor(15);

//      Skip negative numbers
        BreakAndContinue.skipNegative();

//      Guess the number
        BreakAndContinue.guessNumber();

//      Multiplication table
        ForLoops.multiplicationTable(3);

//      Fatorial calcualtor
        ForLoops.factorial(5);

//      Countdown timer
        ForLoops.countdownTimer(4);

//      Find the maximum
        ForEach.findMax(new int[]{1, 2, 5, 16, 3, 4, 7});

//      Count vowels
        ForEach.countVowels("Anvelopa");

//      Sum of even numbers
        ForEach.sumOfEven(new int[]{1, 2, 3, 4, 5, 6});

//      Input summation
        WhileLoop.inputSummation();

//      Guessing game
        WhileLoop.guessGame();

//      Palindrome checker
        WhileLoop.palChecker("RadAr");
    }
}
