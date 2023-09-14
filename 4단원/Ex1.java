public class Ex1 {
    public static double convertLireEuro(int x) {
        //1 유로 = 28.95 터키 리라
        double Euro = 0;
        Euro = x / 28.95;
        return Euro;
    }

    public static void main(String[] args) {
        System.out.println(convertLireEuro(1));


    }
}

