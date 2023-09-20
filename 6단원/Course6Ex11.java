public class Course6Ex11 {
    public static Boolean positiveprime(int n) {
        int count = 0;
        if (n < 0) {
            throw new IllegalArgumentException("It is not positve");
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(positiveprime(5));
    }
}

