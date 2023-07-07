import java.util.Scanner;

/* 
	1 < int x < 10 �� ��Ÿ�ӿ��� �Է� �޾� ������ x �� �����ϱ�
	
	x < 2 || x > 9 "�߸��� ���ڰ� �ԷµǾ����ϴ�." �̸� ��� �� ���α׷� �ٷ� ����

	ex)
	1���� ũ�� 10���� ���� ������ �Է��ϼ���. : x (input)

	3 * 1 = 3

	3 * 2 = 6 ...

*/


public class Prob01 
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
		
					
		for (int i = 1 ; i <= 9 ; i++)
		{

			System.out.println(inputInt + " * " + i + " = " + inputInt * i);

		} // end of for

	} // end of main

} // end of class
