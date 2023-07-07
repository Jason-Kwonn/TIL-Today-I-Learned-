//package Practices.Day01.Example1;
//import java.util.Scanner;

/*
[4] : ���ڸ� �Է¹޾� (1~100) 90�̻� ��, 80�� �̻� ��, 70�� �̻� ��, 60�� �̻� ��
      �� ���ϴ� ���� ����ϱ�
      (�Է��� ���� 0~100 �̾�� �Ѵ�. �� �̻� �� ������ ��� ��� ó���� ���ΰ�)
        FileName : Example1.java

        ���� �� > java Example1 95
        ==> ������ (��°��..)
        �Է��Ͻ� �� 95���� ���Դϴ�.
 */

public class Example1 {
    public static void main(String[] args) {

		int zeroToHundred = Integer.parseInt(args[0]);

		if (zeroToHundred > 100 || zeroToHundred < 0)
		{	

			System.out.println("0~100 ������ ���� �Է��� �ֽʽÿ�");
			return;

		}
		
		String grade = "��";

		switch (zeroToHundred/10)
		{
		case 10:
		case 9:
			break;
		case 8:
			grade = "��";
			break;
		case 7:
			grade = "��";
			break;
		case 6:
			grade = "��";
			break;
		default:
			grade = "��";
			break;
		} // end of switch

		System.out.println("�Է��Ͻ� �� " + zeroToHundred + " �� \"" + grade + "\" �Դϴ�.");

    } // end of main

} // end of class
