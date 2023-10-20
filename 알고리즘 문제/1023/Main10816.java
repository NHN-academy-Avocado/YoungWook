import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main10816 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        int K = sc.nextInt();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < K; i++) {
            int a = sc.nextInt();
            stb.append(map.getOrDefault(a, 0) + " ");
        }
        stb.delete(stb.length() - 1, stb.length());
        System.out.println(stb.toString());


    }


}

