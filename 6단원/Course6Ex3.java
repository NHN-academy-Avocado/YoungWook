public class Course6Ex3 {
    public static void factorial(int n) {
        int result = 1;
        if (n < 0) {
            System.out.println("It is not positive");
        }
        while (n > 0) {
            result *= n;
            n--;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        factorial(6);

    }
}
