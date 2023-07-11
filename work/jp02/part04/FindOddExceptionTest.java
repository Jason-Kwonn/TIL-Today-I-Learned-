//package jp02.part04;

/*
    FileName : FindOddException.java

    1. Exception class 상속, 새로운 Exception 구현 ==> User Definition Exception
    2. User Definition Exception : JRE 에서 예외를 생성 및 발생 불가.
    3. User Definition Exception : 프로그램에서 개발자가 필요시 생성, 발생 시켜야 한다.
       (throw 의 사용 : User Definition Exception 발생시키기)
*/

class FindOddException extends Exception {
    //Field

    //Constructor
    public FindOddException() {
        System.out.println("==> FindOddException Default Constructor");
    }

    public FindOddException(String msg) {
        super(msg);
        System.out.println("==> 인자가 있는 FindOddException Constructor");
    }
} //end of class


public class FindOddExceptionTest  {

    //Field

    //Constructor
    public FindOddExceptionTest() {

    }

    //Method
    //홀수가 입력되면 FindOddException 발생시키는 Method
    public void test(int number) throws FindOddException {
        System.out.println(":: " + this.getClass().getName() + "start..");

        if (number % 2 == 0) {
            System.out.println("입력하신 수 : " + number);
        } else {
            throw new FindOddException();
        }

        System.out.println(":: " + this.getClass().getName() + "end..\n");
    }

    //main
    public static void main(String[] args) {
        FindOddExceptionTest met = new FindOddExceptionTest();
        try {
            met.test(10);
            met.test(11);
        } catch (FindOddException e) {
            System.out.println("\n e = " + e);
        }
    } //end of main
} //end of class
