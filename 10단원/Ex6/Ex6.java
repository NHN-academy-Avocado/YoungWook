package Ex6;

public class Ex6 {
    public static int longestSequence(String s, char c) {
        return Method(s, c, 0, 0, 0);
    }

    private static int Method(String s, char c, int index, int currentLength, int maxLength) {
        if (index == s.length()) {
            return maxLength;
        }

        if (s.charAt(index) == c) {
            currentLength++;
        } else {
            currentLength = 0;
        }

        maxLength = Math.max(maxLength, currentLength);

        return Method(s, c, index + 1, currentLength, maxLength);
    }

    public static void main(String[] args) {
        String input = "aabbbccccdddeee";
        char targetChar = 'c';

        int result = longestSequence(input, targetChar);
        System.out.println(result);
    }

}
