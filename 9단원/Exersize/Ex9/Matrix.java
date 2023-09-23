package Exersize.Ex9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


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
            e.getMessage();
        }
    }

    public static Matrix read(String filename) throws ExceptionWrongMatrixValues, ExceptionWrongMatrixDimension {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
            Matrix matrix = new Matrix(n, m);
            for (int i = 0; i < n; i++) {
                String[] values = reader.readLine().split(" ");
                if (values.length != m) {
                    throw new ExceptionWrongMatrixDimension("Matrix dimensions not match specified dimensions.");
                }
                for (int j = 0; j < m; j++) {
                    try {
                        matrix.data[i][j] = Double.parseDouble(values[j]);
                    } catch (NumberFormatException e) {
                        throw new ExceptionWrongMatrixValues("Invalid numeric value found.");
                    }
                }
            }
            return matrix;
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }


    public static void main(String[] args) {

        try {
            Matrix matrixFromFile = Matrix.read("matrix.txt");
            if (matrixFromFile != null) {
                System.out.println("Matrix from file:\n" + matrixFromFile);
            }
        } catch (ExceptionWrongMatrixValues | ExceptionWrongMatrixDimension e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
