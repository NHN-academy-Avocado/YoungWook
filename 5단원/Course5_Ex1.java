public class Course5_Ex1 {
    public static void alcohole(double a) {
        if (40 < a) {
            System.out.println("extra strong liquor");
        } else if (20 < a && a <= 40) {
            System.out.println("strong liquor");
        } else if (15 < a && a <= 20) {
            System.out.println("liquor");
        } else if (12 < a && a <= 15) {
            System.out.println("strong vine");
        } else if (10.5 < a && a <= 12) {
            System.out.println("normal vine");
        } else if (a <= 10.5) {
            System.out.println("light vine");
        }
    }

    public static void main(String[] args) {
        alcohole(23);
    }
}
