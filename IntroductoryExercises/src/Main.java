/**
 * Created by cannon on 5/23/15.
 */
public class Main
{
    public static void main(String[] args)
    {
        int n = 8;
        String name = "Cannon";

        Triangle triangle = new Triangle();
        Diamond diamond = new Diamond();
        FizzBuzz fizzbuzz = new FizzBuzz();


        triangle.printAsterisk();
        System.out.println();

        triangle.drawHorizontalLine( n );
        System.out.println();

        triangle.drawVerticalLine( n );
        System.out.println();

        triangle.drawRightTriangle( n );
        System.out.println();

        diamond.printIsoscelesTriangle( n, 0 );
        System.out.println();

        diamond.printDiamond( n );
        System.out.println();

        diamond.printDiamondWithName( n, name );
        System.out.println();

        fizzbuzz.FizzBuzz();

    }
}
