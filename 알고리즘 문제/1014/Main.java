import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> members = new ArrayList<>();
        ArrayList<Integer> olds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            StringTokenizer st = new StringTokenizer(name);
            int old = Integer.parseInt(st.nextToken());
            if (!olds.contains(old)) {
                olds.add(old);
            }
            members.add(name);
        }
        br.close();
        Collections.sort(olds);

        for (int old : olds) {
            for (String name : members) {
                StringTokenizer st = new StringTokenizer(name);
                int memberold = Integer.parseInt(st.nextToken());
                if (memberold == old) {
                    System.out.println(name);
                }


            }

        }

    }
}

