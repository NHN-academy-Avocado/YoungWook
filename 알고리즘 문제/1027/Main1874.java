import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Num = new ArrayList<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            Num.add(sc.nextInt());
        }
        stack(Num);


    }

    public static void stack(ArrayList<Integer> num) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder operations = new StringBuilder();

        int current = 1; // stack에 push할 숫자

        for (int i = 0; i < num.size(); i++) {
            int target = num.get(i);

            while (current <= target) {
                stack.push(current);
                operations.append("+\n");
                current++;
            }


            if (!stack.isEmpty() && stack.peek() == target) {//원하는 수가 맨 위에 있을 때 pop
                stack.pop();
                operations.append("-\n");
            } else {
                //만약 맨위에 반환하려는 수가 나오지 않을 경우 그 배열은 구현 불가 판정
                System.out.println("NO");
                return;
            }
        }

        // 만약 정상적으로 모든 수가 반환되었다면 stack은 비어있어야 한다
        //아니라면 수행 불가했다는 상황
        if (stack.isEmpty()) {
            System.out.println(operations.toString());
        } else {
            System.out.println("NO");
        }


    }
}

