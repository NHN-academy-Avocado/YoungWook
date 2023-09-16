import javax.swing.JOptionPane;

public class Course5_Ex3 {

    public static void triangle() {
        String a = JOptionPane.showInputDialog("first side:");
        String b = JOptionPane.showInputDialog("second side:");
        String c = JOptionPane.showInputDialog("third side:");
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        int C = Integer.parseInt(c);
        if ((A == B && A != C) || (B == C && B != A) || (C == A && C != B)) {//아등변 삼각형
            System.out.println("Isosceles");
            if (A == B && B == C && C == A) { //정삼각형
                System.out.println("Equilateral triangle");
            }
        } else {
            System.out.println("Scalene");
        }

    }

    public static void main(String[] args) {
        triangle();

    }
}
