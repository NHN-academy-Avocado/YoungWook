package Ex_1_2_7_8;

public class Bookprint { //Ex2
    public static void main(String[] args) {
//        String na1 = JOptionPane.showInputDialog("name:");
//        String a1 = JOptionPane.showInputDialog("Author");
//        String na2 = JOptionPane.showInputDialog("name:");
//        String a2 = JOptionPane.showInputDialog("Author");
//        String pr = JOptionPane.showInputDialog("price:");
//        Book a = new Book(a1, na1); //1
//        Book b = new Book(a2, na2);//2
//        a.printBook();//3
//        a.windowBook();//3
//        b.printBook();//4
//        b.windowBook();//4
//        a.setPrice(pr); //5
//        a.printBookPrice();//5
        Book tb = new TextbookofBolo("Youn", "Bolo", "pip", "popi");
        System.out.println(tb.toString());
        Book bk = new Book("qwdq", "sacasd");
        novels nb = new novels(bk.getAuthor(), bk.getName(), "love");
        System.out.println(bk.toString());
        System.out.println(nb.toString());
        tb.setPrice("1231244");
        tb.printBookPrice();


    }
}
