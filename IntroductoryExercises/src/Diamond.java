/**
 * Created by cannon on 5/23/15.
 */
public class Diamond {

    private void printSpace( int n ) {
        for (int i = 0; i < n; i++) {
            System.out.print(' ');
        }
    }

    /**
     * Given a number n, prints a centered, isosceles triangle.
     * @param n represents number of lines of centered, isosceles triangle.
     */
    public void printIsoscelesTriangle( int n ) {
        Triangle triangle = new Triangle();

        for (int i = 1; i <= n; i++) {

            printSpace(n-i);
            triangle.drawHorizontalLine(i * 2 - 1);
            printSpace(n-i);

            if(i != n) {
                System.out.println();
            }
        }
    }
}
