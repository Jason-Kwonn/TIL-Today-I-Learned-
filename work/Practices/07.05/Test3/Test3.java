//package Practices.Day01.Test3;

/*
[3] : �� ���� �Է¹ް� �Է¹��� ���� ¦��, Ȧ��, 3�� ����� �Ǵ��ϱ�
        FileName : Test3.java

        ���� �� > java Test3 10 15
        ==> ������ (��°��..)(�˾Ƽ� ����� ��)
        �Է��Ͻ� 1��° ���ڰ� 10�� ¦�� �̸� 3�� ����� �ƴմϴ�..
        �Է��Ͻ� 2��° ���ڰ� 15�� Ȧ�� �̸� 3�� ����Դϴ�.
 */

public class Test3 {
    public static void main(String[] args) {

		int numScan1 = Integer.parseInt(args[0]);
		int numScan2 = Integer.parseInt(args[1]);
		
		if (numScan1 % 2 == 1)
		{
			if (numScan1 % 3 == 0)
			{
				System.out.println("�Է��Ͻ� 1��° ���ڰ� " + numScan1 + "��(��) Ȧ�� �̸� 3�� ��� �Դϴ�.");
			} else {
				System.out.println("�Է��Ͻ� 1��° ���ڰ� " + numScan1 + "��(��) Ȧ�� �̸� 3�� ����� �ƴմϴ�.");
			}
		} else {
			System.out.println("�Է��Ͻ� 1��° ���ڰ� " + numScan1 + "��(��) ¦�� �̸� 3�� ����� �ƴմϴ�.");
		}

		if (numScan2 % 2 == 1)
		{
			if (numScan2 % 3 == 0)
			{
				System.out.println("�Է��Ͻ� 2��° ���ڰ� " + numScan2 + "��(��) Ȧ�� �̸� 3�� ��� �Դϴ�.");
			} else {
				System.out.println("�Է��Ͻ� 2��° ���ڰ� " + numScan2 + "��(��) Ȧ�� �̸� 3�� ����� �ƴմϴ�.");
			}
		} else {
			System.out.println("�Է��Ͻ� 2��° ���ڰ� " + numScan2 + "��(��) ¦�� �̸� 3�� ����� �ƴմϴ�.");
		}
    }
}
