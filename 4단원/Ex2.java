public class Ex2 {
    public static boolean sumOverflow(byte x, byte y) {
        Boolean result;
        if (x + y > Byte.MAX_VALUE || x + y < Byte.MIN_VALUE) { //오버플로우가 나는 부분만 체크//-127>A ||A>128
            result = true;
            return result;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(sumOverflow((byte) 63, (byte) 63));
        System.out.println(sumOverflow((byte) 64, (byte) 64));

    }
}
