package Exersize;

public class Ex2 {
    private int x = 101;

    private void f(int x) {
        this.x = x;
        this.x++;
        g();
    }

    private void g() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Ex2 e = new Ex2();
        int x = 200;
        e.f(x);
    }
}
