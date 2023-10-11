import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        int result = 665;

        while (count < num) {
            if (check(++result)) {
                count++;
            }

        }
        System.out.println(result);
        br.close();
    }

    public static boolean check(int n) {
        return Integer.toString(n).contains("666");
    }

}



