public class Course7Ex2 {// 두 배열 A와 B의 교집합을 포함하는 새로운 배열, 즉 (위치에 관계없이) A와 B에 모두 존재하는 원소를 정확히 반환하는 메서드 정적
    // int[] intersection(int[] A, int[] B)를 작성합니다.
    // A와 B에는 중복 요소, 즉 배열에 두 번 이상 나타나는 요소가 포함되어 있지 않다고 가정할 수 있습니다.


    public static int[] intersection(int[] A, int[] B) {
        int sizeA = A.length;
        int sizeB = B.length;
        int maxSize = Math.max(sizeA, sizeB);

        int[] intersectionArray = new int[maxSize];
        int intersection = 0;

        int i = 0; // 배열 A의 인덱스
        int j = 0; // 배열 B의 인덱스

        while (i < sizeA && j < sizeB) {
            if (A[i] < B[j]) {
                i++; // A의 요소가 작으므로 A의 인덱스 증가
            } else if (A[i] > B[j]) {
                j++; // B의 요소가 작으므로 B의 인덱스 증가
            } else {
                // A[i]와 B[j]가 같은 경우, 교집합에 추가하고 둘 다 인덱스 증가
                intersectionArray[intersection] = A[i];
                intersection++;
                i++;
                j++;
            }
        }

        // 교집합 결과 배열 크기 조정
        int[] result = new int[intersection];
        System.arraycopy(intersectionArray, 0, result, 0, intersection);

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {3, 4, 5, 6, 7};

        int[] result = intersection(A, B);

        System.out.println("Intersection of A and B:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }


}
