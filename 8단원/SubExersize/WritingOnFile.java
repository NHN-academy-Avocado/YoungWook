package SubExersize;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingOnFile {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter(",.txt", true);
        PrintWriter out = new PrintWriter(f);

        out.println("Welcome new user");

        out.close();
        f.close();
    }
}
