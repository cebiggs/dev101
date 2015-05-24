import java.util.ArrayList;

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
        PrimeFactors primeFactors = new PrimeFactors();

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
        System.out.println();

        ArrayList<Integer> primeFactorsList = primeFactors.generate( 30 );
        if (primeFactorsList.isEmpty()) {
            System.out.println("There are no prime factors.");
        }
        else {
            for ( int factor : primeFactorsList ) {
                System.out.printf("%d ", factor);
            }
        }
    }
}
