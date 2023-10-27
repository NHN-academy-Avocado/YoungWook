import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2108 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Num = new ArrayList<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            Num.add(sc.nextInt());
        }
        StringBuilder stb = new StringBuilder();
        stb.append((int) avr(Num)).append("\n");
        stb.append(sent(Num)).append("\n");
        stb.append(Bin(Num)).append("\n");
        stb.append(range(Num)).append("\n");
        System.out.println(stb.toString());


    }

    private static int sent(ArrayList<Integer> num) {
        Collections.sort(num);
        if (num.size() % 2 == 0) {
            return (num.get((num.size() / 2 - 1)) + num.get(num.size() / 2)) / 2;
        } else if (num.size() % 2 != 0) {
            return num.get((num.size() - 1) / 2);
        } else {
            return num.get(0);
        }


    }

    private static int Bin(ArrayList<Integer> num) {

        Map<Integer, Integer> count = new HashMap<>();
        for (int a : num) {
            if (!count.containsKey(a)) {
                count.put(a, 0);
            } else {
                count.replace(a, count.get(a) + 1);
            }
        }
        ArrayList<Integer> max = new ArrayList<>();
        for (Map.Entry<Integer, Integer> a : count.entrySet()) {
            if (a.getValue().equals(Collections.max(count.values()))) {
                max.add(a.getKey());
            }
        }
        Collections.sort(max);
        if (max.size() > 1) {
            return max.get(1);
        } else {
            return max.get(0);
        }
    }

    private static int range(ArrayList<Integer> num) {
        return Collections.max(num) - Collections.min(num);
    }

    public static double avr(ArrayList<Integer> Num) {
        double sum = 0;
        for (double num : Num) {
            sum += num;
        }
        return Math.round((double) sum / Num.size());

    }

}

