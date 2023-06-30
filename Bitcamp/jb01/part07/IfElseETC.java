package jb01.part07;

/*
    FileName : IfElseETC.java

    1. 문자를 int Data Type 로 변경하는 Integer.parseInt() 사용
    2. 특수문자 사용하기 ( \t, \n, \" )

    실행 방법 예 >> java IfElseETC 1 2
 */

public class IfElseETC {
    // main method
    public static void main(String args[]) {
        //==> \" 사용확인
        System.out.println("입력하신 \"1번째 인수\"는 : " + args[0]);
        System.out.println("입력하신 \"2번째 인수\"는 : " + args[1]);

        System.out.println("===================================");

        // 입력한 문자를 int DataType 으로 변경하는 Integer.parseInt() 사용
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);

        // i, j 변수에 값을 확인하자.
        System.out.println("i = " + i + "j = " + j); //<== 특수문자 \t 사용 : 출력 결과 확인
        System.out.println("한줄 처리 \n");             //<== 특수문자 \n 사용 : 출력 결과 확인
        System.out.println("============================================");

        if (i > j) {
            System.out.println("i 가 j 보다 큽니다.");
        } else if (i == j) {
            System.out.println("i 와 j 는 같습니다.");
        } else if (i < j) {
            System.out.println("i 보다 j 가 큽니다.");
        }
    } // end of main
} // end of class

