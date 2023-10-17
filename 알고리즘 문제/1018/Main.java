import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());
        StringBuilder stb = new StringBuilder();
        stb.append("<");
        Queue<Integer> q = new LinkedList<>();
        int c = 1;
        for (int i = 0; i < n; i++) {
            q.add(i + 1);
        }
        while (q.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                int val = q.poll();
                q.offer(val);
            }
            stb.append(q.poll()).append(", ");
        }
        stb.append(q.poll());
        stb.append(">");
        System.out.println(stb.toString());


    }
}
