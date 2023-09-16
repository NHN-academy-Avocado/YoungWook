import javax.swing.JOptionPane;

public class Course5_Ex2 {


    public static void main(String[] args) {
        triangle();
    }

    public static void triangle() {
        String a = JOptionPane.showInputDialog("first side:");
        String b = JOptionPane.showInputDialog("second side:");
        String c = JOptionPane.showInputDialog("third side:");
        int find = 0;
        if (!a.equals(b) || !b.equals(c) || !c.equals(a)) {
            find = 1;
        } else if (a.equals(b) && b.equals(c) && c.equals(a)) {
            find = 2;
        }
        if (find == 0) {
            System.out.println("it is irregular");
            System.exit(0);
        } else if (find == 1) {
            System.out.println("it is symmetric");
            System.exit(0);
        } else {
            System.out.println("it is regular");
            System.exit(0);
        }
    }
}

