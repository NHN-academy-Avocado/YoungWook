import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] xy = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xy[i][0] = Integer.parseInt(st.nextToken());
            xy[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(xy, (o1, o2) -> (o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]));
        br.close();
        StringBuilder stb = new StringBuilder();
        boolean a = false;
        for (int[] i : xy) {
//            if (Arrays.stream(i).anyMatch(x -> x == 0)) {
//
//            }
            if (a) {
                stb.append("\n");
            }
            for (int j : i) {
                stb.append(j + " ");
                a = true;
            }
        }
        System.out.println(stb.toString());


    }
}
