/**
 * Created by cannon on 5/23/15.
 */
public class Main
{
    public static void main(String[] args)
    {

        Triangle triangle = new Triangle();

        triangle.printAsterisk();
        System.out.println();

        int n = 8;
        triangle.drawHorizontalLine( n );
        System.out.println();

        triangle.drawVerticalLine( n );
        System.out.println();

        triangle.drawRightTriangle( n );
        System.out.println();
    }
}
