import java.util.ArrayList;
import java.util.Scanner;

public class Main1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int haveK = sc.nextInt();
        int needN = sc.nextInt();
        ArrayList<Long> length = new ArrayList<>();
        long max = 0;
        for (int i = 0; i < haveK; i++) {
            long a = sc.nextInt();
            length.add(a);
            max = Math.max(max, length.get(i));
        }

        int start = 1;
        long end = max;

        while (start <= end) {
            long countsum = 0;
            long mid = (start + end) / 2;
            for (long q : length) {
                countsum += (q / mid);
            }

            if (countsum < needN) {
                end = (int) (mid - 1);
            } else if (countsum >= needN) {
                start = (int) mid + 1;
            }

        }
        System.out.println(end);
    }
}
//재출 답안


//***
// import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//
//    public static int k, n, max;
//
//    public static int[] arr, answer;
//
//    public static StringBuilder sb = new StringBuilder();
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = null;
//
//        st = new StringTokenizer(br.readLine());
//
//        k = Integer.parseInt(st.nextToken());
//
//        n = Integer.parseInt(st.nextToken());
//
//        arr = new int[k];
//
//        for (int i = 0; i < k; i++) {
//
//            arr[i] = Integer.parseInt(br.readLine());
//
//            max = Math.max(max, arr[i]);
//
//        }
//
//
//        binarySearch();
//
//    }
//
//    public static void binarySearch() {
//
//        long start = 1;
//
//        long end = max;
//
//        while (start <= end) {
//
//            long mid = (start + end) / 2;
//
//            long count = 0;
//
//            for (int i = 0; i < k; i++) {
//
//                count += arr[i] / mid;
//
//            }
//
//            if (count < n) {
//
//                end = mid - 1;
//
//            } else if (count >= n) {
//
//                start = mid + 1;
//
//            }
//
//        }
//
//        System.out.println(end);
//
//    }
//
//}/