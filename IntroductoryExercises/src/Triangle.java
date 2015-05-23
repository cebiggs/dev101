/**
 * Created by cannon on 5/23/15.
 */
public class Triangle {

    public void printAsterisk() {
        System.out.print('*');
    }

    public void drawHorizontalLine( int n ) {
        for (int i = 0; i < n; i++) {
            printAsterisk();
        }
    }

    public void drawVerticalLine( int n ) {
        for (int i = 0; i < n; i++) {

            printAsterisk();

            if (i != (n-1)) {
                System.out.println();
            }
        }
    }

    public void drawRightTriangle( int n ) {
        for (int i = 1; i <= n; i++) {
            drawHorizontalLine(i);

            if (i != n) {
                System.out.println();
            }
        }
    }
}
