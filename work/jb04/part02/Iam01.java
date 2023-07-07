//package jb04.part03;

/*
	FileName : Iam01.java
	1. 상속(일반화관계)과 생성자와의 관계
	2. 생성자를 명시적으로 호출하는 this(), super() method 이해
*/
public class Iam01 extends Human01{
	
	///Field
	String job;
	
	///Constructor
	public Iam01(){
		super("");
        System.out.println("Iam class default Constructor");
	}
	public Iam01(String str){
		this();
		System.out.println("Iam class의 String 인자를 받는 Constructor");
		job = str;
	}
  
	///main method
	public static void main(String args[]){
		Iam01 iam = new Iam01("");
  }//end of main
}//end of class

/*
	1. 개발자가 생성자를 1개라도 만들면 생성자는 개발자 책임
		ㅇ Human01()를 주석처리하고 compile
		   ==> default 생성자를 항상 만들어 주는 습관을 들이자.
		
		2. 생성자를 명시적으로 호출 할 수 있는 method 
			ㅇ this() ==> 자신의 default 생성자 명시적으로 호출
			ㅇ super() ==>상위의 default 생성자 명시적 호출

			this(1) ==> 자신의 생성자중 int 인자값을 1개 받는 생성자 명시적 호출
			super(1) ==> 상위의 생성자중 int 인자값을 1개 받는 생성자 명시적 호출

		3. 내부적으로 생성자의 1번째 line  super()가 생략되어 있는 구조이다.
			public Iam1(){
				//super() <==생략된구조
			}
		
		4. 생성자를 호출하는 super(), this()의 규칙
			ㅇ 생성자내부에서 만 , 1번째 line 에 만 기술 할 수 있으며.
			ㅇ 1번만 사용 할 수 있다.
*/