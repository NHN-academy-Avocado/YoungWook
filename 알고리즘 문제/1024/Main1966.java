import java.util.LinkedList;
import java.util.Scanner;

public class Main1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<int[]> print = new LinkedList<>();
        StringBuilder stb = new StringBuilder();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int length = sc.nextInt();
            int index = sc.nextInt();
            for (int j = 0; j < length; j++) {
                print.offer(new int[] {j, sc.nextInt()});
            }
            stb.append(printque(print, index)).append("\n");
            print.clear();

        }
        System.out.println(stb.toString());

    }

    public static int printque(LinkedList<int[]> print, int find) {
        if (print.size() == 1) {
            return 1;
        }
        int printcount = 0;
        int Max = 0;
        int find2 = 0;
        for (int[] a : print) {
            if (a[0] == find) { //찾으려는 초기 인덱스값
                find2 = a[1];
            }
            if (a[1] > Max) { //우선순위 최대값
                Max = a[1];
            }
        }
        while (true) {
            if (print.getFirst()[1] == Max) {
                int a = print.getFirst()[1];
                int b = print.getFirst()[0];
                print.remove(0);
                Max = 0;
                printcount++;
                for (int[] A : print) {
                    if (A[1] > Max) { //우선순위 최대값
                        Max = A[1];
                    }
                }
                if (b == find && a == find2) {
                    return printcount;
                }
            } else {
                int[] a = print.poll();
                print.offer(a);
            }
        }

    }

}
