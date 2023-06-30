package jb01.part06;

/*
    FileName : OperatorTest.java

    1. ++ , -- : 증가, 감소 연산자
    2. %       : 나머지 연산자
    3. 3항 연산자
 */

public class OperatorTest {
    // main method
    public static void main(String[] args) {
        int value = 1;

        // 증감연산자의 사용
        value++; // value++ 의미 : 자기 자신 1증가
        System.out.println("value++ = " + value);
        ++value; // ++value 의미 : 자기 자신 1증가
        System.out.println("++value = " + value);

        value--; // value-- 의미 : 자기자신 1감소
        System.out.println("value-- = " + value);
        --value; // --value 의미 : 자기자신 1감소
        System.out.println("--value = " + value);

        // 증감연산자 사용 //==> 주석을 풀면서 결과를 확인
        int temp = value++; // temp = value++ 의미 : value 의 값을 temp 대입 후 자기자신 1증가
//        int temp = value--; // temp = value-- 의미 : value 의 값을 temp 대입 후 자기자신 1감소
//        int temp = ++value; // temp = ++value 의미 : value 의 값을 1증가 후 temp 에 대입
//        int temp = --value; // temp = --value 의미 : value 의 값을 1감소 후 temp 에 대입
        System.out.println("temp = " + temp);
        System.out.println("value = " + value);

        // 나머지 연산자 사용하기
        int temp01 = 5 % 2;
        int temp02 = 5 % 3;
        System.out.println("나머지 연산자 : 5%2 " + temp01);
        System.out.println("나머지 연산자 : 5%3 " + temp02);

        // 삼항연산자 :: (조건)? 조건이 참이면 : 조건이 거짓이면;
        int temp03 = (1 <= 2) ? 3 : 4;
        System.out.println("삼항연산자 : (1 <= 2) ? 3 : 4 ==> " + temp03);

//        int temp04 = (1 =< 2) ? 3 : 4; //<== Compile Error 확인
    } // end of main
} // end of class

