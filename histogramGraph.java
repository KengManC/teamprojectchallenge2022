import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.util.Objects;

public class histogramGraph extends JFrame {
    JFrame guigraphSelector;
    int row;
    static JFrame frame;
        public void Frame4(JFrame guigraphSelector, int row, String moduleName) throws FileNotFoundException {
            this.guigraphSelector = guigraphSelector;
            this.row = row;
            fileReader reader = new fileReader();
            String[][] dataSet = reader.fileReader();
            double[] values = new double[127];

            //TO ADD: add data to histogram: students marks in each module by frequency

//            for (int i = 1; i < dataSet.length; i++) {
//                for (int a = 2; a < 16; a++) {
//                    if (!Objects.equals(dataSet[i][a], " ")) {
//                        System.out.print(dataSet[i][a] + " ");
//                    }
//                }
//                System.out.println(" ");
//            }
            for (int i = 1; i < 127; i++){
                try {
                    values[i] = Integer.parseInt(dataSet[i][row]);
                    System.out.println(values[i]);
                }
                catch (NumberFormatException e){
                    values[i] = Double.NaN;

                }
            }

//            double[] values = { 95, 49, 14, 59, 50, 66, 47, 40, 1, 67,
//                                12, 58, 28, 63, 14, 9, 31, 17, 94, 71,
//                                49, 64, 73, 97, 15, 63, 10, 12, 31, 62,
//                                93, 49, 74, 90, 59, 14, 15, 88, 26, 57,
//                                77, 44, 58, 91, 10, 67, 57, 19, 88, 84 };

            HistogramDataset dataset = new HistogramDataset();
            dataset.addSeries("key", values, 20);
            boolean legend = true;
            boolean tooltips = true;
            boolean urls = true;
            JFreeChart chart = ChartFactory.createHistogram(moduleName, "Grade", "Frequency", dataset, PlotOrientation.VERTICAL, legend, tooltips, urls);
            chart.setBorderVisible(false);
            frame = new JFrame("Histogram");
            JButton backbutton = new JButton();
            backbutton.setText("Go Back");
            //BACK BUTTON DONT WORK
            JPanel panel = new JPanel();
            panel.add(backbutton);
            frame.getContentPane().add(new ChartPanel(chart));
            frame.pack();
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);

            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    guigraphSelector.setVisible(true);
                }
            });
    }
}