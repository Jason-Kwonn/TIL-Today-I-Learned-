//package jb05.part03;

// final modifier : ��� �Ұ�
final class TopSecret03
{	

	// access modifier �� Ȱ���� information hiding
	// private ��������� getter method ���ؼ��� ����
	private final int secretNo = 7777;

	private TopSecret03(){
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

	//static method �� �̿��� instance return �ϰ��Ͽ� �ٸ� class ���� ��� �����ϰ� ��.
	public static TopSecret03 getInstance(){
		
		TopSecret03 topSecret = new TopSecret03();
		
		return topSecret;
		//return new TopSecret03();
	}

} // end of class



public class ModifierTest03
{
	public static void main(String[] args) 
	{
		//TopSecret topSecret = new TopSecret();
		TopSecret03 topSecret = new TopSecret03.getInstance();
		// method �� ����

		System.out.println(topSecret.getSecretNo(0));

	} // end of main

} // end of class
