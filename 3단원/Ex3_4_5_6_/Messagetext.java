package Ex3_4_5_6_;

import javax.swing.JOptionPane;


public class Messagetext {
    private String code;

    private String text;


    public Messagetext() { //Ex 3-1
        String inputMessage = JOptionPane.showInputDialog("input Message:");
        String inputCode = JOptionPane.showInputDialog("input Code:");
        this.code = inputCode;
        this.text = inputMessage;
    }

    public String getCode() {//Ex3-2
        return code;
    }

    public String getText() {//Ex3-3
        return text;
    }

    @Override
    public String toString() {
        return "MessageText[" + "Text:" + text + "/" + "Code:" + code + "]";
    }


}
