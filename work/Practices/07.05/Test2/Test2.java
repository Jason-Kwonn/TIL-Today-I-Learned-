//package Practices.Day01.Test2;

/*
[2] : 두 수를 입력받고 두 수를 비교하여 더하기 / 빼기 예제
        첫번째 인수가 크면 빼고 / 적으면 더하기
        FileName : Test2.java
        실행 예 > java Test02 2 1
        ==> 실행 결과 (출력결과..)
        첫번째 인수 : 2, 두번째 인수 : 1. 2-1 = 1 입니다.

        실행 예 > java Test2 1 2
        ==> 실행 결과 (출력결과..)
        첫번째 인수 : 1, 두번째 인수 : 2, 2+1 = 3 입니다.
 */

public class Test2 {

    public static void main(String[] args) {

		
		int calTest1 = Integer.parseInt(args[0]);
		int calTest2 = Integer.parseInt(args[1]);

		if (calTest1 < calTest2)
		{
			System.out.println("첫번째 인수 : " + calTest1 + ", 두번째 인수 : " + calTest2 + ", " 
				+ calTest2 + "+" + calTest1 + " = " + (calTest1 + calTest2) + " 입니다.");
		} else {
			System.out.println("첫번째 인수 : " + calTest1 + ", 두번째 인수 : " + calTest2 + ", " 
				+ calTest1 + "-" + calTest2 + " = " + (calTest1 - calTest2) + " 입니다.");
		} // end of condition

} // end of class