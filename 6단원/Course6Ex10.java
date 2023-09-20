import javax.swing.JOptionPane;

public class Course6Ex10 {
    //입력과 정수 n을 읽고 1과 n 사이의 모든 수의 계승을 출력하는 프로그램을 작성하십시오. 연습 6.3에 정의된 방법을 활용하십시오.

    public static void factotorial() {
        String a = JOptionPane.showInputDialog("input number:");
        int n = Integer.parseInt(a);
        int result = 1;
        if (n < 0) {
            System.out.println("It is not positive");
        }
        while (n > 0) {
            result *= n;
            n--;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {

        factotorial();
    }
}

