package Ex3_4_5_6_;

import javax.swing.JOptionPane;

public class CellPhone {
    public static void main(String[] args) {
        String SendNum = "010-3214-2134"; //Ex5-1
        Messagetext m = new Messagetext(); //Ex5-2
        String reciNum = JOptionPane.showInputDialog("input reciverNum:"); //Ex5-3
        Message w = new Message(SendNum, reciNum, m); //Ex5-4
        System.out.println(w.toString());//Ex5-5

    }

}
