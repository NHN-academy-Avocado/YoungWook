import javax.swing.JOptionPane;

public class Course6Ex13 {//입력에서 정수 n을 읽고 처음 n개의 소수를 출력하는 프로그램을 작성하십시오 (관례상, 1은 소수로 간주되지 않습니다). 연습 6.11에 정의된 방법을 활용하십시오.

    public static void primeprint() {
        String a = JOptionPane.showInputDialog("input number:");
        int n = Integer.parseInt(a);
        int count = 0;

        System.out.println(n + " Prime Numbers:");
        for (int i = 2; i <= n; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }


            }
            if (count == 2) {
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String[] args) {
        primeprint();
    }
}


