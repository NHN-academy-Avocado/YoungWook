package Exersize;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex5 {
    //학생이 획득한 시험 점수에 대한 정보를 파일에서 읽는 공용 정적 메서드를 다음과 같이 구성하여 작성합니다:
    // Rossi 25 24 26 30 24 30
    //Bianchi 20 24 25
    //Verdi 30 24 30 27
    //메서드는 평균 점수가 가장 높은 학생의 이름을 나타내는 문자열을 반환해야 합니다.
    public static String score(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        String HighestAverage = null;
        double highestAverage = Double.MIN_VALUE;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            if (parts.length >= 2) {
                String studentName = parts[0];
                int[] scores = new int[parts.length - 1];

                int totalScore = 0;
                for (int i = 1; i < parts.length; i++) {
                    scores[i - 1] = Integer.parseInt(parts[i]);
                    totalScore += scores[i - 1];
                }
                double average = (double) totalScore / scores.length;

                if (average > highestAverage) {
                    highestAverage = average;
                    HighestAverage = studentName;
                }
            }
        }

        reader.close();
        return HighestAverage;
    }

    public static void main(String[] args) throws IOException {
        String result = score(",.txt");
        if (result != null) {
            System.out.println("Highst average Student:" + result);
        } else {
            System.out.println("No date");
        }
    }
}
