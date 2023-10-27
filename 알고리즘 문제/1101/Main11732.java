import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main11732 {
    private static ArrayList<Integer> S;
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        S = new ArrayList<>();
        N = Integer.parseInt(stk.nextToken());
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer command = new StringTokenizer(br.readLine());
            switch (command.nextToken()) {
                case "add":
                    int a = Integer.parseInt(command.nextToken());
                    if (!S.contains(a)) {
                        S.add(a);
                    } else {
                        break;
                    }
                    break;
                case "remove":
                    int b = Integer.parseInt(command.nextToken());
                    if (S.contains(b)) {
                        S.remove(S.indexOf(b));
                    } else {
                        break;
                    }
                    break;
                case "check":
                    int c = Integer.parseInt(command.nextToken());
                    if (S.contains(c)) {
                        stb.append("1\n");
                    } else {
                        stb.append("0\n");
                    }
                    break;
                case "toggle":
                    int d = Integer.parseInt(command.nextToken());
                    if (S.contains(d)) {
                        S.remove(S.indexOf(d));
                    } else {
                        S.add(d);
                    }
                    break;
                case "all":
                    ArrayList<Integer> twenty = new ArrayList<>(
                            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
                    S.clear();
                    S.addAll(twenty);
                    break;
                case "empty":
                    S.clear();
                    break;

            }

        }
        System.out.println(stb.toString());


    }
}
