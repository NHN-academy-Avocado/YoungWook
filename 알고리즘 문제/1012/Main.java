import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        while (br.readLine().isBlank()){
            numbers.add()
        }
        Collections.sort(numbers);
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
