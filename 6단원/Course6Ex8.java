public class Course6Ex8 {
    /*구구단  정열시키기*/

    public static void Multiply() {
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print("\t" + i * j);
            }

        }
    }

    public static void main(String[] args) {
        Multiply();
    }

}
