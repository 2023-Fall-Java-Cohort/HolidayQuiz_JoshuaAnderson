import java.util.ArrayList;

public class FindPrimes {

  public int[] findPrimes(int n) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int i = 1; i <= n; i += 2) {
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          break;
        }
        if (j == i - 1) {
          primes.add(i);
        }
      }
    }
    int[] primesArray = new int[primes.size()];
    for (int i = 0; i < primes.size(); i++) {
      primesArray[i] = primes.get(i);
    }
    return primesArray;
  }
}
