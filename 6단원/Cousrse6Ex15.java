public class Cousrse6Ex15 {
    //세 가지 유형의 정보는 모두 문자열로 표현되어야 합니다. Sender, Receiver 및 Text를 가져오고 설정하는 기능 외에도 메시지는 발신자와 수신자를 교체하는 작업과 세 가지 형태의 압축을 지원해야 합니다:
    //
    //Text의 시작과 끝에 있는 공백을 제거하고, 두 개 이상의 공백(단어를 구분하는 데 사용됨)이 있는 각 시퀀스를 하나의 공백으로 대체합니다;
    //모든 모음 제거;
    //(1)과 (2) 모두.
    public static void main(String[] args) {
        Message message = new Message("Alice", "Bob", "   Hello, Bob! How are you doing?   ");
        System.out.println("Original Message:");
        System.out.println(message);


        message.swapSenderReceiver();
        System.out.println("\nMessage after swapping sender and receiver:");
        System.out.println(message);


        message.compressText(1);
        System.out.println("\nMessage after compression (option 1):");
        System.out.println(message);


        message.compressText(2);
        System.out.println("\nMessage after compression (option 2):");
        System.out.println(message);


        message.compressText(3);
        System.out.println("\nMessage after compression (option 3):");
        System.out.println(message);
    }
}
