public class Sorter {
  public int[] bubbleSort(int[] ints) {
    if (ints.length <= 1) {
    } else {
      int workingLength = ints.length;
      for (int i = 0; i < workingLength; workingLength--) {
        for (int j = 0; j < workingLength - 1; j++) {
          if (ints[j] > ints[j + 1]) {
            int temp = ints[j];
            ints[j] = ints[j + 1];
            ints[j + 1] = temp;
          }
        }
      }
    }
    return ints;
  }
}
