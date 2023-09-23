package Course8.Exersize.Ex7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HandleBAs {
    private String Name;
    private String Surname;

    public void setBalance(String balance) {
        Balance = balance;
    }

    private String Balance;

    private String filename;

    public HandleBAs(String name, String surname, String balance) {
        Name = name;
        Surname = surname;
        Balance = balance;
        filename = name;
        try (FileWriter os = new FileWriter(filename);) {
            os.write(Name + "\n" + Surname + "\n" + Balance + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public HandleBAs(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            String line2 = br.readLine();
            String line3 = br.readLine();

            HandleBAs sub = new HandleBAs(line + " sub", line2, line3);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void inerests(double rate) {

    }

    public static void printNegative() {

    }

    @Override
    public String toString() {
        return "Name: " + Name + "\nSurname: " + Surname + "\nBalance: " + Balance + "\n";
    }

}
