public class Course7Ex10 {
    //행렬 M은 i<j인(즉, 주 대각선 "위"에 있는) 모든 요소 M[i][j]가 0이면 하삼각형이라고 합니다. 행렬 M이
    // 하삼각형이면 참을 반환하고 그렇지 않으면 거짓을 반환하는 술어 정적 부울 lowerTriangular(int[][] M)를 작성합니다.

    public static boolean lowerTriangular(int[][] M) {
        int n = M.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (M[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] Test1 = {
                {1, 0, 0},
                {2, 3, 0},
                {4, 5, 6}
        };

        int[][] Test2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(lowerTriangular(Test1));
        System.out.println(lowerTriangular(Test2));
    }
}
