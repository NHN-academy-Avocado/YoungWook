package Exersize;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class IOFile extends Throwable {

    public static void setInput(BufferedReader input) {
        IOFile.input = input;
    }

    private static BufferedReader input;

    public static int countLines() throws IOException {


        int count = 0;

        String line = input.readLine();
        while (line != null) {
            count++;
            line = input.readLine();
        }
        return count;

    }

    public static void write(OutputStream os) throws IOException {  //작성한 내요 os에 저장
        FileWriter out = new FileWriter(String.valueOf(os));
        OutputStreamWriter o = new OutputStreamWriter(os);
        InputStreamReader is = new InputStreamReader(System.in);
        System.out.print("write: ");
        BufferedReader key = new BufferedReader(is);
        String line = key.readLine();

        o.write(line);

    }

    public static void print() throws IOException {  //파일 내용 sout으로 출력하기

    }

    public static void copy(String filename) throws IOException { //파일 내용을 복사하고 복사본을 파일로 내보냅니다
        //String line = input.readLine();
        //        while (line != null) {
        //            out.println(line);
        //            line = input.readLine();
        //        }

    }

    public static void delete() throws IOException { //저장소에 파일을 삭제합니다.

    }
}
