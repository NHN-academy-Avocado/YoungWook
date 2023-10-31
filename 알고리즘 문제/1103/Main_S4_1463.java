import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_S4_1463 {
    static int dp[];

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        if (N >= 2) {
            for (int i = 2; i <= N; i++) {
                if (dp[i] == 0) {
                    if (i % 6 == 0) {
                        dp[i] = Math.min(dp[i - 1], Math.min(dp[i / 3], dp[i / 2])) + 1;
                    } else if (i % 3 == 0) {
                        dp[i] = Math.min(dp[i / 3], dp[i - 1]) + 1;
                    } else if (i % 2 == 0) {
                        dp[i] = Math.min(dp[i / 2], dp[i - 1]) + 1;
                    } else {
                        dp[i] = dp[i - 1] + 1;
                    }
                }
            }
        }
        System.out.println(dp[N]);
    }
}
