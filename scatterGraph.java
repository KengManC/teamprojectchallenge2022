import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.util.Objects;

public class scatterGraph extends JFrame {
    JFrame scatterSelector;
    int row;
    static JFrame frame;
    public void frame5(JFrame scatterSelector, int row) throws FileNotFoundException {
        this.scatterSelector = scatterSelector;
        this.row = row;
        fileReader reader = new fileReader();
        String[][] dataSet = reader.fileReader();
        double[] values = new double[127];

        for (int i = 1; i < 127; i++){
            try {
                values[i] = Integer.parseInt(dataSet[i][row]);
            }
            catch (NumberFormatException e){
                values[i] = Double.NaN;
            }
        }

        XYSeries series = new XYSeries("Data");
        for (int i = 1; i < values.length; i++) {
            series.add(i, values[i]);
        }
        XYDataset xyDataset = new XYSeriesCollection(series);

        JFreeChart chart = ChartFactory.createScatterPlot("Scatter Plot", "X-axis", "Y-axis", xyDataset);

        frame = new JFrame("Scatter Plot");
        JButton backbutton = new JButton();
        backbutton.setText("Go Back");
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
                scatterSelector.setVisible(true);
            }
        });
    }
}
