//package Practices.Day02.Example5;

public class Example5
{
	public static void main(String[] args) 
	{
		String[][] text = new String[9][9];

		for (int i = 0 ; i < text.length ; i++)		// �ϵ��ڵ� ���� text.length (String array text �� �� ������ ����)
		{	
			System.out.println((i+1) + "���� ����մϴ�.\n");
			for (int j = 0 ; j < text[i].length ; j++) // �ϵ��ڵ� ���� text.length (String array text ���� n��° ������ ����)
			{
				System.out.println("text[" + i + "][" + j + "] : " + (i+1) + " * " + (j+1) + " = " + ((i+1) * (j+1)));
			}
			System.out.println("\n=============================\n");
		}
	} // end of main
} // end of class