import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(numbers);
        StringBuilder st = new StringBuilder();
        for (int w : numbers) {
            st.append(w);
            st.append("\n");
        }
        System.out.println(st.toString());

    }
}

