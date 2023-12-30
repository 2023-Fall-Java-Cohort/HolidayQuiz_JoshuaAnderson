public class PalindromeChecker {
  public boolean isPalindrome(String s) {
    boolean isPalindrome = false;
    if (s.length() == 0) {
    } else {
      s = s.toLowerCase();
      String reverseS = "";
      for (int i = s.length() - 1; i >= 0; i--) {
        reverseS = reverseS + s.charAt(i);
      }
      isPalindrome = s.equals(reverseS);
    }
    return isPalindrome;
  }
}
