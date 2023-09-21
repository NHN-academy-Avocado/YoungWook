package Exersize;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex4 {
    //파일 이름을 나타내는 문자열과 정수 n을 매개변수로 받아 텍스트파일에 n 크기의 곱셈 테이블을 쓰는 공용 정적 메서드를 작성합니다.
    // 예를 들어 n = 3인 경우 메서드는 다음과 같이 작성해야 합니다:
    public static void Multitable(String filename, int n) throws IOException {
        FileWriter f = new FileWriter(filename);
        PrintWriter out = new PrintWriter(f);
        for (int i = 1; i <= n; i++) {
            out.println("");
            for (int j = 1; j <= n; j++) {
                out.print("\t" + i * j);
            }
        }
        out.close();
        f.close();


    }

    public static void main(String[] args) throws IOException {
        Multitable("MultiTable", 6);
    }
}
