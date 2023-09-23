package Exersize.Ex6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileLineLengthChecker {
    public static void main(String[] args) {
        String filePath = "sample.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;


            while ((line = bufferedReader.readLine()) != null) {
                lineNumber++;


                if (line.length() > 80) {

                    throw new Ex6();
                }


                System.out.println("Line " + lineNumber + ": " + line);
            }


        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (Ex6 e) {
            throw new RuntimeException(e);
        }
    }
}
