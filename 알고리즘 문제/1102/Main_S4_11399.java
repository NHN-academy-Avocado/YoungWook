import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_S4_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        ArrayList<Integer> time = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            time.add(sc.nextInt());
        }
        Collections.sort(time);
        int sum = 0;
        for (int i = 1; i < q + 1; i++) {
            for (int j = 0; j < i; j++) {
                sum += time.get(j);
            }
        }
        System.out.println(sum);
    }
}
