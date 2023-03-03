import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;

public class moduleDifficulty {

    JFrame difficultySelector;

    static JFrame frame;

    public void difficultyFrame(JFrame difficultyFrame) {
        this.difficultySelector = difficultyFrame;
        frame = new JFrame("Module Difficulty");
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

        module1.addActionListener(e -> {
            try {
                String[][] data = fileReader.fileReader();
                int column = 2; // Change this to the desired column number
                double[] values = dataAnalyzer.analyzeData(data, column);
                difficultyGraph.createGraph(values);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });

        module2.addActionListener(e -> {
            try {
                String[][] data = fileReader.fileReader();
                int column = 3; // Change this to the desired column number
                double[] values = dataAnalyzer.analyzeData(data, column);
                difficultyGraph.createGraph(values);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });

        module3.addActionListener(e -> {
            try {
                String[][] data = fileReader.fileReader();
                int column = 4; // Change this to the desired column number
                double[] values = dataAnalyzer.analyzeData(data, column);
                difficultyGraph.createGraph(values);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });

        module4.addActionListener(e -> {
            try {
                String[][] data = fileReader.fileReader();
                int column = 5; // Change this to the desired column number
                double[] values = dataAnalyzer.analyzeData(data, column);
                difficultyGraph.createGraph(values);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });

        module5.addActionListener(e -> {
            try {
                String[][] data = fileReader.fileReader();
                int column = 6; // Change this to the desired column number
                double[] values = dataAnalyzer.analyzeData(data, column);
                difficultyGraph.createGraph(values);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });

        module6.addActionListener(e -> {
            try {
                String[][] data = fileReader.fileReader();
                int column = 7; // Change this to the desired column number
                double[] values = dataAnalyzer.analyzeData(data, column);
                difficultyGraph.createGraph(values);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });

        module7.addActionListener(e -> {
            try {
                String[][] data = fileReader.fileReader();
                int column = 8; // Change this to the desired column number
                double[] values = dataAnalyzer.analyzeData(data, column);
                difficultyGraph.createGraph(values);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });

        module8.addActionListener(e -> {
            try {
                String[][] data = fileReader.fileReader();
                int column = 9; // Change this to the desired column number
                double[] values = dataAnalyzer.analyzeData(data, column);
                difficultyGraph.createGraph(values);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });

        module9.addActionListener(e -> {
            try {
                String[][] data = fileReader.fileReader();
                int column = 10; // Change this to the desired column number
                double[] values = dataAnalyzer.analyzeData(data, column);
                difficultyGraph.createGraph(values);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });

        module10.addActionListener(e -> {
            try {
                String[][] data = fileReader.fileReader();
                int column = 11; // Change this to the desired column number
                double[] values = dataAnalyzer.analyzeData(data, column);
                difficultyGraph.createGraph(values);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });

        module11.addActionListener(e -> {
            try {
                String[][] data = fileReader.fileReader();
                int column = 12; // Change this to the desired column number
                double[] values = dataAnalyzer.analyzeData(data, column);
                difficultyGraph.createGraph(values);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });

        module12.addActionListener(e -> {
            try {
                String[][] data = fileReader.fileReader();
                int column = 13; // Change this to the desired column number
                double[] values = dataAnalyzer.analyzeData(data, column);
                difficultyGraph.createGraph(values);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });

        module13.addActionListener(e -> {
            try {
                String[][] data = fileReader.fileReader();
                int column = 14; // Change this to the desired column number
                double[] values = dataAnalyzer.analyzeData(data, column);
                difficultyGraph.createGraph(values);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });

        module14.addActionListener(e -> {
            try {
                String[][] data = fileReader.fileReader();
                int column = 15; // Change this to the desired column number
                double[] values = dataAnalyzer.analyzeData(data, column);
                difficultyGraph.createGraph(values);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });

        module15.addActionListener(e -> {
            try {
                String[][] data = fileReader.fileReader();
                int column = 16; // Change this to the desired column number
                double[] values = dataAnalyzer.analyzeData(data, column);
                difficultyGraph.createGraph(values);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        });

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);


    }
}
