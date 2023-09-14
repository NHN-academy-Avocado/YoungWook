public class Ex5 {
    //byte는 8비트(1바이트) short는 16비트(2바이트)
    public static void main(String[] args) {
        short x = 22;
        byte y = Byte.parseByte(String.valueOf(x)); //변수의 유형을 바꾸지 않고
        System.out.println(y);
    }
}
