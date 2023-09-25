import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static double correctCount = 0;

    private static final int[][] TESTCASES = new int[][] {
            {10,20,30,40},
            {5,7,12},
            
    };

    public static void main(String[] args) {
        for (int i = 0; i < TESTCASES.length; i++)
            System.out.println("Testcase " + i + " = " + test(TESTCASES[i]));

        System.out.println("정답률 = " + (int) (correctCount / TESTCASES.length * 100) + "%");
    }

    private static boolean test(int[] input) {
        boolean res = Integer.valueOf(solution(input)).equals(gcd(input));
        if (res)
            correctCount++;
        return res;
    }


    private static Object gcd(int[] input) { //테스트용 정답 메소드
        int result =0;
        int [] arr;
        
        for (int i=0; i<=,i++){
            BigInteger a=BigInteger.valueOf(input[i]);
            BigInteger b=BigInteger.valueOf(input[i+1]); 
            BigInteger GCD= a.gcd(b);
          

        }
    }// BIgIntegger gcd 함수 사용 정답 구하기
        

        return result;
    }

    public static int solution(int[] input) {
        if (input.length == 1) {
            return input[0];
        }
        int gcd = gcd(input[0], input[1]);
        int lcm = (input[0] *input[1]) / gcd;

        for (int i = 2; i < input.length; i++) {
            gcd = gcd(lcm, input[i]);
            lcm = (lcm * input[i]) / gcd;
        }

        System.out.println("GCD: " + gcd);

        return lcm;
        }
       
        private void append(int w) {
    }

        public static int gcd(int p, int q) {
            if (q == 0) return q;
        return gcd(q, p%q);
        }
    }
    


