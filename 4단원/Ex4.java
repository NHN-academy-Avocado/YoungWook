public class Ex4 {
    public static boolean even(long x) {
        if (x == 0) {
            throw new IllegalArgumentException("0은 짝수가 아니다");
        }
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(even(4));
    }
}
