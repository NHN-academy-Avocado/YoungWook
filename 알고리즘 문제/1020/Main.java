import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        int val = 0;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arr1 = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int j = 0;
        //이진 검색 트리
        for (int k = 0; k < M; k++) {
            int high = N - 1;
            int low = 0;

            while (low <= high) {
                int mid = (low + high) / 2;
                val = 0;
                if (arr1[j] == arr[mid]) {
                    sb.append(1 + "\n");
                    val = 1;
                    j++;
                    break;
                } else if (arr1[j] > arr[mid])//key>mid
                {
                    low = mid + 1;
                } else //key>mid
                {
                    high = mid - 1;
                }
            }
            if (val == 0) {
                sb.append(0 + "\n");
                j++;
            }
        }
        System.out.print(sb);
    }
}