//package jb05.part03;


class TopSecret02
{	

	// access modifier �� Ȱ���� information hiding
	// private ��������� getter method ���ؼ��� ����
	private int secretNo = 7777;

	public TopSecret02(){
	}

	//getter Method
	//method �� ���� ������ ������ ��츸 secretNo �� return
	public int getSecretNo(int pwd){
		
		if (pwd == 0)
		{
			return secretNo;

		} else {

			return 0;

		}
	}
} // end of class



public class ModifierTest02
{
	public static void main(String[] args) 
	{
		TopSecret02 topSecret = new TopSecret02();

		//System.out.println(topSecret.secretNo);

		// private �� ���� Method �θ� ���� ����
		//topSecret.secretNo = 1234;
		System.out.println(topSecret.getSecretNo(0));
	} // end of main
} // end of class
