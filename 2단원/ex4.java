import javax.swing.JOptionPane;

public class ex4 {
    //ex4
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Insert a string");
        String a=input.substring(0, 1);
        String b= input.substring(1, input.length()-1);
        String c= input.substring(input.length()-1, input.length());
        String result=c.concat(b).concat(a);
        System.out.println(result);
        System.exit(0);
    }
}
