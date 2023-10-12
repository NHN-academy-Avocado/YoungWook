import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> K = new ArrayList<>();
        ArrayList<Integer> xy = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xy.add(Integer.parseInt(st.nextToken()));
            xy.add(Integer.parseInt(st.nextToken()));
        }
        for (int i = 0; i < N; i++) {
            int x = xy.get(i * 2);
            int y = xy.get(i * 2 + 1);
            int k = 1;
            for (int j = 0; j < N; j++) {
                if (x < xy.get(j * 2) && y < xy.get(j * 2 + 1)) {
                    k++;
                }
            }
            K.add(k);

        }
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st.append(K.get(i));
            st.append(" ");
        }
        System.out.println(st.toString());
    }
}
