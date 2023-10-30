import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_S4_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        HashMap<String, String> pass = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String q = br.readLine();
            StringTokenizer stk = new StringTokenizer(q);
            pass.put(stk.nextToken(), stk.nextToken());
        }
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < K; i++) {
            String find = br.readLine();
            stb.append(pass.get(find)).append("\n");

        }
        System.out.println(stb.toString());
    }
}
