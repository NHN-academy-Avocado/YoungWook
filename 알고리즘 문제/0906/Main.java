import java.lang.reflect.Array;
import java.util.stream.Stream;

public class Main {

    private static double correctCount = 0;

    private static final String[][] TESTCASES = new String[][] {
            {"123", "123", "246"},
            {"1000", "1", "2"},
            {"456", "789", "1461"},
            {"5", "5", "1"},
            {"11112", "54321", "65433"},
            {"3829", "1300", "4139"}
    };

    public static void main(String[] args) {
        for (int i = 0; i < TESTCASES.length; i++)
            System.out.println("Testcase " + i + " = " + test(TESTCASES[i][0], TESTCASES[i][1], TESTCASES[i][2]));

        System.out.println("정답률 = " + (int) (correctCount / TESTCASES.length * 100) + "%");
    }

    private static boolean test(String input, String input2, String answer) {
        int first = Integer.parseInt(input);
        int second = Integer.parseInt(input2);

        boolean res = String.valueOf(solution(first, second)).equals(answer);
        if (res)
            correctCount++;
        return res;
    }

    // solution
    public static int solution(int a, int b) {
            return reverse(reverse(a)+reverse(b));
        
        
    }
    static int reverse(int n){ 
            if (n<10){
                return n;
            }
            return (n%10)*(int)Math.pow(10,(int)Math.log10(n))+reverse(n/10);
            
        }
}

    //Point*
    //toCharArray(): 배열에 한자리씩 자동적으로 추가해주는 함수
    // toString():문자열을 하나의 문장?하나로 묶어주기
    //해결 알고리즘의 요점*
    // 1.반복되는 메소드가 있다면 재사용이 가능하게 해서 코드 작성시간을 줄이자



        // int [] A= Stream.of(String.valueOf(a).split("")).mapToInt(Integer::parseInt).toArray() ;
        // int [] B= Stream.of(String.valueOf(b).split("")).mapToInt(Integer::parseInt).toArray();
        // int [] intArrayA= new int[A.length];
        // int [] intArrayB = new int [B.length];

        
        // for (int i=0;i< A.length; i++){
        //     int X= A.length;
        //     A[i]=A[X];
        //     X--;

        // }
        // for (int s=0; s<B.length;s++){
        //     int Y= B.length;
        //     B[s]=B[Y];
        //     Y--;
        // }
        // for(int i = 0; i < A.length; i++){
        //     intArrayA[i] = Integer.parseInt(A[i]);
        // }
        // for(int i = 0; i < B.length; i++){
        //     intArrayB[i] = Integer.parseInt(B[i]);
        // }
        // int result = ;

        