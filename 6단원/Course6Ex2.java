public class Course6Ex2 {
    public static void evenNum(int n) {
        int count = 0;
        int number = 2;
        if (n < 0) {
            throw new IllegalArgumentException("It is not positive");
        }
        while (count < n) {
            System.out.println(number + " ");
            number += 2;
            count++;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int n = 5;
        evenNum(n);
    }

}
