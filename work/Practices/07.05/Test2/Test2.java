//package Practices.Day01.Test2;

/*
[2] : �� ���� �Է¹ް� �� ���� ���Ͽ� ���ϱ� / ���� ����
        ù��° �μ��� ũ�� ���� / ������ ���ϱ�
        FileName : Test2.java
        ���� �� > java Test02 2 1
        ==> ���� ��� (��°��..)
        ù��° �μ� : 2, �ι�° �μ� : 1. 2-1 = 1 �Դϴ�.

        ���� �� > java Test2 1 2
        ==> ���� ��� (��°��..)
        ù��° �μ� : 1, �ι�° �μ� : 2, 2+1 = 3 �Դϴ�.
 */

public class Test2 {

    public static void main(String[] args) {

		
		int calTest1 = Integer.parseInt(args[0]);
		int calTest2 = Integer.parseInt(args[1]);

		if (calTest1 < calTest2)
		{
			System.out.println("ù��° �μ� : " + calTest1 + ", �ι�° �μ� : " + calTest2 + ", " 
				+ calTest2 + "+" + calTest1 + " = " + (calTest1 + calTest2) + " �Դϴ�.");
		} else {
			System.out.println("ù��° �μ� : " + calTest1 + ", �ι�° �μ� : " + calTest2 + ", " 
				+ calTest1 + "-" + calTest2 + " = " + (calTest1 - calTest2) + " �Դϴ�.");
		} // end of condition

} // end of class