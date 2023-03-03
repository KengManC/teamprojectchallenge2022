import java.awt.*;
import java.io.FileNotFoundException;
import javax.swing.*;

public class dataMenu {
        static JFrame frame;
        public void Frame2() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                frame = new JFrame("Main Menu");
                frame.setSize(400,600);
                JPanel panel = new JPanel();
                panel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));
                JPanel panel1 = new JPanel();
                panel1.add(new JLabel("Welcome to the Data Centre"));
                panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
                JButton data1button = new JButton();
                JButton data2button = new JButton();
                JButton data3button = new JButton();
                JButton data4button = new JButton();
                data1button.setText("View Graphical Data");
                data2button.setText("View Student Performance");
                data3button.setText("View Module Difficulty Level");
                data4button.setText("Add New Data");

                panel.add(data2button);
                panel.add(data1button);
                panel.add(data3button);
                panel.add(data4button);

                frame.add(panel1, BorderLayout.PAGE_START);
                frame.add(panel, BorderLayout.PAGE_END);
                frame.pack();
                frame.setVisible(true);
                //GRAPHBUTTON
                data1button.addActionListener(e -> {
                        graphSelector frame3 = new graphSelector();
                        frame3.Frame3(frame);
                        frame.dispose();
                });
                //STUDENT PERFORMANCE BUTTON
                data2button.addActionListener(e -> {
                        studentPerformance framePerformance = null;
                        try {
                                framePerformance = new studentPerformance();
                        } catch (FileNotFoundException ex) {
                                ex.printStackTrace();
                        }
                        framePerformance.framePerformance(frame);
                        frame.dispose();
                });
                //MODULE DIFFICULTY BUTTON
                data3button.addActionListener(e -> {
                        moduleDifficulty difficultyFrame = new moduleDifficulty();
                        difficultyFrame.difficultyFrame(frame);
                        frame.dispose();
                });
                //USER ADD TO DATA BUTTON
                data4button.addActionListener(e -> {
                        userInput userInputFrame = new userInput();
                        userInputFrame.userInputFrame(frame);
                        frame.dispose();
                });
        }
}

