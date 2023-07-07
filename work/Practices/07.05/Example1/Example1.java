//package Practices.Day01.Example1;
//import java.util.Scanner;

/*
[4] : 숫자를 입력받아 (1~100) 90이상 수, 80점 이상 우, 70점 이상 미, 60점 이상 양
      그 이하는 가를 출력하기
      (입력한 값이 0~100 이어야 한다. 그 이상 그 이하일 경우 어떻게 처리할 것인가)
        FileName : Example1.java

        실행 예 > java Example1 95
        ==> 실행결과 (출력결과..)
        입력하신 값 95점은 수입니다.
 */

public class Example1 {
    public static void main(String[] args) {

		int zeroToHundred = Integer.parseInt(args[0]);

		if (zeroToHundred > 100 || zeroToHundred < 0)
		{	

			System.out.println("0~100 까지의 수를 입력해 주십시오");
			return;

		}
		
		String grade = "수";

		switch (zeroToHundred/10)
		{
		case 10:
		case 9:
			break;
		case 8:
			grade = "우";
			break;
		case 7:
			grade = "미";
			break;
		case 6:
			grade = "양";
			break;
		default:
			grade = "가";
			break;
		} // end of switch

		System.out.println("입력하신 값 " + zeroToHundred + " 은 \"" + grade + "\" 입니다.");

    } // end of main

} // end of class
