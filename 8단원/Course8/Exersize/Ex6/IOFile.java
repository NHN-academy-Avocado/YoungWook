package Course8.Exersize.Ex6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.JOptionPane;

public class IOFile extends Throwable {


    public static void countLines() {
        String filename = JOptionPane.showInputDialog("Input FileName: ");
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filename)))) {
            int count = 0;

            String line = br.readLine();
            while (line != null) {
                count++;
                line = br.readLine();
            }
            System.out.println(count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void write(OutputStream os) {  //작성한 내용 os에 저장
        try (BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
             PrintStream out = new PrintStream(os)) {
            System.out.println("Write:");
            System.out.flush();
            String line = key.readLine();

            while (!line.equals("")) {
                out.println(line);
                line = key.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void print() throws IOException {  //파일 내용 sout으로 출력하기
        String filename = JOptionPane.showInputDialog("Input Write FileName: ");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }

    }

    public static void copy(String filename) throws IOException { //파일 내용을 복사하고 복사본을 파일로 내보냅니다

        try (BufferedReader br = new BufferedReader(new FileReader(filename));
             FileWriter fw = new FileWriter("Copy-" + filename + ".txt")) {
            String line = br.readLine();
            while (line != null) {
                fw.write(line);
                line = br.readLine();
            }
        }


    }

    public static void delete() { //저장소에 파일을 삭제합니다.
        String filename = JOptionPane.showInputDialog("Input Write FileName: ");
        File df = new File(filename);
        boolean b = df.delete();

    }
}
