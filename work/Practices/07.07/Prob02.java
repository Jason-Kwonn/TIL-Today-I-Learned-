/* 
	�Ҽ��� �ڽŰ� 1 �ܿ� �ٸ� ���δ� �������� �ʴ� �����̴�.

	50 ������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

*/


public class Prob02 
{
	public static void main(String[] args) 
	{

		int limit = 50;

		// ����
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
