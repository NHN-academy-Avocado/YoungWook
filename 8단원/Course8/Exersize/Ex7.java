package Course8.Exersize;

public class Ex7 {
    //단원 4와 5에서와 같이 은행 계좌 집합을 처리하는 HandleBAs 클래스를 구현합니다.
    // 은행 계좌에 대한 데이터는 다음 형식에 따라 텍스트 파일에 저장됩니다:
    //name
    //surname
    //balance
    //HandleBAs 클래스는 다음 메서드를 내보내야 합니다:
    //HandleBAs(String filename) : 생성자는 은행 계좌에 대한 데이터가 저장된 텍스트 파일의 이름을 매개변수로 받아 해당 파일과 연관된 객체를 생성합니다;
    //void interests(double rate) :  매개변수에 지정된 이자율을 적용하여 모든 계정의 잔액을 업데이트합니다;
    //printNegative() : 잔액이 마이너스인 모든 은행 계좌에 대한 데이터를 동영상에 인쇄할 수 있습니다.

    public static void main(String[] args) {
        HandleBAs a1 = new HandleBAs("Kim", "Toss", 128437 + "");
        HandleBAs a2 = new HandleBAs("Young", "kb", 472898 + "");
        HandleBAs a3 = new HandleBAs("Wook", "hj", 238923 + "");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        new HandleBAs("Kim");

    }
}
