//package jp02.part02;

/*
    FileName : ExceptionTest01.java
        ==> java ExceptionTest 10 20 0 실행 시 3번째 인자값이 0이면 실행시 문제발생
        ==> 출력결과(실행시 에러) 읽고 출력결과 확인
 */

public class ExceptionTest01 {
    //Field
    private int sum;
    private int avg;

    //Constructor
    public ExceptionTest01() {

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
        //z = 0 인 경우 불능
        avg = sum / z;
        System.out.println("2. ==> 평균 " + avg);
        System.out.println("2. ==> avg 끝");
    }

    //main
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        ExceptionTest01 et = new ExceptionTest01();
        et.sum(i, j);
        et.avg(k);

        System.out.println("main Method End...");
    } //end of main

} //end of class
