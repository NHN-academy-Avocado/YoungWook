package Course8.Exersize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Ex1 {

    //is 지정된 입력 채널에서 읽은 n개의 문자열 배열을 반환합니다.
    public static String[] loadArray(InputStream is, int n) throws IOException {
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            lines[i] = line;
        }
        return lines;


    }

    // 문자열 배열 SA를 OS가 지정한 출력 채널에 씁니다.
    public static void saveArray(OutputStream os, String[] sa) throws IOException {
        for (String line : sa) {
            os.write(line.getBytes());
            os.write('\n');
        }

    }

    public static void main(String[] args) throws IOException {

        InputStream is = System.in;
        System.out.print("How many return?: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        int n = Integer.parseInt(reader.readLine());

        System.out.println("Enter " + n + " lines: ");
        String[] lines = loadArray(is, n);

        System.out.println("Load lines: ");
        for (String line : lines) {
            System.out.println(line);
        }


    }


}
