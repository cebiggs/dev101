/**
 * Created by cannon on 5/23/15.
 */
public class Diamond {

    private void printSpace( int n ) {
        if (n < 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(' ');
        }
    }

    /**
     * Given a number n, prints a centered, isosceles triangle.
     * @param n represents number of lines of centered, isosceles triangle.
     */
    public void printIsoscelesTriangle( int n, int padding ) {
        Triangle triangle = new Triangle();

        for (int i = 1; i <= n; i++) {

            printSpace(padding + n-i);
            triangle.drawHorizontalLine(i * 2 - 1);
            printSpace(padding + n-i);

            if(i != n) {
                System.out.println();
            }
        }
    }

    public void printUpsideDownIsoscelesTriangle( int n, int padding ) {
        Triangle triangle = new Triangle();

        for (int i = n; i > 0; i--) {
            printSpace(padding + n-i);
            triangle.drawHorizontalLine(i * 2 - 1);
            printSpace(padding + n-i);

            if(i != 1) {
                System.out.println();
            }
        }
    }

    public void printDiamond( int n ) {
        printIsoscelesTriangle( n, 0 );
        System.out.println();
        printUpsideDownIsoscelesTriangle(n - 1, 1);
    }

    public void printDiamondWithName( int n, String name ) {

        int namePadding = 0;
        int diamondPadding = 0;
        int maxAsteriskNum = (n-1)* 2 - 1;

        if (((n-1)*2-1) > name.length()) {
            namePadding = (maxAsteriskNum - name.length()) / 2;
        }

        else if (((n-1)*2-1) < name.length()) {
            diamondPadding = (name.length() - maxAsteriskNum)/2;
        }

        printIsoscelesTriangle(n - 1, diamondPadding);
        System.out.println();
        printSpace(namePadding);
        System.out.print(name);
        printSpace(namePadding);
        System.out.println();
        printUpsideDownIsoscelesTriangle(n-1, diamondPadding);
    }
}
