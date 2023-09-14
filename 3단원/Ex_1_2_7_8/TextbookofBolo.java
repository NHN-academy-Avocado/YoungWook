package Ex_1_2_7_8;

public class TextbookofBolo extends TextBook {
    private String professor;

    public TextbookofBolo(String a, String n, String c, String p) {
        super(a, n, c);
        this.professor = p;
    }

    @Override
    public String toString() {
        return getName() + "/" + getAuthor() + "/" + getCourse() + "/" + this.professor;
    }

    @Override
    public void printBookPrice() {
        System.out.println(getName());
        System.out.println(getAuthor());
        System.out.println(getPrice());
    }
}
