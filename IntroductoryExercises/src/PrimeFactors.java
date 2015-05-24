/**
 * Created by cannon on 5/23/15.
 */
import java.util.ArrayList;

public class PrimeFactors {

    /**
     * Given an integer N, returns a list of integers
     * such that the numbers are the prime factors of N,
     * and are arranged in increasing numerical order.
     * @param N
     * @return list of integers corresponding to prime factors
     * of number N
     */
    public ArrayList<Integer> generate(int N) {

        ArrayList<Integer> primeFactors = new ArrayList<Integer>();

        // Upper bound for list of prime numbers is half of input value
        ArrayList<Boolean> primeNumbers = generatePrimeNumbers(N/2);

        for (int i = 0; i < primeNumbers.size(); i++) {
            if (primeNumbers.get(i) == true) {
                if (N % i == 0) {
                    primeFactors.add(i);
                }
            }
        }

        return primeFactors;
    }

    /**
     * Use Sieve of Eratosthenes algorithm to find all prime numbers
     * up to a given limit, n.
     * http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     * @param n upper bound of prime number list
     * @return Boolean list of prime numbers up to n
     */
    private ArrayList<Boolean> generatePrimeNumbers( int n ) {

        // List of booleans, whose indices correspond to number
        ArrayList<Boolean> isPrimeMap = new ArrayList<Boolean>();

        for (int i = 0; i <= n; i++) {
            isPrimeMap.add(true);
        }

        isPrimeMap.set(0, false);
        isPrimeMap.set(1, false);

        // Starting from p, enumerate its multiples by counting to n
        // in increments of p, and mark them in the list.
        // Find first number greater than p in list that is not marked
        // as false. If there is no such number, stop.  Otherwise,
        // let p be equal to this new number (which is the next prime)
        // and repeat process.
        for (int i = 0; i < isPrimeMap.size(); i++) {
            if (isPrimeMap.get(i) == true) {
                for (int p = i+i; p < isPrimeMap.size(); p += i) {
                    isPrimeMap.set(p, false);
                }
            }
        }

        return isPrimeMap;
    }
}
