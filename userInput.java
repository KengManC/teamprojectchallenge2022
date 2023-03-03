import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class userInput {
    JFrame guidataMenu;
    static JFrame frame;
    public void userInputFrame(JFrame guidataMenu) throws IOException {
        this.guidataMenu = guidataMenu;
        frame = new JFrame("Add New Data");
        frame.setSize(400,600);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                guidataMenu.setVisible(true);
            }
        });
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        panel.setBorder(new EmptyBorder(new Insets(10, 20, 10, 20)));

        JLabel A = new JLabel("Enter Student Registration");
        JTextField enterA = new JTextField(null, 15);
        JLabel B = new JLabel("Enter Course");
        JTextField enterB = new JTextField(null, 15);
        JLabel C = new JLabel("Enter CE101-4-FY Marks");
        JTextField enterC= new JTextField(null, 15);
        JLabel D = new JLabel("Enter CE101-4-SP Marks");
        JTextField enterD = new JTextField(null, 15);
        JLabel E = new JLabel("Enter CE141-4-AU Marks");
        JTextField enterE = new JTextField(null, 15);
        JLabel F = new JLabel("Enter CE141-4-FY Marks");
        JTextField enterF = new JTextField(null, 15);
        JLabel G = new JLabel("Enter CE142-4-AU Marks");
        JTextField enterG = new JTextField(null, 15);
        JLabel H = new JLabel("Enter CE142-4-FY Marks");
        JTextField enterH = new JTextField(null, 15);
        JLabel I = new JLabel("Enter CE151-4-AU Marks");
        JTextField enterI = new JTextField(null, 15);
        JLabel J = new JLabel("Enter CE152-4-SP Marks");
        JTextField enterJ = new JTextField(null, 15);
        JLabel K = new JLabel("Enter CE153-4-AU Marks");
        JTextField enterK = new JTextField(null, 15);
        JLabel L = new JLabel("Enter CE154-4-SP Marks");
        JTextField enterL = new JTextField(null, 15);
        JLabel M = new JLabel("Enter CE155-4-SP Marks");
        JTextField enterM = new JTextField(null, 15);
        JLabel N = new JLabel("Enter CE161-4-AU Marks");
        JTextField enterN = new JTextField(null, 15);
        JLabel O = new JLabel("Enter CE162-4-SP Marks");
        JTextField enterO = new JTextField(null, 15);
        JLabel P = new JLabel("Enter CE163-4-AU Marks");
        JTextField enterP = new JTextField(null, 15);
        JLabel Q = new JLabel("Enter CE164-4-SP Marks");
        JTextField enterQ = new JTextField(null, 15);

        JButton okButton = new JButton("Add Data");
        panel.add(A);
        panel.add(enterA);
        panel.add(B);
        panel.add(enterB);
        panel.add(C);
        panel.add(enterC);
        panel.add(D);
        panel.add(enterD);
        panel.add(E);
        panel.add(enterE);
        panel.add(F);
        panel.add(enterF);
        panel.add(G);
        panel.add(enterG);
        panel.add(H);
        panel.add(enterH);
        panel.add(I);
        panel.add(enterI);
        panel.add(J);
        panel.add(enterJ);
        panel.add(K);
        panel.add(enterK);
        panel.add(L);
        panel.add(enterL);
        panel.add(M);
        panel.add(enterM);
        panel.add(N);
        panel.add(enterN);
        panel.add(O);
        panel.add(enterO);
        panel.add(P);
        panel.add(enterP);
        panel.add(Q);
        panel.add(enterQ);
        panel.add(okButton);

        frame.add(panel);
        frame.setTitle("Add New Data");
        //create list
        //add data from textfields to list
        //iterate through list adding to cells

        okButton.addActionListener(e -> {
            String[] data = {enterA.getText(), enterB.getText(), enterC.getText(), enterD.getText(), enterE.getText(), enterF.getText(), enterG.getText(), enterH.getText(), enterI.getText(), enterJ.getText(), enterK.getText(), enterL.getText(), enterM.getText(), enterN.getText(), enterO.getText(), enterP.getText(), enterQ.getText()};
            for (String datum : data) {
                try {
                    Files.write(Paths.get("DataFile.csv"), datum.getBytes(), StandardOpenOption.APPEND);
                    Files.write(Paths.get("DataFile.csv"), ",".getBytes(), StandardOpenOption.APPEND);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}