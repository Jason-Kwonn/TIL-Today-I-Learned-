//package Practices.Day02.Example2;
//import java.util.Scanner;

public class Example2
{
	public static void main(String[] args) 
	{

		int zeroTen = Integer.parseInt(args[0]);
		
		if (zeroTen <= 9 && zeroTen >= 1)
		{
			System.out.println(zeroTen + " ���� ����մϴ�.");
			
			for (int i=1; i<10; i++)
			{
				System.out.println(i + " * " + zeroTen + " = " + i*zeroTen);
			}
		} else {
			System.out.println("1~9 ������ ���� �Է��� ��");
		}

	} // end of main

} // end of class
