import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_S4_11047 {
    private static ArrayList<Integer> coins;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        coins = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a <= K) {
                coins.add(a);
            }
        }
        int count = 0;

        for (int i = coins.size() - 1; i >= 0; i--) {
            while (K >= coins.get(i)) {
                K -= coins.get(i);
                count++;
            }
        }
        System.out.println(count);


    }
}
