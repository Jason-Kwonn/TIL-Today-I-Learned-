package jb01.part07;

/*
    FileName : IfElse02.java

    1. 조건연산자 연습
    2. 분기문 if - else 연습
    3. AND : &, && 연산자
    4. OR : |, || 연산자
 */
public class IfElse02 {
    // main method
    public static void main(String args[]) {
        int x = 1;
        int y = 2;

        // & ==> and 연산자
        if (x == 3 & y == 2) {
            System.out.println("x = 1 이고 y = 2 입니다.");
        }
        // | ==> or 연산자
        if (x == 1 | y == 3) {
            System.out.println("x = 1 이거나 y = 3 입니다.");
        }

        // && ==> and 연산자
        if (x == 3 && y == 2) {
            System.out.println("x = 1 이고 y = 2 입니다.");
        }

        // || ==> or 연산자
        if (x == 1 || y == 3) {
            System.out.println("x = 1 이거나 y = 3 입니다.");
        }

        /*
            1. && 와 & , || 와 | 는 수행 결과는 같으나
            2. 내부적으로는 수행 방법은 엄격히 다르다.
                ==> & 와 | 는 : 전부 수행
                ==> && 와 || 는 : 전자가 결과를 예측 가능할 경우 일부 수행하지 않음
         */
    } // end of main
} // end of class
