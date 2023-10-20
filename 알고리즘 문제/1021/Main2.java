import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stb = new StringBuilder();
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String sentence = sc.nextLine();
            if (VPS(sentence)) {
                stb.append("YES\n");
            } else {
                stb.append("NO\n");
            }
        }
        stb.delete(stb.length() - 1, stb.length());

        System.out.println(stb.toString());
    }

    public static boolean VPS(String sentence) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();

                if ((ch == ')' && open != '(')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}


