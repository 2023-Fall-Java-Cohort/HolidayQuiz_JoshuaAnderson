
public class PalindromeCheckerTest {
  public static void main(String[] args) {
    System.out.println("Palindrome Checker Test:");
    PalindromeCheckerTest palindromeCheckerTest = new PalindromeCheckerTest();
    palindromeCheckerTest.testEmptyString();
    palindromeCheckerTest.testSingleCharacter();
    palindromeCheckerTest.testPalindromeString();
    palindromeCheckerTest.testNonPalindromeString();
    palindromeCheckerTest.testMixedCasePalindromeString();
  }

  public void testEmptyString() {
    PalindromeChecker palindromeChecker = new PalindromeChecker();
    boolean result = palindromeChecker.isPalindrome("");
    System.out.printf("Test: Empty String\t");
    System.out.printf("Expected: false\t\t");
    System.out.println("Actual: " + result);
  }

  public void testSingleCharacter() {
    PalindromeChecker palindromeChecker = new PalindromeChecker();
    boolean result = palindromeChecker.isPalindrome("a");
    System.out.printf("Test: Single Character\t");
    System.out.printf("Expected: true\t\t");
    System.out.println("Actual: " + result);
  }

  public void testPalindromeString() {
    PalindromeChecker palindromeChecker = new PalindromeChecker();
    boolean result = palindromeChecker.isPalindrome(
        "racecar");
    System.out.printf("Test: \'racecar\'\t\t");
    System.out.printf("Expected: true\t\t");
    System.out.println("Actual: " + result);
  }

  public void testNonPalindromeString() {
    PalindromeChecker palindromeChecker = new PalindromeChecker();
    boolean result = palindromeChecker.isPalindrome(
        "hello");
    System.out.printf("Test: \'hello\'\t\t");
    System.out.printf("Expected: false\t\t");
    System.out.println("Actual: " + result);
  }

  public void testMixedCasePalindromeString() {
    PalindromeChecker palindromeChecker = new PalindromeChecker();
    boolean result = palindromeChecker.isPalindrome(
        "Madam");
    System.out.printf("Test: \'Madam\'\t\t");
    System.out.printf("Expected: true\t\t");
    System.out.println("Actual: " + result);
  }
}