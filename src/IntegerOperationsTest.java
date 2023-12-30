
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerOperationsTest {
  public static void main(String[] args) {
    IntegerOperations integerOperations = new IntegerOperations();

    // Test case 1: Empty list
    List<Integer> emptyList = new ArrayList<>();
    try {
      int result = integerOperations.findMax(emptyList);
      System.out.printf("Test: Empty List\t\t");
      System.out.printf("Expected: Exception - \t\t");
      System.out.println("Actual: " + result);
    } catch (Exception e) {
      System.out.printf("Test: Empty List\t\t");
      System.out.printf("Expected: Exception - Empty List\t\t");
      System.out.println("Actual: Exception - " + e.getMessage());
    }

    // Test case 2: List with positive integers
    List<Integer> positiveInts = Arrays.asList(5, 2, 8, 1, 10);
    try {
      int result = integerOperations.findMax(positiveInts);
      System.out.printf("Test: Positive Integers\t\t");
      System.out.printf("Expected: 10\t\t");
      System.out.println("Actual: " + result);
    } catch (Exception e) {
      System.out.printf("Test: Positive Integers\t\t");
      System.out.printf("Expected: 10\t\t");
      System.out.println("Actual: Exception - " + e.getMessage());
    }

    // Test case 3: List with negative integers
    List<Integer> negativeInts = Arrays.asList(-5, -2, -8, -1, -10);
    try {
      int result = integerOperations.findMax(negativeInts);
      System.out.printf("Test: Negative Integers\t\t");
      System.out.printf("Expected: -1\t\t");
      System.out.println("Actual: " + result);
    } catch (Exception e) {
      System.out.printf("Test: Negative Integers\t\t");
      System.out.printf("Expected: -1\t\t");
      System.out.println("Actual: Exception - " + e.getMessage());
    }

    // Test case 4: List with both positive and negative integers
    List<Integer> mixedInts = Arrays.asList(-5, 2, -8, 1, 10);
    try {
      int result = integerOperations.findMax(mixedInts);
      System.out.printf("Test: Mixed Integers\t\t");
      System.out.printf("Expected: 10\t\t");
      System.out.println("Actual: " + result);
    } catch (Exception e) {
      System.out.printf("Test: Mixed Integers\t\t");
      System.out.printf("Expected: 10\t\t");
      System.out.println("Actual: Exception - " + e.getMessage());
    }
  }
}