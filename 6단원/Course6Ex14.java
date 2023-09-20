import javax.swing.JOptionPane;

public class Course6Ex14 {//입력에서 정수 n을 읽고 그 소인수를 모두 출력하는 프로그램을 작성합니다. 예를 들어, 정수가 220이면 프로그램은 2, 2, 5, 11을 출력해야 합니다. 연습 6.11에 정의된 방법을 활용하십시오.


    public static void printPrimeFactors() {
        String a = JOptionPane.showInputDialog("input number:");
        int n = Integer.parseInt(a);

        int factor = 2;

        while (n > 1) {
            if (n % factor == 0) {

                System.out.println(factor);
                n /= factor;
            } else {

                factor++;
            }
        }
    }

    public static void main(String[] args) {
        printPrimeFactors();
    }
}
