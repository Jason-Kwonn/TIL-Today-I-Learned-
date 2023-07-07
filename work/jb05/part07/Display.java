//package jb05.part07;

/*
	FileName : Display.java
	
	<<<< interface >>>>
		: abstract method 의 집합 (기능만 정의한 class / pure abstract class)
		  기능(method)만 정의, 하위(구현) class 에서 O/R 강제
		: 인스턴스 생성 불가 (추상클래스는 인스턴스 생성불가와 같은 의미)
		  SPEC. 은 사용방법을 정의한 것이며.
		  실질적 사용은 SPEC. 을 구현한 구현체 (하위 객체) 를 사용
*/

class BusCharge
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

} // end of class


// charge() 를 정의한 interface
//==> 기능의 정의 (기능만 도출하여 정의한다면..) : 지하철, 항공, 택시 요금 등에도 사용 가능
interface Fee{

	public void charge();

} // end of class



//==> interface 구성 시 abstract method 필히 재정의 (OverRiding) 해야함. <====== 강제성
class Student extends BusCharge implements Fee
{
	public Student(){
		super("학생");
	}
	
	// 주석처리 후 컴파일 시 에러 확인
	public void charge(){
		System.out.println("300원");
	}
} // end of class


//==> interface 구성 시 abstract method 필히 재정의 (OverRiding) 해야함. <====== 강제성
class Adult extends BusCharge implements Fee
{
	public Adult(){
		super("일반인");
	}
	public void charge(){
		System.out.println("500원");
	}
	
} // end of class


//==> interface 구성 시 abstract method 필히 재정의 (OverRiding) 해야함. <====== 강제성
class Old extends BusCharge implements Fee
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
		

		// 구현 1 : 아래의 구현은 문제없이 출력된다.

		Student bc1 = new Student();
		Adult bc2 = new Adult();
		Old bc3 = new Old();

		bc1.information();
		System.out.println(bc1.section);
		bc1.charge(); 
		
		bc2.information();
		System.out.println(bc2.section);
		bc2.charge(); 

		bc3.information();
		System.out.println(bc3.section);
		bc3.charge(); 


		
		// 구현 2 : 아래의 구현에서 문제발생 : 컴파일시 에러
		// 1. 문제가 발생한 이유
		// 2. 문제를 해결하여 출력이 될 수 있도록 구현을 수정할 것
		// ==> 힌트 CastingComplete.java 의 세번째를 이해하자 / casting 연산자를 사용한 이유는??

		Fee[] fee = new Fee[3];
		fee[0] = new Student();
		fee[1] = new Adult();
		fee[2] = new Old();

		for (int i = 0; i < fee.length ; i++)
		{

			fee[i].information();
			System.out.print(fee[i].section);
			fee[i].charge();

		} // end of for

	} // end of main

} // end of class
