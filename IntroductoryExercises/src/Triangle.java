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
}