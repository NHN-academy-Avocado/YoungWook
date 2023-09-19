public class Course6Ex6 {
    /*문자열 a에서 c 문자들을 d만큼 뒷자리 알파벳으로 변경*/
    public static String decode(String a, int d) {
        String result = "";
        char c;
        int ci;

        for (int i = 0; i < a.length(); i++) {
            c = a.charAt(i);
            ci = (int) c;
            ci -= d;
            c = (char) ci;
            result = result + c;


        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(decode("qweqr", 2));
    }

}
