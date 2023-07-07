//package jb05.part05.test03;

/*
	FileName : Display.java
	1. BusCharge.class 의 charge() Method 사용유무는?
	2. 하위클래스 (Student, Adult, Old) 에서 charge() method 가 OverRiding 않는다면?

	////////////////////////////////////////////////////////////////////////////////

	==> abstract method / abstract class 의 필요성 및 이해

		abstract method
		: 구체적일 필요 없는 method
		: 하위에서 구체적 재정의 하는 강제성을 갖는 method

		abstract class
		: 구체적일 필요 없는 method 가 정의된 클래스
		: 일반화 관계중 공통적, 일반적 행위와 속성을 공유 목적으로 정의된 클래스

*/

abstract class BusCharge
{
	//Field
	String section;

	//Constructor
	public BusCharge(){
	}

	public BusCharge(String section){
		this.section = section;
	}

	// method
	public void information() {
		System.out.println("버스요금안내");
	}


//==>	사용되지 않으며, 하위클래스에 Over Riding 을 강제하는 추상메서드 정의
//	public void charge(){
//		System.out.println("학생 : 300, 일반인 : 500, 어르신 : 공짜");
//	}
	

	public abstract void charge();

	
} // end of class



//==> abstract class 상속 시 abstract method 필히 재정의 (OverRiding) 해야함. <====== 강제성
class Student extends BusCharge
{
	public Student(){
		super("학생");
	}
	
	//=======> 아래 method 주석처리 하고 컴파일 에러 확인
	public void charge(){
		System.out.println("300원");
	}
} // end of class


//==> abstract class 상속 시 abstract method 필히 재정의 (OverRiding) 해야함. <====== 강제성
class Adult extends BusCharge
{
	public Adult(){
		super("일반인");
	}
	public void charge(){
		System.out.println("500원");
	}
	
} // end of class


//==> abstract class 상속 시 abstract method 필히 재정의 (OverRiding) 해야함. <====== 강제성
class Old extends BusCharge
{
	public Old(){
		super("어르신");
	}

	public void charge(){
		System.out.println("공짜");
	}
} // e o c


public class Display
{
	//main method
	public static void main(String[] args){
		

		// 상위 레퍼런스로 하위 인스턴스를 참조 가능 (묵시적 현변환 / ~ is a ~ Relation)

		Buscharge bc1 = new Student(); // Student b1 = new Student();
		Buscharge bc2 = new Adult(); // Adult b2 = new Adult();
		Buscharge bc3 = new Old(); // Old b3 = new Old();

		bc1.information();
		System.out.println(bc1.section);
		bc1.charge(); // 어떤 클래스의 Method 호출되었는지 확인
		
		bc2.information();
		System.out.println(bc2.section);
		bc2.charge(); // 어떤 클래스의 Method 호출되었는지 확인

		bc3.information();
		System.out.println(bc3.section);
		bc3.charge(); // 어떤 클래스의 Method 호출되었는지 확인

	} // end of main

} // end of class
