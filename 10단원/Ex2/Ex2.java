package Ex2;

public class Ex2 {
    public static int[] fibonacciWithCount(int n) {
        int[] result = new int[2];

        if (n <= 1) {
            result[0] = n;
            result[1] = 1;
        } else {
            int[] fib1 = fibonacciWithCount(n - 1);
            int[] fib2 = fibonacciWithCount(n - 2);

            result[0] = fib1[0] + fib2[0];
            result[1] = fib1[1] + fib2[1] + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] result = fibonacciWithCount(n);

        System.out.println(result[0]);
        System.out.println("Recursion count " + result[1]);
    }

}
