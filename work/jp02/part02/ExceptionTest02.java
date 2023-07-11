//package jp02.part02;

/*
    FileName : ExceptionTest02.java
        ==> java ExceptionTest 10 20 0 실행 시 3번째 인자값이 0이면 실행시 문제발생
        ==> 출력결과(실행시 에러) 읽고 출력결과 확인
        ====================================================
        ==> 해결 1. try{}catch() 로 문제(Exception :: 예외) 발생상황 처리, 정상종료
 */

public class ExceptionTest02 {
    //Field
    private int sum;
    private int avg;

    //Constructor
    public ExceptionTest02() {

    }

    //Method
    public void sum(int x, int y) {
        System.out.println("1. ==> sum 시작");
        sum = x + y;
        System.out.println("1. ==> 합 : " + sum);
        System.out.println("1. ==> sum 끝");
    }

    //인자값으로 0이 들어오면 문제 발생
    public void avg(int z) {
        System.out.println("2. ==> avg 시작");
        //try-catch 로 JVM 에서 던지는 Exception 객체를 처리하자.
        //==> 출력결과를 확인하자
        try {
            avg = sum / z;
        } catch (ArithmeticException e) {
            System.out.println("1. >>===================================");
            System.out.println("z 값이 0인 모양입니다. 나누기 불가");
            System.out.println("2. >>===================================");
            System.out.println(e); //System.out.println(e.toString());
            System.out.println("3. >>===================================");
            e.printStackTrace();
            System.out.println("4. >>===================================");
        }

        System.out.println("평균 : " + avg);
        System.out.println("2. ==> avg 끝");
    }

    //main
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        ExceptionTest02 et = new ExceptionTest02();
        et.sum(i, j);
        et.avg(k);

        System.out.println("main Method End...");
    } //end of main

} //end of class
