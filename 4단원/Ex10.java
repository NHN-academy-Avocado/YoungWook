public class Ex10 {
    public static char lastCharacter(String s) {
        StringBuffer sb = new StringBuffer(s);
        String a = sb.substring(sb.length() - 1, sb.length());
        char last = a.charAt(0);

        return last;
    }

    public static char lastCharacter2(String s) {
        char last = s.charAt(s.length() - 1);

        return last;
    }
}
