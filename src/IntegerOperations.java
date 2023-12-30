import java.util.List;

public class IntegerOperations {

    public int findMax(List<Integer> ints) throws Exception {
        Integer max = null;
        if (ints.size() == 0) {
            throw new Exception("Empty list");
        } else {
            for (int i : ints) {
                if (max == null || i > max) {
                    max = i;
                }
            }
        }
        return max;
    }

    public int findMin(List<Integer> ints) throws Exception {
        Integer min = null;
        if (ints.size() == 0) {
            throw new Exception("Empty list");
        } else {
            for (int i : ints) {
                if (min == null || i < min) {
                    min = i;
                }
            }
        }
        return min;
    }

    public double findAverage(List<Integer> ints) {
        double mean;
        if (ints.size() == 0) {
            mean = 0;
        } else {
            int sum = 0;
            for (int i : ints) {
                sum = sum + i;
            }
            mean = (double) sum / ints.size();
        }
        return mean;
    }
}