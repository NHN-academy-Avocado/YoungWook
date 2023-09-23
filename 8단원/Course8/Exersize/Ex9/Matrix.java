package Course8.Exersize.Ex9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Matrix {
    private int rows;
    private int cols;
    private double[][] data;


    public Matrix(int n, int m) {
        rows = n;
        cols = m;
        data = new double[n][m];
    }


    public void save(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.println(rows);
            writer.println(cols);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    writer.print(data[i][j]);
                    if (j < cols - 1) {
                        writer.print(" ");
                    }
                }
                writer.println();
            }
        } catch (IOException e) {
            System.err.println("Error saving the matrix to file: " + e.getMessage());
        }
    }


    public static Matrix read(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
            Matrix matrix = new Matrix(n, m);
            for (int i = 0; i < n; i++) {
                String[] values = reader.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    matrix.data[i][j] = Double.parseDouble(values[j]);
                }
            }
            return matrix;
        } catch (IOException e) {
            System.err.println("Error reading the matrix from file: " + e.getMessage());
            return null;
        }
    }


    public Matrix sum(Matrix m) {
        if (rows == m.rows && cols == m.cols) {
            Matrix result = new Matrix(rows, cols);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result.data[i][j] = this.data[i][j] + m.data[i][j];
                }
            }
            return result;
        } else {
            return null;
        }
    }


    public Matrix product(Matrix m) {
        if (cols == m.rows) {
            Matrix result = new Matrix(rows, m.cols);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < m.cols; j++) {
                    for (int k = 0; k < cols; k++) {
                        result.data[i][j] += this.data[i][k] * m.data[k][j];
                    }
                }
            }
            return result;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append(Arrays.toString(data[i]));
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Matrix matrix1 = new Matrix(2, 3);
        matrix1.data = new double[][] {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        Matrix matrix2 = new Matrix(3, 2);
        matrix2.data = new double[][] {{7.0, 8.0}, {9.0, 10.0}, {11.0, 12.0}};


    }
}