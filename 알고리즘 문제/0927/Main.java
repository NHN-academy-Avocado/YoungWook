import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main { //직각삼각형 4153

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input, " ");
            if (!st.hasMoreTokens()) {
                return;
            }
            double[] targetArray = new double[3];
            for (int i = 0; i < 3; i++) {
                targetArray[i] = Double.parseDouble(st.nextToken());
            }
            Arrays.sort(targetArray);
            double A = Math.pow(targetArray[2], 2);
            double B = Math.pow(targetArray[1], 2);
            double C = Math.pow(targetArray[0], 2);
            double D = B + C;

            if (A == D) {
                System.out.print("\nright");
            } else {
                System.out.print("\nwrong");
            }
        }
    }
}
