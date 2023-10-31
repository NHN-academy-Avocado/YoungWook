import java.util.Scanner;

public class Main_S3_1003 {
    public static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stb = new StringBuilder();
        int tcase = sc.nextInt();
        while (tcase-- > 0) {
            int n = sc.nextInt();
            //0과 1을 대비한 값을 미리 정의
            dp[0][0] = 1;
            dp[0][1] = 0;
            dp[1][0] = 0;
            dp[1][1] = 1;
            if (n != 0 && n != 1) {
                fibo(n);
                stb.append(dp[n][0] + " " + dp[n][1]).append("\n");
            } else {
                stb.append(dp[n][0] + " " + dp[n][1]).append("\n");
            }
        }
        System.out.println(stb.toString());
    }

    private static Integer[] fibo(int n) { //2차 배열 각각의 첫 행(0)과 두번째 행(1)로 0과 1의 출력 횟수를 증감시켜간다
        if (dp[n][0] == null || dp[n][1] == null) {
            dp[n][0] = fibo(n - 1)[0] + fibo(n - 2)[0];
            dp[n][1] = fibo(n - 1)[1] + fibo(n - 2)[1];
        }

        return dp[n];
    }
}
