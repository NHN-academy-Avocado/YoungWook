import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> deck = new LinkedList<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            deck.add(i + 1);
        }
        while (deck.size() != 1) {
            deck.poll();
            int val = deck.poll();
            deck.offer(val);
        }
        System.out.println(deck.poll());

    }
}
