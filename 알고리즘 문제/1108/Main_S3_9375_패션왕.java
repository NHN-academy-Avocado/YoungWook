import java.util.HashMap;
import java.util.Scanner;

public class Main_S3_9375_패션왕 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            stb.append(fashion(sc.nextInt())).append("\n");
        }
        System.out.println(stb.toString());
    }

    private static int fashion(int n) {
        int count = 1; // 초기값은 1로 설정

        HashMap<String, Integer> clothes = new HashMap<>(); // 옷 종류별 갯수를 담을 Map

        for (int j = 0; j < n; j++) {
            String name = sc.next();
            String type = sc.next();

            // 해당 종류의 의상이 이미 있는 경우 기존 갯수 + 1, 없으면 새로 추가
            clothes.put(type, clothes.getOrDefault(type, 0) + 1);
        }

        // 각 의상 종류별 갯수를 이용하여 경우의 수 계산
        for (int value : clothes.values()) {
            // 각 의상 종류별 갯수 +1 (입지 않는 경우)를 곱해 모든 경우의 수를 계산
            count *= (value + 1);
        }

        // 모든 의상을 입지 않는 경우의 수인 1을 빼줌
        return count - 1;
    }
}
