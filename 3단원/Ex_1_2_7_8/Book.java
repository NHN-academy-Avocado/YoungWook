package Ex_1_2_7_8;

import javax.swing.JOptionPane;

public class Book { //1
    private String author;
    private String name;


    private String price;

    public Book(String a, String n) {
        this.author = a;
        this.name = n;

    }

    public String getAuthor() {//6
        return author;
    }

    public String getName() { //5
        return name;
    }

    public String getPrice() {//7
        return price;
    }

    public void setPrice(String price) { //8
        this.price = price;
    }

    public void printBook() { //2
        System.out.println(getName());
        System.out.println(getAuthor());
    }

    public void printBookPrice() { //3
        System.out.println(getName());
        System.out.println(getAuthor());
        System.out.println(getPrice());
    }

    public void windowBook() { //4
        String na = getName();
        String au = getAuthor();
        JOptionPane.showMessageDialog(null, na + "/" + au);

    }


    @Override
    public String toString() {
        return "Book name" + name + "/author:" + author;
    }


}
    