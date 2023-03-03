import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

//NOTFINISHED - Being worked on by Ella
public class studentPerformance extends JFrame {
    fileReader reader = new fileReader();
    String[][] dataSet = reader.fileReader();
    JFrame guidataMenu;
    static JFrame frame;

    public studentPerformance() throws FileNotFoundException {
        fileReader reader = new fileReader();
        String[][] dataSet = reader.fileReader();

    }

    public void framePerformance(JFrame guidataMenu) {
        this.guidataMenu = guidataMenu;
        frame = new JFrame("Please choose a Module to view the data of: ");
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
                guidataMenu.setVisible(true);
            }
        });
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        module1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTable newTable = new JTable();
                DefaultTableModel ModelTable = new DefaultTableModel();
                String[] headerNames = {"Student Reg Number", "Course", "Grade"};
                JFrame performanceFrame = new JFrame("Student Performance");
                ModelTable.setColumnIdentifiers(headerNames);
                newTable.setModel(ModelTable);
                JScrollPane scroll = new JScrollPane(newTable);
                performanceFrame.setVisible(true);
                performanceFrame.add(scroll);
                performanceFrame.setSize(1000, 500);
                for (int i = 0; i < dataSet.length; i++) {
                    try {
                        Integer.parseInt(dataSet[i][2]);
                        Object data[] = new Object[3];
                        data[0] = dataSet[i][0];
                        data[1] = dataSet[i][1];
                        data[2] = dataSet[i][2];
                        ModelTable.addRow(data);
                    } catch (NumberFormatException ex) {
                    }

                }
            }
        });

        module2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTable newTable = new JTable();
                DefaultTableModel ModelTable = new DefaultTableModel();
                String[] headerNames = {"Student Reg Number", "Course", "Grade"};
                JFrame performanceFrame = new JFrame("Student Performance");
                ModelTable.setColumnIdentifiers(headerNames);
                newTable.setModel(ModelTable);
                JScrollPane scroll = new JScrollPane(newTable);
                performanceFrame.setVisible(true);
                performanceFrame.add(scroll);
                performanceFrame.setSize(1000, 500);
                for (int i = 0; i < dataSet.length; i++) {
                    try {
                        Integer.parseInt(dataSet[i][3]);
                        Object data[] = new Object[3];
                        data[0] = dataSet[i][0];
                        data[1] = dataSet[i][1];
                        data[2] = dataSet[i][3];
                        ModelTable.addRow(data);
                    } catch (NumberFormatException ex) {
                    }

                }
            }
        });

        module3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTable newTable = new JTable();
                DefaultTableModel ModelTable = new DefaultTableModel();
                String[] headerNames = {"Student Reg Number", "Course", "Grade"};
                JFrame performanceFrame = new JFrame("Student Performance");
                ModelTable.setColumnIdentifiers(headerNames);
                newTable.setModel(ModelTable);
                JScrollPane scroll = new JScrollPane(newTable);
                performanceFrame.setVisible(true);
                performanceFrame.add(scroll);
                performanceFrame.setSize(1000, 500);
                for (int i = 0; i < dataSet.length; i++) {
                    try {
                        Integer.parseInt(dataSet[i][4]);
                        Object data[] = new Object[3];
                        data[0] = dataSet[i][0];
                        data[1] = dataSet[i][1];
                        data[2] = dataSet[i][4];
                        ModelTable.addRow(data);
                    } catch (NumberFormatException ex) {
                    }

                }
            }
        });

        module4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTable newTable = new JTable();
                DefaultTableModel ModelTable = new DefaultTableModel();
                String[] headerNames = {"Student Reg Number", "Course", "Grade"};
                JFrame performanceFrame = new JFrame("Student Performance");
                ModelTable.setColumnIdentifiers(headerNames);
                newTable.setModel(ModelTable);
                JScrollPane scroll = new JScrollPane(newTable);
                performanceFrame.setVisible(true);
                performanceFrame.add(scroll);
                performanceFrame.setSize(1000, 500);
                for (int i = 0; i < dataSet.length; i++) {
                    try {
                        Integer.parseInt(dataSet[i][5]);
                        Object data[] = new Object[3];
                        data[0] = dataSet[i][0];
                        data[1] = dataSet[i][1];
                        data[2] = dataSet[i][5];
                        ModelTable.addRow(data);
                    } catch (NumberFormatException ex) {
                    }

                }
            }
        });
        module5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTable newTable = new JTable();
                DefaultTableModel ModelTable = new DefaultTableModel();
                String[] headerNames = {"Student Reg Number", "Course", "Grade"};
                JFrame performanceFrame = new JFrame("Student Performance");
                ModelTable.setColumnIdentifiers(headerNames);
                newTable.setModel(ModelTable);
                JScrollPane scroll = new JScrollPane(newTable);
                performanceFrame.setVisible(true);
                performanceFrame.add(scroll);
                performanceFrame.setSize(1000, 500);
                for (int i = 0; i < dataSet.length; i++) {
                    try {
                        Integer.parseInt(dataSet[i][6]);
                        Object data[] = new Object[3];
                        data[0] = dataSet[i][0];
                        data[1] = dataSet[i][1];
                        data[2] = dataSet[i][6];
                        ModelTable.addRow(data);
                    } catch (NumberFormatException ex) {
                    }

                }
            }
        });

        module6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTable newTable = new JTable();
                DefaultTableModel ModelTable = new DefaultTableModel();
                String[] headerNames = {"Student Reg Number", "Course", "Grade"};
                JFrame performanceFrame = new JFrame("Student Performance");
                ModelTable.setColumnIdentifiers(headerNames);
                newTable.setModel(ModelTable);
                JScrollPane scroll = new JScrollPane(newTable);
                performanceFrame.setVisible(true);
                performanceFrame.add(scroll);
                performanceFrame.setSize(1000, 500);
                for (int i = 0; i < dataSet.length; i++) {
                    try {
                        Integer.parseInt(dataSet[i][7]);
                        Object data[] = new Object[3];
                        data[0] = dataSet[i][0];
                        data[1] = dataSet[i][1];
                        data[2] = dataSet[i][7];
                        ModelTable.addRow(data);
                    } catch (NumberFormatException ex) {
                    }

                }
            }
        });

        module7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTable newTable = new JTable();
                DefaultTableModel ModelTable = new DefaultTableModel();
                String[] headerNames = {"Student Reg Number", "Course", "Grade"};
                JFrame performanceFrame = new JFrame("Student Performance");
                ModelTable.setColumnIdentifiers(headerNames);
                newTable.setModel(ModelTable);
                JScrollPane scroll = new JScrollPane(newTable);
                performanceFrame.setVisible(true);
                performanceFrame.add(scroll);
                performanceFrame.setSize(1000, 500);
                for (int i = 0; i < dataSet.length; i++) {
                    try {
                        Integer.parseInt(dataSet[i][8]);
                        Object data[] = new Object[3];
                        data[0] = dataSet[i][0];
                        data[1] = dataSet[i][1];
                        data[2] = dataSet[i][8];
                        ModelTable.addRow(data);
                    } catch (NumberFormatException ex) {
                    }

                }
            }
        });

        module8.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTable newTable = new JTable();
                DefaultTableModel ModelTable = new DefaultTableModel();
                String[] headerNames = {"Student Reg Number", "Course", "Grade"};
                JFrame performanceFrame = new JFrame("Student Performance");
                ModelTable.setColumnIdentifiers(headerNames);
                newTable.setModel(ModelTable);
                JScrollPane scroll = new JScrollPane(newTable);
                performanceFrame.setVisible(true);
                performanceFrame.add(scroll);
                performanceFrame.setSize(1000, 500);
                for (int i = 0; i < dataSet.length; i++) {
                    try {
                        Integer.parseInt(dataSet[i][9]);
                        Object data[] = new Object[3];
                        data[0] = dataSet[i][0];
                        data[1] = dataSet[i][1];
                        data[2] = dataSet[i][9];
                        ModelTable.addRow(data);
                    } catch (NumberFormatException ex) {
                    }

                }
            }
        });

        module9.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTable newTable = new JTable();
                DefaultTableModel ModelTable = new DefaultTableModel();
                String[] headerNames = {"Student Reg Number", "Course", "Grade"};
                JFrame performanceFrame = new JFrame("Student Performance");
                ModelTable.setColumnIdentifiers(headerNames);
                newTable.setModel(ModelTable);
                JScrollPane scroll = new JScrollPane(newTable);
                performanceFrame.setVisible(true);
                performanceFrame.add(scroll);
                performanceFrame.setSize(1000, 500);
                for (int i = 0; i < dataSet.length; i++) {
                    try {
                        Integer.parseInt(dataSet[i][10]);
                        Object data[] = new Object[3];
                        data[0] = dataSet[i][0];
                        data[1] = dataSet[i][1];
                        data[2] = dataSet[i][10];
                        ModelTable.addRow(data);
                    } catch (NumberFormatException ex) {
                    }

                }
            }
        });

        module10.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTable newTable = new JTable();
                DefaultTableModel ModelTable = new DefaultTableModel();
                String[] headerNames = {"Student Reg Number", "Course", "Grade"};
                JFrame performanceFrame = new JFrame("Student Performance");
                ModelTable.setColumnIdentifiers(headerNames);
                newTable.setModel(ModelTable);
                JScrollPane scroll = new JScrollPane(newTable);
                performanceFrame.setVisible(true);
                performanceFrame.add(scroll);
                performanceFrame.setSize(1000, 500);
                for (int i = 0; i < dataSet.length; i++) {
                    try {
                        Integer.parseInt(dataSet[i][11]);
                        Object data[] = new Object[3];
                        data[0] = dataSet[i][0];
                        data[1] = dataSet[i][1];
                        data[2] = dataSet[i][11];
                        ModelTable.addRow(data);
                    } catch (NumberFormatException ex) {
                    }

                }
            }
        });

        module11.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTable newTable = new JTable();
                DefaultTableModel ModelTable = new DefaultTableModel();
                String[] headerNames = {"Student Reg Number", "Course", "Grade"};
                JFrame performanceFrame = new JFrame("Student Performance");
                ModelTable.setColumnIdentifiers(headerNames);
                newTable.setModel(ModelTable);
                JScrollPane scroll = new JScrollPane(newTable);
                performanceFrame.setVisible(true);
                performanceFrame.add(scroll);
                performanceFrame.setSize(1000, 500);
                for (int i = 0; i < dataSet.length; i++) {
                    try {
                        Integer.parseInt(dataSet[i][12]);
                        Object data[] = new Object[3];
                        data[0] = dataSet[i][0];
                        data[1] = dataSet[i][1];
                        data[2] = dataSet[i][12];
                        ModelTable.addRow(data);
                    } catch (NumberFormatException ex) {
                    }

                }
            }
        });

        module12.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTable newTable = new JTable();
                DefaultTableModel ModelTable = new DefaultTableModel();
                String[] headerNames = {"Student Reg Number", "Course", "Grade"};
                JFrame performanceFrame = new JFrame("Student Performance");
                ModelTable.setColumnIdentifiers(headerNames);
                newTable.setModel(ModelTable);
                JScrollPane scroll = new JScrollPane(newTable);
                performanceFrame.setVisible(true);
                performanceFrame.add(scroll);
                performanceFrame.setSize(1000, 500);
                for (int i = 0; i < dataSet.length; i++) {
                    try {
                        Integer.parseInt(dataSet[i][13]);
                        Object data[] = new Object[3];
                        data[0] = dataSet[i][0];
                        data[1] = dataSet[i][1];
                        data[2] = dataSet[i][13];
                        ModelTable.addRow(data);
                    } catch (NumberFormatException ex) {
                    }

                }
            }
        });

        module13.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTable newTable = new JTable();
                DefaultTableModel ModelTable = new DefaultTableModel();
                String[] headerNames = {"Student Reg Number", "Course", "Grade"};
                JFrame performanceFrame = new JFrame("Student Performance");
                ModelTable.setColumnIdentifiers(headerNames);
                newTable.setModel(ModelTable);
                JScrollPane scroll = new JScrollPane(newTable);
                performanceFrame.setVisible(true);
                performanceFrame.add(scroll);
                performanceFrame.setSize(1000, 500);
                for (int i = 0; i < dataSet.length; i++) {
                    try {
                        Integer.parseInt(dataSet[i][14]);
                        Object data[] = new Object[3];
                        data[0] = dataSet[i][0];
                        data[1] = dataSet[i][1];
                        data[2] = dataSet[i][14];
                        ModelTable.addRow(data);
                    } catch (NumberFormatException ex) {
                    }

                }
            }
        });

        module14.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTable newTable = new JTable();
                DefaultTableModel ModelTable = new DefaultTableModel();
                String[] headerNames = {"Student Reg Number", "Course", "Grade"};
                JFrame performanceFrame = new JFrame("Student Performance");
                ModelTable.setColumnIdentifiers(headerNames);
                newTable.setModel(ModelTable);
                JScrollPane scroll = new JScrollPane(newTable);
                performanceFrame.setVisible(true);
                performanceFrame.add(scroll);
                performanceFrame.setSize(1000, 500);
                for (int i = 0; i < dataSet.length; i++) {
                    try {
                        Integer.parseInt(dataSet[i][15]);
                        Object data[] = new Object[3];
                        data[0] = dataSet[i][0];
                        data[1] = dataSet[i][1];
                        data[2] = dataSet[i][15];
                        ModelTable.addRow(data);
                    } catch (NumberFormatException ex) {
                    }

                }
            }
        });

        module15.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JTable newTable = new JTable();
                DefaultTableModel ModelTable = new DefaultTableModel();
                String[] headerNames = {"Student Reg Number", "Course", "Grade"};
                JFrame performanceFrame = new JFrame("Student Performance");
                ModelTable.setColumnIdentifiers(headerNames);
                newTable.setModel(ModelTable);
                JScrollPane scroll = new JScrollPane(newTable);
                performanceFrame.setVisible(true);
                performanceFrame.add(scroll);
                performanceFrame.setSize(1000, 500);
                for (int i = 0; i < dataSet.length; i++) {
                    try {
                        Integer.parseInt(dataSet[i][16]);
                        Object data[] = new Object[3];
                        data[0] = dataSet[i][0];
                        data[1] = dataSet[i][1];
                        data[2] = dataSet[i][16];
                        ModelTable.addRow(data);
                    } catch (NumberFormatException ex) {
                    }

                }
            }
        });
    }
}