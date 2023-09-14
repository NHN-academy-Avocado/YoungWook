import javax.swing.JOptionPane;

public class Ex3 {
    public static void Calcurator() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Put in Integer A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Put in Integer B"));


        int BIG = 0;    //큰 수
        int MIN = 0;    //작은 수

        int MULti = (a * b);
        double Asquare_root = Square(MULti); //A와B의 제곱근


        if (a > b) { //큰 수 작은 수 비교
            BIG = a;
            MIN = b;
        } else if (a < b) {
            BIG = b;
            MIN = a;
        }


        System.out.println((a + b) / 2);  //합을 2로 나누기
        System.out.println("A와B 의 기하평균: " + Asquare_root);  // 기하평균
        System.out.println("BIG:" + BIG + "||" + "MIN:" + MIN);  //두 수중 가 큰 수와 작은 수 출력
        System.exit(0);
    }

    private static double Square(double muLti) {

        muLti = (double) Math.pow(muLti, 0.5);

        return muLti;

    }

    public static void main(String[] args) {
        Calcurator();

    }
}
