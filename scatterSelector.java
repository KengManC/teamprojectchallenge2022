import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;

public class scatterSelector {

    JFrame scatterSelector;

    static JFrame frame;

    public void scatterGraphSelectorFrame(JFrame scatterGraphSelector){
        this.scatterSelector = scatterGraphSelector;
        frame = new JFrame("Please choose a module: ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));
        panel.setBorder(new EmptyBorder(new Insets(50,180,50,180)));
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

        panel.setBounds(61,11,81,140);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

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
                scatterSelector.setVisible(true);
            }
        });


        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        // opens scattergraph
        module1.addActionListener(e->{
            scatterGraph frameScatter = new scatterGraph();
            try {
                frameScatter.frame5(frame, 2);
            }catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

                frame.dispose();

        });
        module2.addActionListener(e->{
            scatterGraph frameScatter = new scatterGraph();
            try {
                frameScatter.frame5(frame, 3);
            }catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

            frame.dispose();

        });
        module3.addActionListener(e->{
            scatterGraph frameScatter = new scatterGraph();
            try {
                frameScatter.frame5(frame, 4);
            }catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

            frame.dispose();

        });
        module4.addActionListener(e->{
            scatterGraph frameScatter = new scatterGraph();
            try {
                frameScatter.frame5(frame, 5);
            }catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

            frame.dispose();

        });
        module5.addActionListener(e->{
            scatterGraph frameScatter = new scatterGraph();
            try {
                frameScatter.frame5(frame, 6);
            }catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

            frame.dispose();

        });
        module6.addActionListener(e->{
            scatterGraph frameScatter = new scatterGraph();
            try {
                frameScatter.frame5(frame, 7);
            }catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

            frame.dispose();

        });
        module7.addActionListener(e->{
            scatterGraph frameScatter = new scatterGraph();
            try {
                frameScatter.frame5(frame, 8);
            }catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

            frame.dispose();

        });
        module8.addActionListener(e->{
            scatterGraph frameScatter = new scatterGraph();
            try {
                frameScatter.frame5(frame, 9);
            }catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

            frame.dispose();

        });
        module9.addActionListener(e->{
            scatterGraph frameScatter = new scatterGraph();
            try {
                frameScatter.frame5(frame, 10);
            }catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

            frame.dispose();

        });
        module10.addActionListener(e->{
            scatterGraph frameScatter = new scatterGraph();
            try {
                frameScatter.frame5(frame, 11);
            }catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

            frame.dispose();

        });
        module11.addActionListener(e->{
            scatterGraph frameScatter = new scatterGraph();
            try {
                frameScatter.frame5(frame, 12);
            }catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

            frame.dispose();

        });
        module12.addActionListener(e->{
            scatterGraph frameScatter = new scatterGraph();
            try {
                frameScatter.frame5(frame, 13);
            }catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

            frame.dispose();

        });
        module13.addActionListener(e->{
            scatterGraph frameScatter = new scatterGraph();
            try {
                frameScatter.frame5(frame, 14);
            }catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

            frame.dispose();

        });
        module14.addActionListener(e->{
            scatterGraph frameScatter = new scatterGraph();
            try {
                frameScatter.frame5(frame, 15);
            }catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

            frame.dispose();

        });
        module15.addActionListener(e->{
            scatterGraph frameScatter = new scatterGraph();
            try {
                frameScatter.frame5(frame, 16);
            }catch (FileNotFoundException ex)
            {
                throw new RuntimeException(ex);
            }

            frame.dispose();

        });
    }

}
