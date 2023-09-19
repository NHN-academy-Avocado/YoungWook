public class Course6Ex7 {
    /*문자열 사이 문자들이  가장 긴 연속되는 char c 문자열의 첫번째 문자 위치를 반환하라 만약 없을 경우 -1 반환*/
    public static int decodde(String a, char c) {
        int max = -1;
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == c) {
                count += 1;
                count2 += 2;
            } else {
                count = 0;
            }
            if (count > max) {
                max = i - count + 1;
            }
        }
        if (count2 == 0) {
            return -1;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(decodde("aaacd", 'a'));
        System.out.println(decodde("bccca", 'c'));
        System.out.println(decodde("cccadcccc", 'c'));
        System.out.println(decodde("dwqweqr", 'c'));


    }
}

