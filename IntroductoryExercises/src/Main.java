import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by cannon on 5/23/15.
 */
public class Main
{
    public static void main(String[] args)
    {
        int n = 0;
        String name = "";
        int userInput = 0;

        Triangle triangle = new Triangle();
        Diamond diamond = new Diamond();
        FizzBuzz fizzbuzz = new FizzBuzz();
        PrimeFactors primeFactors = new PrimeFactors();
        Scanner in = new Scanner(System.in);

        while ( userInput != 10 ) {

            System.out.println("Operations:\n1: Print one asterisk");
            System.out.println("2: Draw a horizontal line");
            System.out.println("3: Draw a vertical line");
            System.out.println("4: Draw a right triangle");
            System.out.println("5: Draw an isosceles triangle");
            System.out.println("6: Draw a diamond");
            System.out.println("7: Draw a diamond with name");
            System.out.println("8: Do the FizzBuzz");
            System.out.println("9: Find the prime factors of a number");
            System.out.println("10: Quit\n");
            System.out.print("Enter a number to perform an operation: ");

            userInput = in.nextInt();

            switch (userInput) {
                case 1:
                    triangle.printAsterisk();
                    break;
                case 2:
                    System.out.print("Enter number of asterisks: ");
                    n = in.nextInt();
                    if (validate(n)) {
                        triangle.drawHorizontalLine( n );
                    }
                    break;
                case 3:
                    System.out.print("Enter number of lines: ");
                    n = in.nextInt();
                    if (validate(n)) {
                        triangle.drawVerticalLine( n );
                    }
                    break;
                case 4:
                    System.out.print("Enter number of lines for triangle: ");
                    n = in.nextInt();
                    if (validate(n)) {
                        triangle.drawRightTriangle( n );
                    }
                    break;
                case 5:
                    System.out.print("Enter a number for isosceles triangle: ");
                    n = in.nextInt();
                    if (validate(n)) {
                        diamond.printIsoscelesTriangle(n, 0);
                    }
                    break;
                case 6:
                    System.out.print("Enter number for diamond: ");
                    n = in.nextInt();
                    if (validate(n)) {
                        diamond.printDiamond(n);
                    }
                    break;
                case 7:
                    System.out.print("Enter number for diamond: ");
                    n = in.nextInt();
                    System.out.print("Enter a name: ");
                    name = in.next();
                    if (validate(n)) {
                        diamond.printDiamondWithName(n, name);
                    }
                    break;
                case 8:
                    fizzbuzz.FizzBuzz();
                    break;
                case 9:
                    System.out.print("Enter number of which to find prime factors: ");
                    n = in.nextInt();

                    if (validate(n)) {
                        ArrayList<Integer> primeFactorsList = primeFactors.generate( n );
                        if (primeFactorsList.isEmpty()) {
                            System.out.println("There are no prime factors.");
                        }
                        else {
                            for ( int factor : primeFactorsList ) {
                                System.out.printf("%d ", factor);
                            }
                        }
                    }

                    break;
                case 10:
                    System.out.println("Bye!");
                    return;
                default:
                    break;
            }
            System.out.println();
            System.out.println();
        }
    }

    public static boolean validate( int n ) {
        if ( n >= 0 ) {
            return true;
        }
        else {
            System.out.println("Sorry, the number must be greater than 0.");
            return false;
        }
    }
}
