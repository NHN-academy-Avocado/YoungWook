import java.util.Scanner;

public class Main_S3_2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];
        int dp[][] = new int[N][2];

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        if (N == 1) {
            System.out.println(score[0]);
            return;
        }

        dp[0][0] = score[0];
        dp[1][0] = score[1];
        dp[1][1] = dp[0][0] + score[1];
        for (int i = 2; i < N; i++) {
            int max = Math.max(dp[i - 2][0], dp[i - 2][1]);
            if (max > -1) {
                dp[i][0] = max + score[i];
            }
            if (dp[i - 1][0] > -1) {
                dp[i][1] = dp[i - 1][0] + score[i];
            }
        }

        System.out.println(Math.max(dp[N - 1][0], dp[N - 1][1]));
    }
}
