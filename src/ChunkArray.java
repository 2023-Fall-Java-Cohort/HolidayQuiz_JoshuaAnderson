public class ChunkArray {

  public int[][] chunkArray(int[] array, int chunkSize) {
    int[][] chunkedArray = new int[array.length / chunkSize][chunkSize];
    for (int i = 0; i < array.length; i += chunkSize) {
      for (int j = 0; j < chunkSize; j++) {
        chunkedArray[i][j] = array[i + j];
      }
    }
    return chunkedArray;
  }
}
