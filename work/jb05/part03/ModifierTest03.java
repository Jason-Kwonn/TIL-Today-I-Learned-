//package jb05.part03;

// final modifier : 상속 불가
final class TopSecret03
{	

	// access modifier 를 활용한 information hiding
	// private 접근제어로 getter method 통해서만 접근
	private final int secretNo = 7777;

	private TopSecret03(){
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

	//static method 를 이용한 instance return 하게하여 다른 class 에서 사용 가능하게 함.
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
		// method 로 접근

		System.out.println(topSecret.getSecretNo(0));

	} // end of main

} // end of class
