package SubExersize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plural {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(isr);
        System.out.println("Insert a word: ");
        String line = keyboard.readLine();
        System.out.print(line);
        System.out.println("\n");
    }
}
