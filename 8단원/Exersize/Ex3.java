package Exersize;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex3 {
    //'/', ';' 또는 '%' 문자 중 하나로 시작하는 파일의 모든 줄을 동영상에 인쇄하는 공용 정적 메서드를 작성합니다.
    // 파일 이름은 매개변수로 지정해야 합니다.
    public static void video(String Filename) throws IOException {
        if (Filename.startsWith(",") || Filename.startsWith(";") || Filename.startsWith("%")) {
            FileReader f = new FileReader(Filename);
            BufferedReader in = new BufferedReader(f);
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);

            }

            in.close();
            f.close();
        } else {
            System.out.println("Filename does not start with '/', ';', or '%'.");
        }
    }


    public static void main(String[] args) throws IOException {
        video(",.txt");
    }
}
