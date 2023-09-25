import java.math.BigDecimal;

public class Main {
    public static class Fraction {
        private int numerator;  // 분자
        private int denominator;    // 분모

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;

            normalize();


        }

        public String toString() {
            return getNumerator() + "/" + getDenominator();
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public int GCD(int a, int b) {
            if (b == 0) {
                return a;
            }

            return GCD(b, a % b);
        }

        public void normalize() { //done
            int d = GCD(numerator, denominator);
            this.numerator = numerator / d;
            this.denominator = denominator / d;
        }


    }

    /**
     * 소수점 값에 대해 자리 수 계산 하는 메서드.    <br/>
     * ex)  <br/>
     * 0.01 -> 100을 곱하기 위해 2를 return    <br/>
     * 0.1 -> 10을 곱하기 위해 1을 return
     *
     * @param num 소수 값
     * @return 소수점 이하 자리 수 값
     */
    public static int getDecimalNumber(BigDecimal num) { //done
        String str = num.toPlainString();
        BigDecimal n = BigDecimal.valueOf(10);
        int a = 0;
        while (!n.equals(str)) {
            num.multiply(n);
            a += 1;
        }
        return a;
    }

    public static String solution(String input) {
        BigDecimal number = new BigDecimal(input); //소수 생성
        int decimalNumber = getDecimalNumber(number); //소수점 자릿수

        double denominator = 0;
        int numerator = 0;
        double d = Math.pow(10, decimalNumber);
        BigDecimal D = new BigDecimal(d);
        denominator = d;
        number = number.multiply(D);
        numerator = number.intValue();


        return new Fraction(numerator, (int) denominator).toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("0.1"));


    }
}
