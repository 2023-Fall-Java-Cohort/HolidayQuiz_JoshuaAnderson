import java.util.Arrays;

public class SorterTest {
  public static void main(String[] args) {
    Sorter sorter = new Sorter();

    // Test case 1: Empty array
    int[] emptyArray = {};
    int[] sortedEmptyArray = sorter.bubbleSort(emptyArray);
    System.out.printf("Test: Empty Array\t\t");
    System.out.printf("Expected: []\t\t");
    System.out.println("Actual: " + Arrays.toString(sortedEmptyArray));

    // Test case 2: Array with one element
    int[] singleElementArray = { 5 };
    int[] sortedSingleElementArray = sorter.bubbleSort(singleElementArray);
    System.out.printf("Test: Single Element Array\t");
    System.out.printf("Expected: [5]\t\t");
    System.out.println("Actual: " + Arrays.toString(sortedSingleElementArray));

    // Test case 3: Array with multiple elements
    int[] multipleElementsArray = { 5, 2, 8, 1, 10 };
    int[] sortedMultipleElementsArray = sorter.bubbleSort(multipleElementsArray);
    System.out.printf("Test: Multiple Elements Array\t");
    System.out.printf("Expected: [1, 2, 5, 8, 10]\t");
    System.out.println("Actual: " + Arrays.toString(sortedMultipleElementsArray));
  }
}