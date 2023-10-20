import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stb = new StringBuilder();

        while (true) {
            String sentence = sc.nextLine();
            if (sentence.equals(".")) {
                break;
            }

            stb.append(isBalanced(sentence) ? "yes\n" : "no\n");
        }

        stb.delete(stb.length() - 1, stb.length());
        System.out.println(stb.toString());
    }

    public static boolean isBalanced(String sentence) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // 닫힌 괄호에 대응하는 열린 괄호가 없음
                }
                char open = stack.pop();

                if ((ch == ')' && open != '(') || (ch == ']' && open != '[')) {
                    return false; // 괄호 짝이 맞지 않음
                }
            }
        }

        return stack.isEmpty(); // 스택에 열린 괄호가 남아 있지 않아야 함
    }
}





