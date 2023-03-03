import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class main {
    static JFrame frame;
        public static void main (String[] args) throws FileNotFoundException {
            //TEST FOR FILEREAD - ELOISE
            fileReader reader = new fileReader();
            String[][] dataSet = reader.fileReader();
            for (int i = 1; i < dataSet.length; i++) {
                for (int a = 2; a < 16; a++) {
                    if (!Objects.equals(dataSet[i][a], " ")) {
                        System.out.print(dataSet[i][a]+" ");
                    }
                }
                System.out.println(" ");
            };
            for (int i = 0; i < dataSet.length; i++){
                System.out.println("i = " + i + ": "+ dataSet[i][5]);

            }

            dataMenu frame2 = new dataMenu();
            frame2.Frame2();
        }
}