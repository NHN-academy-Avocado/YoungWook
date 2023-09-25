package Ex5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex5 {
    public static int OneCount(BufferedReader br) throws IOException {
        String line = br.readLine();


        if (line == null) {
            return 0;
        }
        int countInCurrentLine = countOnesInLine(line);
        int countInRestOfLines = OneCount(br);

        return countInCurrentLine + countInRestOfLines;
    }

    private static int countOnesInLine(String line) {
        int count = 0;
        for (char c : line.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String filename = "/Users/gim-yeong-ug/Desktop/YoungWook/10단원/Ex5/Test.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int totalCount = OneCount(br);
            System.out.println("1 in the file: " + totalCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
