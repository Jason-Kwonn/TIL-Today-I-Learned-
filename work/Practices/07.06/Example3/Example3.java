//package Practices.Day02.Example3;

public class Example3
{
	public static void main(String[] args) 
	{

		int intScan1 = Integer.parseInt(args[0]);
		int intScan2 = Integer.parseInt(args[1]);

		
		if (args.length != 2)

		{
			System.out.println("정수가 2개가 아닙니다. [usage]:: 2개의 정수를 입력하십시오");
			return;

		}


		if (intScan1 == intScan2)

		{
			System.out.println("입력 값이 같습니다. [usage]:: 서로 다른 정수를 입력하십시오");
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

		System.out.println(intScan1 + " ~ " + intScan2 + "의 합은 " + sum + "입니다.");

	} // end of main

} // end of class
