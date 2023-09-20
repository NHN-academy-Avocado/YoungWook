public class Course7Ex5 {
    public static boolean equalArrays(int[] A, int[] B) {

        if (A.length != B.length) {
            return false;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {1, 2, 3};

        boolean result = equalArrays(A, B);

        if (result) {
            System.out.println("Arrays A and B are equal.");
        } else {
            System.out.println("Arrays A and B are not equal.");
        }
    }
}
