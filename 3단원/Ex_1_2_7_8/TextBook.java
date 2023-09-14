package Ex_1_2_7_8;

public class TextBook extends Book {
    public String getCourse() {
        return course;
    }

    private String course;


    public TextBook(String a, String n, String c) {
        super(a, n);
        this.course = c;
    }

    @Override
    public String toString() {
        return getName() + "/" + getAuthor() + "/" + getCourse();
    }

}
