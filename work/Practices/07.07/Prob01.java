import java.util.Scanner;

/* 
	1 < int x < 10 를 런타임에서 입력 받아 구구단 x 단 실행하기
	
	x < 2 || x > 9 "잘못된 숫자가 입력되었습니다." 이면 출력 후 프로그램 바로 종료

	ex)
	1보다 크고 10보다 작은 정수를 입력하세요. : x (input)

	3 * 1 = 3

	3 * 2 = 6 ...

*/


public class Prob01 
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
		
					
		for (int i = 1 ; i <= 9 ; i++)
		{

			System.out.println(inputInt + " * " + i + " = " + inputInt * i);

		} // end of for

	} // end of main

} // end of class
