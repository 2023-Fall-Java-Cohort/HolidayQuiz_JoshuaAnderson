import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixMultiplierTest {

  public static void main(String[] args) {
    MatrixMultiplier matrixMultiplier = new MatrixMultiplier();

    testEmptyMatrices(matrixMultiplier);
    testEmptyMatrix(matrixMultiplier);
    testIncompatibleMatrix(matrixMultiplier);
    testValidMatrices(matrixMultiplier);
    testMissOrderedMatrices(matrixMultiplier);
    testDeepValidMatrices(matrixMultiplier);
    loadTestDeepMatrices(matrixMultiplier);
    loadX100Matrices(matrixMultiplier);
  }

  // Test case 1: empty matrices
  public static void testEmptyMatrices(MatrixMultiplier matrixMultiplier) {
    int[][] emptyMatrix1 = new int[0][0];
    int[][] emptyMatrix2 = new int[0][0];
    System.out.printf("Test: Empty Matrices\t\t");
    System.out.printf("Expected: Exception - Empty matrix\t\t");
    try {
      int[][] result = matrixMultiplier.multiplyMatrices(emptyMatrix1, emptyMatrix2);
      System.out.println("Actual: " + Arrays.deepToString(result));
    } catch (Exception e) {
      System.out.println("Actual: Exception - " + e.getMessage());
    }
  }

  // Test case 2: one empty matrix
  public static void testEmptyMatrix(MatrixMultiplier matrixMultiplier) {
    int[][] Matrix1 = new int[1][3];
    int[] Matrix1Row = { 1, 2, 3 };
    Matrix1[0] = Matrix1Row;
    int[][] emptyMatrix2 = new int[0][0];
    System.out.printf("Test: One Empty Matrix\t\t");
    System.out.printf("Expected: Exception - Empty matrix\t\t");
    try {
      int[][] result = matrixMultiplier.multiplyMatrices(Matrix1, emptyMatrix2);
      System.out.println("Actual: " + Arrays.deepToString(result));
    } catch (Exception e) {
      System.out.println("Actual: Exception - " + e.getMessage());
    }
  }

  // Test case 3: incompatible matrices
  public static void testIncompatibleMatrix(MatrixMultiplier matrixMultiplier) {
    int[][] Matrix1 = new int[1][3];
    int[] Matrix1Row = { 1, 2, 3 };
    Matrix1[0] = Matrix1Row;
    int[][] Matrix2 = new int[1][2];
    int[] Matrix2Row = { 1, 2 };
    Matrix2[0] = Matrix2Row;
    System.out.printf("Test: Incompatible Matrices\t");
    System.out.printf("Expected: Exception - Incompatible Matrices\t");
    try {
      int[][] result = matrixMultiplier.multiplyMatrices(Matrix1, Matrix2);
      System.out.println("Actual: " + Arrays.deepToString(result));
    } catch (Exception e) {
      System.out.println("Actual: Exception - " + e.getMessage());
    }
  }

  // Test case 4: valid matrices
  public static void testValidMatrices(MatrixMultiplier matrixMultiplier) {
    int[][] Matrix1 = new int[1][3];
    int[] Matrix1Row = { 3, 1, 4 };
    Matrix1[0] = Matrix1Row;
    int[][] Matrix2 = new int[3][2];
    int[] Matrix2Row1 = { 4, 3 };
    int[] Matrix2Row2 = { 2, 5 };
    int[] Matrix2Row3 = { 6, 8 };
    Matrix2[0] = Matrix2Row1;
    Matrix2[1] = Matrix2Row2;
    Matrix2[2] = Matrix2Row3;
    System.out.printf("Test: Valid Matrices\t\t");
    System.out.printf("Expected: {{38, 46}}\t\t\t\t");
    try {
      int[][] result = matrixMultiplier.multiplyMatrices(Matrix1, Matrix2);
      System.out.println("Actual: " + Arrays.deepToString(result));
    } catch (Exception e) {
      System.out.println("Actual: Exception - " + e.getMessage());
    }
  }

  // Test case 4: miss-ordered matrices
  public static void testMissOrderedMatrices(MatrixMultiplier matrixMultiplier) {
    int[][] Matrix2 = new int[1][3];
    int[] Matrix2Row = { 3, 1, 4 };
    Matrix2[0] = Matrix2Row;
    int[][] Matrix1 = new int[3][2];
    int[] Matrix1Row1 = { 4, 3 };
    int[] Matrix1Row2 = { 2, 5 };
    int[] Matrix1Row3 = { 6, 8 };
    Matrix1[0] = Matrix1Row1;
    Matrix1[1] = Matrix1Row2;
    Matrix1[2] = Matrix1Row3;
    System.out.printf("Test: Miss Ordered Matrices\t");
    System.out.printf("Expected: {{38, 46}}\t\t\t\t");
    try {
      int[][] result = matrixMultiplier.multiplyMatrices(Matrix1, Matrix2);
      System.out.println("Actual: " + Arrays.deepToString(result));
    } catch (Exception e) {
      System.out.println("Actual: Exception - " + e.getMessage());
    }
  }

  // Test case 5: deep valid matrices
  public static void testDeepValidMatrices(MatrixMultiplier matrixMultiplier) {
    int[][] Matrix1 = new int[2][3];
    int[] Matrix1Row1 = { 3, 1, 4 };
    int[] Matrix1Row2 = { 1, 5, 9 };
    Matrix1[0] = Matrix1Row1;
    Matrix1[1] = Matrix1Row2;
    int[][] Matrix2 = new int[3][2];
    int[] Matrix2Row1 = { 4, 3 };
    int[] Matrix2Row2 = { 2, 5 };
    int[] Matrix2Row3 = { 6, 8 };
    Matrix2[0] = Matrix2Row1;
    Matrix2[1] = Matrix2Row2;
    Matrix2[2] = Matrix2Row3;
    System.out.printf("Test: Deep Valid Matrices\t");
    System.out.printf("Expected: {{38, 46}, {68, 100}}\t\t\t");
    try {
      int[][] result = matrixMultiplier.multiplyMatrices(Matrix1, Matrix2);
      System.out.println("Actual: " + Arrays.deepToString(result));
    } catch (Exception e) {
      System.out.println("Actual: Exception - " + e.getMessage());
    }
  }

  // Test case 5: load test valid matrices
  public static void loadTestDeepMatrices(MatrixMultiplier matrixMultiplier) {
    int[][] Matrix1 = {
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }
    };
    int[][] Matrix2 = {
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 },
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }
    };
    System.out.printf("Test: Deep Load Test\n");
    System.out.printf(
        "Expected: [[210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200], [210, 420, 630, 840, 1050, 1260, 1470, 1680, 1890, 2100, 2310, 2520, 2730, 2940, 3150, 3360, 3570, 3780, 3990, 4200]]\n");
    try {
      int[][] result = matrixMultiplier.multiplyMatrices(Matrix1, Matrix2);
      System.out.println("Actual: " + Arrays.deepToString(result));
    } catch (Exception e) {
      System.out.println("Actual: Exception - " + e.getMessage());
    }
  }

  // Test case 6: 1x100 and 100x1 matrices
  public static void loadX100Matrices(MatrixMultiplier matrixMultiplier) {
    int[][] Matrix1 = {
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
            31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
            41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
            51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
            61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
            71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
            81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
            91, 92, 93, 94, 95, 96, 97, 98, 99, 100
        }
    };
    int[][] Matrix2 = {
        { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 },
        { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 },
        { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 },
        { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 },
        { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 },
        { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 },
        { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 },
        { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 },
        { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 },
        { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }
    };
    System.out.printf("Test: Deep Load Test\t");
    System.out.printf("Expected: 5050\t");
    try {
      int[][] result = matrixMultiplier.multiplyMatrices(Matrix1, Matrix2);
      System.out.println("Actual: " + Arrays.deepToString(result));
    } catch (Exception e) {
      System.out.println("Actual: Exception - " + e.getMessage());
    }
  }
}