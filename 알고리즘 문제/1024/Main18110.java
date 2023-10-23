import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dif = new int[N];
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                dif[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(dif);
            int per = (int) Math.round(N * 0.15);
            double sum = 0;
            for (int i = per; i < N - per; i++) {
                sum += dif[i];
            }
            System.out.println(Math.round((double) sum / (N - per * 2)));
        } else {
            System.out.println("0");
        }
    }
}