import java.util.ArrayList;
import java.util.Scanner;

public class Main10866 {
    public static class myque {

        private ArrayList<Integer> que = new ArrayList<>();


        public void push(int a) {
            que.add(a);
        }

        public int pop() {
            if (que.size() == 0) {
                return -1;
            } else {
                int a = que.get(0);
                que.remove(0);
                return a;
            }
        }


        public int empty() {
            if (que.size() == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        public int front() {
            if (que.size() == 0) {
                return -1;
            } else {
                return que.get(0);
            }
        }

        public int back() {
            if (que.size() == 0) {
                return -1;
            } else {
                return que.get(que.size() - 1);
            }
        }


        public int size() {
            return que.size();
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        myque s = new myque();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            switch (sc.next()) {
                case "push":
                    s.push(sc.nextInt());
                    break;
                case "front":
                    stb.append(s.front()).append("\n");
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
                case "back":
                    stb.append(s.back()).append("\n");
                    break;
            }
        }
        System.out.println(stb.toString());

    }
}
