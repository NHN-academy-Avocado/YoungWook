package Exersize.Ex5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.JOptionPane;

public class IOFile {

    public static void countLines() {
        String filename = JOptionPane.showInputDialog("Input FileName: ");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)))) {
            int count = 0;

            String line = br.readLine();
            while (line != null) {
                count++;
                line = br.readLine();
            }
            System.out.println("Number of lines in the file: " + count);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void write(OutputStream os) {
        try (BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
             PrintStream out = new PrintStream(os)) {
            System.out.println("Write:");
            System.out.flush();
            String line = key.readLine();

            while (!line.equals("")) {
                out.println(line);
                line = key.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to output stream: " + e.getMessage());
        }
    }

    public static void print() {
        String filename = JOptionPane.showInputDialog("Input File Name: ");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void copy(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename));
             FileWriter fw = new FileWriter("Copy-" + filename + ".txt")) {
            String line = br.readLine();
            while (line != null) {
                fw.write(line);
                fw.write(System.lineSeparator()); // Add a new line separator
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        } catch (IOException e) {
            System.err.println("Error copying the file: " + e.getMessage());
        }
    }

    public static void delete() {
        String filename = JOptionPane.showInputDialog("Input File Name: ");
        File file = new File(filename);
        if (file.exists()) {
            boolean deleted = file.delete();
            if (deleted) {
                System.out.println("File deleted successfully: " + filename);
            } else {
                System.err.println("Failed to delete the file: " + filename);
            }
        } else {
            System.err.println("File not found: " + filename);
        }
    }

    public static void main(String[] args) {
        // Example usage of the methods
        countLines();
        write(System.out);
        print();
        copy("sample.txt");
        delete();
    }
}
