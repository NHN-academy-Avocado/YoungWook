import javax.swing.JOptionPane;

public class ex5 {
     //ex5
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Insert a string");
        StringBuffer in =new StringBuffer(input);
        in.replace(0, 1, input.substring(input.length()-1, input.length()));
        in.replace(input.length()-1, input.length(), input.substring(0, 1));
        System.out.println(in.toString());
        System.exit(0);
    }
}
