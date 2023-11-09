import java.util.Scanner;

public class Main_S3_9416_파도반수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            stb.append(P(sc.nextInt())).append("\n");
        }
        System.out.println(stb.toString());
    }

    private static long P(int i) {
        if (i <= 2) {
            return 1;
        }
        long[] p = new long[i];
        p[0] = 1;
        p[1] = 1;
        p[2] = 1;
        for (int j = 3; j < i; j++) {
            p[j] = p[j - 2] + p[j - 3];
        }
        return p[i - 1];
    }
}


