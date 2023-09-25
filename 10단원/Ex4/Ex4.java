package Ex4;

public class Ex4 {
    public static int Gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else if (y > 0 && x % y < y && 0 <= x % y) {
            return Gcd(y, x % y);
        } else {
            throw new IllegalArgumentException("값이 올바르지 않습니다");
        }
    }

    public static boolean prime(int x, int y) {
        if (x == 1 || y == 1) {
            return true;
        } else if (x == y && x != 1 && y != 1) {
            return false;
        } else if (x < y && x != 1 && y != 1) {
            return prime(x, y - x);
        } else if (x > y && x != 1 && y != 1) {
            return prime(x - y, y);
        } else {
            throw new IllegalArgumentException("값이 올바르지 않습니다");
        }
    }


    public static int remainder(int x, int y) {
        if (x < 0) {
            return remainder(x + y, y);
        } else if (0 <= x && x < y) {
            return x;
        } else if (x > y) {
            return remainder(x - y, y);
        } else {
            throw new IllegalArgumentException("값이 올바르지 않습니다");
        }
    }

    public static void main(String[] args) {
        int x = 48;
        int y = 18;


        int gcdResult = Gcd(x, y);
        System.out.println("GCD = " + gcdResult);


        boolean isRelativelyPrime = prime(x, y);
        System.out.println("prime : " + isRelativelyPrime);

        int remainderResult = remainder(x, y);
        System.out.println("Remainder = " + remainderResult);
    }

}
