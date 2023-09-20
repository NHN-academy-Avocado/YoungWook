public class Course7Ex9 {
    public static boolean symetric(int[][] M) {
        int rows = M.length;
        int cols = M[0].length;
        if (rows != cols) {
            return false;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (M[i][j] != M[j][i]) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[][] Test1 = {
                {1, 2, 3,},
                {2, 4, 5},
                {3, 5, 6}
        };
        int[][] Test2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Symetric? " + symetric(Test1));
        System.out.println("Symetric? " + symetric(Test2));
    }
}
