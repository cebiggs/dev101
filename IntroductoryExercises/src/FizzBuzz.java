/**
 * Created by cannon on 5/23/15.
 */
public class FizzBuzz {

    public void FizzBuzz() {

        for (int i = 1; i <= 100; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            else {
                System.out.print(i);
            }

            if (i != 100) {
                System.out.println();
            }
        }
    }
}
