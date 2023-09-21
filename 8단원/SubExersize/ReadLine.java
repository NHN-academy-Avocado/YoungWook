package SubExersize;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadLine {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("test.text");
        BufferedReader in = new BufferedReader(f);
        String line = in.readLine();
        while (line != null) {
            System.out.println(line);
            line = in.readLine();
        }
        f.close();
    }
}
