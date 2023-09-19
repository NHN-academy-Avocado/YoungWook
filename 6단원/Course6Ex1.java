import javax.swing.JOptionPane;

public class Course6Ex1 {
    public static void main(String[] args) {
        int i = 1;
        int min = 0;
        do {
            String in = JOptionPane.showInputDialog("Input number");
            int inp = Integer.parseInt(in);
            if (inp <= min) {
                min = inp;
            }
            i++;
        } while (i < 11);
        System.out.println(min);
    }

}
