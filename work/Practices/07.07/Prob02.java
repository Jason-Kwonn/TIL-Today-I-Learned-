/* 
	소수란 자신과 1 외에 다른 수로는 나눠지지 않는 정수이다.

	50 이하의 소수를 모두 출력하는 프로그램을 작성하시오.

*/


public class Prob02 
{
	public static void main(String[] args) 
	{

		int limit = 50;

		// 구현
		for (int i = 2 ; i <= limit ; i++)
		{	
			boolean prime = true;
			
			for (int j = 2; j < i ; j++)
			{
				if (i % j == 0)
				{
					prime = false;
					break;

				}
			
			} // end of inner for

			if (prime == true)
			{
				System.out.println(i);
			}

		} // end of outer for

	} // end of main

} // end of class
