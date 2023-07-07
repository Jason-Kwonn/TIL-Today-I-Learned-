/* 
	정수 1 ~ n 의 각 팩토리얼 구하기

	2보다 작거나 9보다 큰 정수가 입력된 경우
	"잘못된 숫자가 입력되었습니다." 출력 후 프로그램을 종료합니다.

	ex)
	1보다 크고 10보다 작은 정수를 입력하세요. : 5 <==input

	1! = 1

	2! = 2
	
	3! = 6

	4! = 24

	5! = 120
	...
*/

import java.util.Scanner;

public class Prob03 
{
	public static void main(String[] args) 
	{	
		Scanner keyboard  = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		
		int inputInt = keyboard.nextInt();

		// 구현
		boolean inputFail = inputInt < 2 || inputInt > 9;


		if (inputFail)
		{
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;

		} 

		for (int i = 1; i <= inputInt; i++)
		{	
			int res = 1;

			for (int j = i; j > 0 ; j--)
			{
				res *= j;

			} // end of inner for
			
		System.out.println(i + "! = " + res);

		} // end of outer for

	} // end of main

} // end of class
