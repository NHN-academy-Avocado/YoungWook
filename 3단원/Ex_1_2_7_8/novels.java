package Ex_1_2_7_8;

public class novels extends Book {
    private String type;

    public novels(String a, String n, String t) {
        super(a, n);
        this.type = t;
    }

    @Override
    public String toString() {
        return getAuthor() + "/" + getName() + "/" + this.type;
    }
}
