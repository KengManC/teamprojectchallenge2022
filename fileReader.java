import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileReader {
    public static String[][] fileReader () throws FileNotFoundException {
        //FILEREADINGSTUFF - ELOISE
        File MyFile = new File("DataFile.csv");
        Scanner myScanner = new Scanner(MyFile);
        int tracker = 0;
        String[][] array = new String[127][16];
        while (myScanner.hasNextLine()) {
            String data = myScanner.nextLine();
            data = data+",";
            data = data.replaceAll(",,", ", ,");
            data = data.replaceAll(",,", ", ,");
            array[tracker] = data.split(",");
            tracker++;
        }
        return array;
    }
}
