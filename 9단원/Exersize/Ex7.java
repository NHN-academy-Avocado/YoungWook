package Exersize;


import java.io.File;

public class Ex7 {

    public static boolean fileExists(String filename) {
        try {
            File file = new File(filename);
            return file.exists();
        } catch (Exception e) {
            return false;
        }
    }


    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {

        String filename = "example.txt";
        String strInt = "123";
        String strDouble = "3.14";
        String strNotInt = "abc";
        String strNotDouble = "3.14.15";


        System.out.println("File exists: " + fileExists(filename));


        System.out.println("Is an integer: " + isInt(strInt));
        System.out.println("Is not an integer: " + isInt(strNotInt));


        System.out.println("Is a double: " + isDouble(strDouble));
        System.out.println("Is not a double: " + isDouble(strNotDouble));
    }
}


