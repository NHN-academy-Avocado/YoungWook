import java.util.Scanner;

public class Main_S3_9059_123더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            stb.append(plus(sc.nextInt())).append("\n");

        }
        System.out.println(stb.toString());
    }

    public static int plus(Integer a) {
        int[] dp = new int[a + 1];
        dp[0] = 1;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i - j >= 0) {
                    dp[i] += dp[i - j];
                }
            }
        }

        return dp[a];
    }
}