public class Course7Ex6 {
    public static int numberOfDistinctValues(int[] A) {
        int count = 0;
        boolean isDistinct; // 현재 값이 고유한지 여부를 나타내는 플래그

        for (int i = 0; i < A.length; i++) {
            isDistinct = true; // 초기화

            // 현재 값과 이전 값들을 비교하여 중복 여부 확인
            for (int j = 0; j < i; j++) {
                if (A[i] == A[j]) {
                    isDistinct = false;
                    break;
                }
            }

            // 고유한 값인 경우 개수 증가
            if (isDistinct) {
                count++;
            }
        }

        return count;
    }

    public static int numberOfDuplicates(int[] A) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 3, 3, 4, 5, 5};

        int distinctValues = numberOfDistinctValues(A);
        int duplicates = numberOfDuplicates(A);

        System.out.println("Number of distinct values in array A: " + distinctValues);
        System.out.println("Number of duplicate values in array A: " + duplicates);
    }
}
