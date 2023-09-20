public class Course7Ex11 {

    //행렬 M은 i가 j와 다른(즉, 주 대각선에 있지 않은) 모든 요소 M[i][j]가 0과 같으면 대각선이라고 합니다.
    // 행렬 M이 대각선이면 참을 반환하고,
    // 그렇지 않으면 거짓을 반환하는 술어 정적 부울 diagonal(int[][] M)을 작성합니다.
    public static boolean diagonal(int[][] M) {
        int n = M.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && M[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] Test1 = {
                {1, 0, 0},
                {0, 2, 0},
                {0, 0, 3}
        };

        int[][] Test2 = {
                {1, 0, 0},
                {4, 5, 0},
                {0, 0, 9}
        };

        System.out.println(diagonal(Test1));
        System.out.println(diagonal(Test2));
    }
}
