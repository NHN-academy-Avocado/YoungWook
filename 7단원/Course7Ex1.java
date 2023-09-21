public class Course7Ex1 {
    //길이가 같다고 가정하여 두 배열 A와 B의 스칼라 곱을 계산하는 메서드 정적 double scalarProduct(double[] A, double[] B)를 작성합니다. A와 B의 스칼라 곱은 0 <= i < A.length에서 모든 i에 대해 A[i]*B[i]의 곱의 합으로 구한다는 것을 기억합니다.


    public static double scalarProduct(double[] A, double[] B) {
        if (A.length != B.length) {
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        double product = 0.0;

        for (int i = 0; i < A.length; i++) {
            product += A[i] * B[i];
        }

        return product;
    }

    public static void main(String[] args) {
        double[] A = {1.0, 2.0, 3.0};
        double[] B = {4.0, 5.0, 6.0};

        double result = scalarProduct(A, B);
        System.out.println("Scalar: " + result);
    }
}

