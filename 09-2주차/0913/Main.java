
public class Main {

    private static double correctCount = 0;

    private static final int[][] TESTCASES = new int[][] {
            {1,1},
            {98,49},
            {2, 81},
            {3, 7},
            {19, 87},
            {1, 40}
            
    };

    public static void main(String[] args) {
        for (int i = 0; i < TESTCASES.length; i++)
            System.out.println("Testcase " + i + " = " + test(TESTCASES[i][0],TESTCASES[i][1])+ "     /   result:"+lcm(TESTCASES[i][0],TESTCASES[i][1]));

        System.out.println("정답률 = " + (int) (correctCount / TESTCASES.length * 100) + "%");
    }

    private static boolean test(int a,int b) {
        boolean res = Integer.valueOf(solution(a,b)).equals(lcm(a,b));
        if (res)
            correctCount++;
        return res;
    }


    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
        

   

    // solution
    private static int solution(int first, int second) {
        
    // A >= B 인 어떤 두 정수 A, B(A = Bq + r)가 있을 때, 
    // A와 B의 최대공약수 gcd(A, B) = d는 gcd(B, r)과 같다.

    // A, B의 최대공약수를 G, 최소공배수를 L이라고 할 때,
    // A = Ga, B = Gb (a, b는 서로소)
    // L = Gab = AB/G
        int A= Integer.max(first, second);
        int B= Integer.min(first, second);
        // int r= A%B;
        // int d=gcd(A, B);//d= gcd(B,r)
        

        int result =(A*B)/gcd(A,B);

        return result;
    }
}


