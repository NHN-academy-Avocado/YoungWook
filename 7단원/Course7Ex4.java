public class Course7Ex4 {
    public static int[] matrixSumColumns(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] columnSums = new int[cols];

        for (int col = 0; col < cols; col++) {
            int sum = 0;
            for (int row = 0; row < rows; row++) {
                sum += matrix[row][col];
            }
            columnSums[col] = sum;
        }

        return columnSums;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        int[] sums = matrixSumColumns(matrix);

        for (int i = 0; i < sums.length; i++) {
            System.out.println("Sum of column " + i + ": " + sums[i]);
        }
    }
}
