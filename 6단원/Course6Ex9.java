public class Course6Ex9 {
    public static void pyramid(int a) {
        int height = a;

        for (int row = 1; row <= height; row++) {
            for (int i = 1; i <= height - row; i++) {
                System.out.print(" ");

            }
            for (int i = 1; i <= row; i++) {
                System.out.print(i);
            }
            for (int i = row - 1; i >= 1; i--) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pyramid(5);
    }

}


