import javax.swing.JOptionPane;

public class Course5_Ex5 {
    public static void Calculator() {
        double a = Integer.parseInt(JOptionPane.showInputDialog("A:"));
        double b = Integer.parseInt(JOptionPane.showInputDialog("B:"));
        double c = Integer.parseInt(JOptionPane.showInputDialog("C:"));
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two distinct real solutions:");
            System.out.println(" 1: " + root1);
            System.out.println(" 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Real double solution:");
            System.out.println("Root: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Two complex solutions:");
            System.out.println(" 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println(" 2: " + realPart + " - " + imaginaryPart + "i");


        }
    }

    public static void main(String[] args) {
        Calculator();
    }
}


