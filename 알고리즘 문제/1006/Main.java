import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] words = new String[T];
        int max = 0;
        for (int i = 0; i < T; i++) {
            words[i] = br.readLine();
            if (words[i].length() > max) {
                max = words[i].length();
            }
        }
        Arrays.sort(words);
        List<String> liWithoutDuplicate = Arrays.asList(words).stream().distinct().collect(Collectors.toList());
        int len = 1;


        while (len != max + 1) {
            for (String word : liWithoutDuplicate) {
                if (word.length() == len) {
                    System.out.println(word);
                }
                if (word.equals(liWithoutDuplicate.get(liWithoutDuplicate.size() - 1))) {
                    len++;
                }


            }
        }


    }
}
