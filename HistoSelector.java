import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;

public class HistoSelector{
    JFrame guigraphSelector;
    static JFrame frame;
    public void histoSelectorFrame(JFrame guigraphSelector) {
        this.guigraphSelector = guigraphSelector;
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame = new JFrame("Please choose a Module: ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));
        panel.setBorder(new EmptyBorder(new Insets(50, 180, 50, 180)));
        JButton module1 = new JButton("CE101-4-FY");
        JButton module2 = new JButton("CE101-4-SP");
        JButton module3 = new JButton("CE141-4-AU");
        JButton module4 = new JButton("CE141-4-FY");
        JButton module5 = new JButton("CE142-4-AU");
        JButton module6 = new JButton("CE142-4-FY");
        JButton module7 = new JButton("CE151-4-AU");
        JButton module8 = new JButton("CE152-4-SP");
        JButton module9 = new JButton("CE153-4-AU");
        JButton module10 = new JButton("CE154-4-SP");
        JButton module11 = new JButton("CE155-4-SP");
        JButton module12 = new JButton("CE161-4-AU");
        JButton module13 = new JButton("CE162-4-SP");
        JButton module14 = new JButton("CE163-4-AU");
        JButton module15 = new JButton("CE164-4-SP");

        panel.setBounds(61, 11, 81, 140);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(module1);
        panel.add(module2);
        panel.add(module3);
        panel.add(module4);
        panel.add(module5);
        panel.add(module6);
        panel.add(module7);
        panel.add(module8);
        panel.add(module9);
        panel.add(module10);
        panel.add(module11);
        panel.add(module12);
        panel.add(module13);
        panel.add(module14);
        panel.add(module15);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                guigraphSelector.setVisible(true);
            }
        });

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        // open a histogram
        module1.addActionListener(e -> {
            //if clicked take the user to the scatter graph
            histogramGraph frame4 = new histogramGraph();
            try {
                frame4.Frame4(frame, 2, "CE101-4-FY: Team Project Challenge");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        module2.addActionListener(e -> {
            //if clicked take the user to the scatter graph
            histogramGraph frame4 = new histogramGraph();
            try {
                frame4.Frame4(frame, 3, "CE101-4-SP: Team Project Challenge");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        module3.addActionListener(e -> {
            //if clicked take the user to the scatter graph
            histogramGraph frame4 = new histogramGraph();
            try {
                frame4.Frame4(frame, 4, "CE141-4-AU: Mathematics For Computing");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        module4.addActionListener(e -> {
            //if clicked take the user to the scatter graph
            histogramGraph frame4 = new histogramGraph();
            try {
                frame4.Frame4(frame, 5, "CE141-4-FY: Mathematics For Computing");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        module5.addActionListener(e -> {
            //if clicked take the user to the scatter graph
            histogramGraph frame4 = new histogramGraph();
            try {
                frame4.Frame4(frame, 6, "CE142-4-AU: Mathematics For Engineers");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        module6.addActionListener(e -> {
            //if clicked take the user to the scatter graph
            histogramGraph frame4 = new histogramGraph();
            try {
                frame4.Frame4(frame, 7, "CE142-4-FY: Mathematics For Engineers");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        module7.addActionListener(e -> {
            //if clicked take the user to the scatter graph
            histogramGraph frame4 = new histogramGraph();
            try {
                frame4.Frame4(frame, 8, "CE151-4-AU: Introduction to Programming");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        module8.addActionListener(e -> {
            //if clicked take the user to the scatter graph
            histogramGraph frame4 = new histogramGraph();
            try {
                frame4.Frame4(frame, 9, "CE152-4-SP: Object-Oriented Programming");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        module9.addActionListener(e -> {
            //if clicked take the user to the scatter graph
            histogramGraph frame4 = new histogramGraph();
            try {
                frame4.Frame4(frame, 10, "CE153-4-AU: Introduction to Databases");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        module10.addActionListener(e -> {
            //if clicked take the user to the scatter graph
            histogramGraph frame4 = new histogramGraph();
            try {
                frame4.Frame4(frame, 11, "CE154-4-SP: Web Development");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        module11.addActionListener(e -> {
            //if clicked take the user to the scatter graph
            histogramGraph frame4 = new histogramGraph();
            try {
                frame4.Frame4(frame, 12, "CE155-4-SP: Network Fundamentals");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        module12.addActionListener(e -> {
            //if clicked take the user to the scatter graph
            histogramGraph frame4 = new histogramGraph();
            try {
                frame4.Frame4(frame, 13, "CE161-4-AU: Fundamentals of Digital Systems");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        module13.addActionListener(e -> {
            //if clicked take the user to the scatter graph
            histogramGraph frame4 = new histogramGraph();
            try {
                frame4.Frame4(frame, 14, "CE162-4-SP: Digital Electronic Systems");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        module14.addActionListener(e -> {
            //if clicked take the user to the scatter graph
            histogramGraph frame4 = new histogramGraph();
            try {
                frame4.Frame4(frame, 15, "CE163-4-AU: Foundations of Electronics I");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        module15.addActionListener(e -> {
            //if clicked take the user to the scatter graph
            histogramGraph frame4 = new histogramGraph();
            try {
                frame4.Frame4(frame, 16, "CE164-4-SP: Foundation of Electronics II");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });

    }
    }
