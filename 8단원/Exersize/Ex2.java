package Exersize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Ex2 {//값 0이 삽입될 때까지 키보드에서 양의 정수 시퀀스를 읽고 (마지막 0을 고려하지 않고)
    // 읽은 값의 평균을 나타내는 배수를 반환하는 공용 정적 메서드를 작성합니다.

    public static OptionalDouble Key() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(isr);
        int[] count = new int[0];
        while (Integer.parseInt(String.valueOf(keyboard)) != 0) {
            System.out.println("Insert a word: ");
            String line = keyboard.readLine();
            //count  배열에  입력값 추가하기
        }


        return Arrays.stream(count).average();

    }
}
