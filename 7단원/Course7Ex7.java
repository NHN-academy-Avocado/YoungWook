import java.util.Arrays;

public class Course7Ex7 {
    //모든 중복을 제거하여 A에서 얻은 새로운 배열을 반환하는 메서드 정적 int[] removeDuplicates(int[] A)를 작성합니다.
    // 중복은 각 고유 요소의 첫 번째 발생만 유지하고,
    // 중복이 제거되면 나머지 요소를 위로 이동하는 방법으로 제거해야 합니다.
    public static int[] removeDuplicates(int[] A) {
        Arrays.sort(A);
        int n = A.length;

        if (n == 0) {
            return A;
        }

        int uniqueCount = 1;

        for (int i = 0; i < n - 1; i++) {
            if (A[i] != A[i + 1]) {
                A[uniqueCount] = A[i + 1];
                uniqueCount++;
            }
        }

        int[] result = Arrays.copyOf(A, uniqueCount);
        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 3, 3, 4, 5, 5};

        int[] uniqueArray = removeDuplicates(A);

        System.out.println("Unique elements in array A:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
}

