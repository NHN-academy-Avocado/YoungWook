package SubExersize;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arraytext {
    public static void saveArray(String[] v, String filename) throws IOException {
        FileWriter f = new FileWriter(filename);
        PrintWriter out = new PrintWriter(f);
        for (int i = 0; i < v.length; i++) {
            out.println(v[i]);
        }
        out.close();
        f.close();

    }
}
