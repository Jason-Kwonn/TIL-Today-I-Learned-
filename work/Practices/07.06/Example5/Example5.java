//package Practices.Day02.Example5;

public class Example5
{
	public static void main(String[] args) 
	{
		String[][] text = new String[9][9];

		for (int i = 0 ; i < text.length ; i++)		// 하드코딩 말고 text.length (String array text 의 방 갯수로 지정)
		{	
			System.out.println((i+1) + "단을 출력합니다.\n");
			for (int j = 0 ; j < text[i].length ; j++) // 하드코딩 말고 text.length (String array text 윗방 n번째 방으로 지정)
			{
				System.out.println("text[" + i + "][" + j + "] : " + (i+1) + " * " + (j+1) + " = " + ((i+1) * (j+1)));
			}
			System.out.println("\n=============================\n");
		}
	} // end of main
} // end of class