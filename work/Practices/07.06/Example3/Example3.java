//package Practices.Day02.Example3;

public class Example3
{
	public static void main(String[] args) 
	{

		int intScan1 = Integer.parseInt(args[0]);
		int intScan2 = Integer.parseInt(args[1]);

		
		if (args.length != 2)

		{
			System.out.println("������ 2���� �ƴմϴ�. [usage]:: 2���� ������ �Է��Ͻʽÿ�");
			return;

		}


		if (intScan1 == intScan2)

		{
			System.out.println("�Է� ���� �����ϴ�. [usage]:: ���� �ٸ� ������ �Է��Ͻʽÿ�");
			return;

		}



		int sum = 0;

		if (intScan1 > intScan2)
		{
			int intSwap = intScan1;
			intScan1 = intScan2;
			intScan2 = intSwap;


			for (int i = intScan1; i <= intScan2; i++)
				{

					sum += i;

				}

		} else {

			for (int i = intScan1; i <= intScan2; i++)
				{

					sum += i;

				}

		}// end of condition

		System.out.println(intScan1 + " ~ " + intScan2 + "�� ���� " + sum + "�Դϴ�.");

	} // end of main

} // end of class
