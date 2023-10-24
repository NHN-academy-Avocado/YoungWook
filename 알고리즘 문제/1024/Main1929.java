import java.util.Scanner;

public class Main1929 {
    public static boolean[] prime;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();

        prime = new boolean[N + 1];
        get_prime();
        StringBuilder stb = new StringBuilder();
        for (int i = M; i <= N; i++) {
            // false = 소수
            if (!prime[i]) {
                stb.append(i).append("\n");
            }
        }
        System.out.println(stb.toString());
    }


    // 에라토스테네스의 체 알고리즘
    public static void get_prime() {
        // true = 소수아님 , false = 소수
        prime[0] = prime[1] = true;
        //전체 수의 갯수의 제곱근과 같거나 작을 때까지 반복
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) { //소수일 경우 통과
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) { //앞서 소수로 정해진 값의 배수를 찾아 소수로 정의해주기
                prime[j] = true;
            }
        }
    }

}





