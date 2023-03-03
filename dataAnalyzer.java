import java.util.ArrayList;
import java.util.Collections;

public class dataAnalyzer {
    public static double[] analyzeData(String[][] data, int column) {
        // Extract the numeric data from the specified column and 2nd row
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 1; i < data.length; i++) {
            String valueStr = data[i][column].trim();
            if (!valueStr.isEmpty()) {
                int value = Integer.parseInt(valueStr);
                values.add(value);
            }
        }

        // Check if there are any numeric values
        if (values.isEmpty()) {
            return new double[0];
        }

        // Calculate mean
        double sum = 0;
        for (int value : values) {
            sum += value;
        }
        double mean = sum / values.size();

        // Calculate mode
        int mode = -1;
        int maxCount = 0;
        for (int value : values) {
            int count = Collections.frequency(values, value);
            if (count > maxCount) {
                mode = value;
                maxCount = count;
            }
        }

        // Calculate median
        Collections.sort(values);
        double median;
        if (values.size() % 2 == 0) {
            int midIndex = values.size() / 2;
            median = (values.get(midIndex - 1) + values.get(midIndex)) / 2.0;
        } else {
            median = values.get(values.size() / 2);
        }

        // Calculate range
        int range = Collections.max(values) - Collections.min(values);

        return new double[]{mean, mode, median, range};
    }
}

