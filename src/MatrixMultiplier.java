public class MatrixMultiplier {

  // multiplies two matrices, will reorder if necessary, throws exception if empty
  // or incompatible matrices
  public int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) throws Exception {
    int[][] result;
    if (matrix1.length == 0 || matrix2.length == 0) {
      throw new Exception("Empty matrix");
    } else if (matrix1.length != matrix2[0].length && matrix2.length != matrix1[0].length) {
      throw new Exception("Incompatible matrices");
    } else {
      if (matrix1[0].length == matrix2.length) {
        result = multiplyValidMatrices(matrix1, matrix2);
      } else {
        result = multiplyValidMatrices(matrix2, matrix1);
      }
    }
    return result;
  }

  // assumes matrix1 has the same number of rows as matrix2 has columns
  // matrix format is int[row][column]
  public int[][] multiplyValidMatrices(int[][] matrix1, int[][] matrix2) {
    int[][] result = new int[matrix1.length][matrix2[0].length];
    for (int m1R = 0; m1R < matrix1.length; m1R++) {
      for (int m2C = 0; m2C < matrix2[0].length; m2C++) {
        for (int m1C = 0; m1C < matrix1[0].length; m1C++) {
          for (int m2R = 0; m2R < matrix2.length; m2R++) {
            if(m1C == m2R){
            // System.out.println(matrix1[m1R][m1C] + " * " + matrix2[m2R][m2C]);
            result[m1R][m2C] += matrix1[m1R][m1C] * matrix2[m2R][m2C];
            }
          }
        }
      }
    }
    return result;
  }
}
