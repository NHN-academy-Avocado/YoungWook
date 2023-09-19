import java.util.Scanner;

public class Course6Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers:");
        int n = sc.nextInt();

        int sumPos = 0;
        int sumNeg = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("input number" + (i + 1) + ": ");
            int num = sc.nextInt();

            if (num > 0) {
                sumPos += num;
            } else {
                sumNeg += num;
            }
        }
        System.out.println("Sum of positive : " + sumPos);
        System.out.println("Sum of negative : " + sumNeg);
    }

}
