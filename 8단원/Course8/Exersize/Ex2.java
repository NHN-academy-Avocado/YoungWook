package Course8.Exersize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.OptionalDouble;

public class Ex2 {//값 0이 삽입될 때까지 키보드에서 양의 정수 시퀀스를 읽고 (마지막 0을 고려하지 않고)
    // 읽은 값의 평균을 나타내는 배수를 반환하는 공용 정적 메서드를 작성합니다.


    public static OptionalDouble CalculateAverage() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(isr);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Insert a positve Integer (0=Exit): ");
            String input = keyboard.readLine();
            int number = Integer.parseInt(input);
            //count  배열에  입력값 추가하기

            if (number == 0) {
                break;
            } else if (number > 0) {
                sum += number;
                count++;
            } else {
                System.out.println("It is not positive Integer.");
            }
        }

        if (count > 0) {
            return OptionalDouble.of((double) sum / count);
        } else {
            return OptionalDouble.empty();
        }
    }


    public static void main(String[] args) throws IOException {
        OptionalDouble average = CalculateAverage();
        if (average.isPresent()) {
            System.out.println("Average: " + average);
        } else {
            System.out.println("no way");
        }
    }


}
