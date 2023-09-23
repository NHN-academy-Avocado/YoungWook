package Exersize;

public class Ex1 {
    public static void main(String[] args) {

        int i;
        int j = 0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.println(i + " + " + j + " = " + (i + j));
            }
        }
        System.out.println("I've printed out the sums of i and j up to "
                + i + "," + j);
    }
}
