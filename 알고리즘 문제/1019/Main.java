import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int result = Integer.MAX_VALUE;
        String bw[][] = new String[M][N];
        for (int i = 0; i < M; i++) {
            String[] name = sc.next().split("");
            for (int j = 0; j < N; j++) {
                bw[i][j] = name[j];
            }
        }

        String[] li = {
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW"};

        String[] li2 = {
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB"};
        String[][] list2 = new String[8][8];
        String[][] list3 = new String[8][8];
        for (int i = 0; i < 8; i++) {
            String[] name = li[i].split("");
            for (int j = 0; j < 8; j++) {
                list2[i][j] = name[j];
            }
        }
        for (int i = 0; i < 8; i++) {
            String[] name = li2[i].split("");
            for (int j = 0; j < 8; j++) {
                list3[i][j] = name[j];
            }
        }
        ArrayList<Integer> number = new ArrayList<Integer>();
        int sum = 0;
        int sum2 = 0;
        for (int t = 0; t < M - 7; t++) { //두가지 경우 비교
            for (int e = 0; e < N - 7; e++) {

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (bw[i + t][j + e].equals(list2[i][j])) {
                            ++sum;
                        } else if (bw[i + t][j + e].equals(list3[i][j])) {
                            ++sum2;
                        }
                    }
                }
                number.add(64 - sum);
                sum = 0;
                number.add(64 - sum2);
                sum2 = 0;
            }

        }
        for (int i = 0; i < number.size(); i++) {
            result = Math.min(result, number.get(i));
        }

        System.out.print(result);

    }
}


