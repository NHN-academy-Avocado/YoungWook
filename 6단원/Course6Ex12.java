import javax.swing.JOptionPane;

public class Course6Ex12 {
    //입력에서 정수 n을 읽고 2와 n 사이의 모든 소수를 출력하는 프로그램을 작성하십시오. 연습 6.11에 정의된 방법을 활용하십시오.
    public static void prime() {
        String a = JOptionPane.showInputDialog("input number:");
        int n = Integer.parseInt(a);
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }

        }
        System.out.println("Primes " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }

    }


    public static void main(String[] args) {
        prime();
    }
}
