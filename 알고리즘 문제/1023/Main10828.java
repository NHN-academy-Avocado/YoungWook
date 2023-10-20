import java.util.Scanner;

public class Main10828 {
    public static class mystack {

        private int[] stack;
        private int size;

        public mystack(int size) {
            stack = new int[size];
        }

        public void push(int a) {
            stack[size] = a;
            size++;
        }

        public int pop() {
            if (size == 0) {
                return -1;
            } else {
                int a = stack[size - 1];
                stack[size - 1] = 0;
                size--;
                return a;
            }
        }

        public int top() {
            if (size == 0) {
                return -1;
            } else {
                return stack[size - 1];
            }
        }

        public int empty() {
            if (size == 0) {
                return 1;
            } else {
                return 0;
            }
        }


        public int size() {
            return size;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        mystack s = new mystack(n);
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            switch (sc.next()) {
                case "push":
                    s.push(sc.nextInt());
                    break;
                case "top":
                    stb.append(s.top()).append("\n");
                    break;
                case "pop":
                    stb.append(s.pop()).append("\n");
                    break;
                case "empty":
                    stb.append(s.empty()).append("\n");
                    break;
                case "size":
                    stb.append(s.size()).append("\n");
                    break;
            }
        }
        System.out.println(stb.toString());

    }
}
