import javax.swing.JOptionPane;

public class Course5_Ex5 {
    public int Calculator() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("A:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("B:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("C:"));
        int X = 0;
        int result = a * X ^ 2 + b * X + c;
        return result;
    }
}
