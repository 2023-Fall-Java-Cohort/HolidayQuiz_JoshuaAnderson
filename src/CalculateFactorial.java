public class CalculateFactorial {

  public long calculateFactorial(int n) {
    long factorialResult = 1;
    while (n > 0) {
      factorialResult = factorialResult * n;
      n--;
    }
    return factorialResult;
  }
}
