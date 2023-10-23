import java.util.ArrayList;
import java.util.Scanner;

public class Main10866 {
    public static class deck {
        private ArrayList<Integer> deck = new ArrayList<>();


        public void push_front(int a) {
            deck.add(0, a);
        }

        public void push_back(int i) {
            deck.add(i);
        }

        public int pop_front() {
            if (deck.size() == 0) {
                return -1;
            } else {
                int s = deck.get(0);
                deck.remove(0);
                return s;
            }
        }

        public int pop_back() {
            if (deck.size() == 0) {
                return -1;
            } else {
                int s = deck.get(deck.size() - 1);
                deck.remove(deck.size() - 1);
                return s;
            }
        }

        public int empty() {
            if (deck.size() == 0) {
                return 1;
            } else {
                return 0;
            }

        }


        public int size() {
            return deck.size();
        }

        public int front() {
            if (deck.size() == 0) {
                return -1;
            } else {
                return deck.get(0);
            }
        }

        public int back() {
            if (deck.size() == 0) {
                return -1;
            } else {
                return deck.get(deck.size() - 1);
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stb = new StringBuilder();
        int N = sc.nextInt();
        deck d = new deck();
        for (int i = 0; i < N; i++) {
            switch (sc.next()) {
                case "push_front":
                    d.push_front(sc.nextInt());
                    break;
                case "push_back":
                    d.push_back(sc.nextInt());
                    break;
                case "pop_front":
                    stb.append(d.pop_front()).append("\n");
                    break;
                case "pop_back":
                    stb.append(d.pop_back()).append("\n");
                    break;
                case "empty":
                    stb.append(d.empty()).append("\n");
                    break;
                case "size":
                    stb.append(d.size()).append("\n");
                    break;
                case "front":
                    stb.append(d.front()).append("\n");
                    break;
                case "back":
                    stb.append(d.back()).append("\n");
                    break;
            }
        }
        System.out.println(stb.toString());
    }
}
