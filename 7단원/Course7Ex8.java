public class Course7Ex8 {
    public static int mystery(int[] A) { //int 반환 예상
        int x = 0;
        for (int i = 0; i < A.length; i++) //매게변수 A를 받아 각 요소의 짝수 여부 확인 후 카운팅 중
        {
            if (A[i] % 2 == 1) {
                x++;
            }
        }
        return x;
    }
    //결론:배열 내 짝수 갯수 확인 메소드
}
