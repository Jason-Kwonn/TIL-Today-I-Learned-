/* 
	���� 1 ~ n �� �� ���丮�� ���ϱ�

	2���� �۰ų� 9���� ū ������ �Էµ� ���
	"�߸��� ���ڰ� �ԷµǾ����ϴ�." ��� �� ���α׷��� �����մϴ�.

	ex)
	1���� ũ�� 10���� ���� ������ �Է��ϼ���. : 5 <==input

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
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. : ");
		
		int inputInt = keyboard.nextInt();

		// ����
		boolean inputFail = inputInt < 2 || inputInt > 9;


		if (inputFail)
		{
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
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
