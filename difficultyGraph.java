import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class difficultyGraph {
    static JFrame frame;

    public static void createGraph(double[] values) {
        // Create dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(values[0], "Statistics", "Mean");
        dataset.addValue(values[1], "Statistics", "Mode");
        dataset.addValue(values[2], "Statistics", "Median");
        dataset.addValue(values[3], "Statistics", "Range");

        // Create chart
        JFreeChart chart = ChartFactory.createBarChart("Module Statistics",
                "Statistical Measure", "Value", dataset);

        // Create chart panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 300));

        // Create frame
        frame = new JFrame("Module Difficulty Graph");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
