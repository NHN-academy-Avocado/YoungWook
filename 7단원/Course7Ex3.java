public class Course7Ex3 {
    public static double[][] transposeMatrix(double[][] M) {
        int rows = M.length;
        int cols = M[0].length;

        // 생성할 전치 행렬
        double[][] transposedMatrix = new double[cols][rows];

        // 행과 열을 교환하여 전치 행렬 생성
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = M[i][j];
            }
        }

        return transposedMatrix;
    }

    public static void main(String[] args) {
        double[][] originalMatrix = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };

        double[][] transposed = transposeMatrix(originalMatrix);


        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
