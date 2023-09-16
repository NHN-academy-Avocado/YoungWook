public class Triangle { //Ex4
    private int firstside;
    private int secondside;
    private int thirdside;
    private int max;
    private int middle;
    private int min;

    public Triangle(int a, int b, int c) { //Ex4-1
        if (a > 0 && b > 0 && c > 0) { //도형의 변의 길이 양수로 받기
            this.firstside = a;
            this.secondside = b;
            this.thirdside = c;
        }

    }

    public String relength() { //Ex4-2 길이 비교 ...노가다가 정석인가?
        int A = firstside;
        int B = secondside;
        int C = thirdside;


        if (A > B && B > C) {
            max = A;
            middle = B;
            min = C;
        } else if (A > C && C > B) {
            max = A;
            middle = C;
            min = B;
        } else if (B > A && A > C) {
            max = B;
            middle = A;
            min = C;
        } else if (B > C && C > A) {
            max = B;
            middle = C;
            min = A;
        } else if (C > A && A > B) {
            max = C;
            middle = A;
            min = B;
        } else if (C > B && B > A) {
            max = C;
            middle = B;
            min = A;
        } else if (B == C && A == C) {
            return "All side same";
        } else if (A == B) {
            if (A > C) {
                max = A;
                min = C;
            } else {
                max = C;
                min = A;
            }
            return "Max :" + max + " Min:" + min;
        } else if (B == C) {
            if (B > A) {
                max = B;
                min = A;
            } else {
                max = A;
                min = B;
            }

            return "Max :" + max + " Min:" + min;
        } else if (A == C) {
            if (C > B) {
                max = C;
                min = B;
            } else {
                max = B;
                min = C;
            }
            return "Max :" + max + " Min:" + min;
        }

        return "Max: " + max + "  Mid: " + middle + "   Min:" + min;

    }

    public void sidecheck() { //Ex4-3 변길이 체크
        if (max < min + middle) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public int sumside() { //Ex4-4 둘레 반환
        return firstside + secondside + thirdside;
    }//Ex4-4 총둘레

    public int area() {  //Ex4-5 넓이 반환
        int A = 0; //면적 변수
        int s = sumside() / 2;
        A = (int) Math.sqrt(s * (s - firstside) * (s - secondside) * (s - thirdside));
        return A;
    }

    public String typetriangle() { //Ex4-6 삼각형 종류 반환

        int A = this.firstside;
        int B = this.secondside;
        int C = this.thirdside;
        if ((A == B && A != C) || (B == C && B != A) || (C == A && C != B)) {//아등변 삼각형
            return "symmetric";
        } else if (A == B && B == C && C == A) { //정삼각형
            return "regular";
        } else { //다른 변이 전부 다를 경우
            return "irregular";
        }

    }


}
