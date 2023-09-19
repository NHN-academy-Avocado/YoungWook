public class Course6Ex5 {
    public static double pi(int n) {
        double pi = 4;
        double divide = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i % 2 != 0) {
                divide += 2;
                pi -= 4 / divide;
            } else if (i == 2 || i % 2 == 0) {
                divide += 2;
                pi += 4 / divide;

            }
        }
        return pi;
    }

    public static void main(String[] args) {
        System.out.println(pi(4));
    }
}
