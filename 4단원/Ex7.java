public class Ex7 {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean b1, b2;

    //**연습 04.7**연습 4.6의 변수 선언이 주어지면 다음 중 어떤 명령문이 컴파일러 오류를 일으키는지 말해보세요.
    //
    //1. s = 65L; //  short에서 long으로 값을 할당하려면 캐스팅(명시적 형변환이 필요)
    //2. f = i+100; //float에 int 값을 할당하려한다 정상적으로 이루어진다.
    //3. i = 2*b + l; // int =(int*byte)=>int+long=>long 오류는 없다
    //4. b1 = s;    //boolean=short  반대는 가능하지만 오류가 발생한다.
    //5. b2 = s >= 57;  //비교 연산자로 boolean 결과로 내보내고 있어 가능하다.
    //6. c = b; //char=byte 정보 손실의 위험으로 오류가 난다.
    //7. c = 'b'; // 리터럴집합 처리되어 char에 할당된다.
}