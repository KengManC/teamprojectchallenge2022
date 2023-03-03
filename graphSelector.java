import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.FileNotFoundException;

public class graphSelector{
    JFrame guidataMenu;
    static JFrame frame;
    public void Frame3(JFrame guidataMenu) {
        this.guidataMenu = guidataMenu;
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame = new JFrame("Please choose a graph: ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));
        panel.setBorder(new EmptyBorder(new Insets(50, 180, 50, 180)));
        JButton scatterGraph = new JButton("Scattergraph");
        JButton histogramGraph = new JButton("Histogram");
        JButton backbutton = new JButton("Go Back");
        panel.add(scatterGraph);
        panel.add(histogramGraph);
        panel.add(backbutton);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        backbutton.addActionListener(e -> {
            frame.dispose();
            guidataMenu.setVisible(true);
        });
        // open histogramselector
        histogramGraph.addActionListener(e -> {
            HistoSelector histoSelectorFrame = new HistoSelector();
            histoSelectorFrame.histoSelectorFrame(frame);
            frame.dispose();
        });
        // open scattergraph
        scatterGraph.addActionListener(e -> {
        //if clicked take the user to the scatter graph
            scatterSelector scatterSelectorFrame = new scatterSelector();
            scatterSelectorFrame.scatterGraphSelectorFrame(frame);
            frame.dispose();
        });
    }
}