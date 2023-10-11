import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int count = 0;
        int i = 1;
        while (i <= a) {
            int temp = i;
            if (i % 5 == 0) {
                while (temp % 5 == 0 && temp > 1) {
                    temp /= 5;
                    count++;
                }
            }
            i++;
        }
        System.out.println(count);

    }
}

