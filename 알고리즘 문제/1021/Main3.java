import java.util.Scanner;
import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int result = 0;
        Stack<Integer> index = new Stack<>();
        for (int i = 0; i < K; i++) {
            int input = sc.nextInt();
            if (input != 0) {
                index.push(input);
            } else if (input == 0) {
                index.pop();
            }
        }
        int size = index.size();
        if (index.isEmpty()) {
            System.out.println("0");
        } else {
            for (int i = 0; i < size; i++) {
                result += index.pop();
            }
            System.out.println(result);
        }
    }
}
