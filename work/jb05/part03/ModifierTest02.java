//package jb05.part03;


class TopSecret02
{	

	// access modifier 를 활용한 information hiding
	// private 접근제어로 getter method 통해서만 접근
	private int secretNo = 7777;

	public TopSecret02(){
	}

	//getter Method
	//method 를 통해 조건을 충족할 경우만 secretNo 를 return
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

		// private 로 인해 Method 로만 접근 가능
		//topSecret.secretNo = 1234;
		System.out.println(topSecret.getSecretNo(0));
	} // end of main
} // end of class
