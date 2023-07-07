//package jb04.part03;

/*
	FileName : Human01.java
	1. 상속(일반화관계)과 생성자와의 관계
	2. 생성자를 명시적으로 호출하는 this(), super() method 
*/
public class Human01{
	///Field	
	String name;

	///Constructor
	public Human01(){
		System.out.println("Human class default Constructor");
	}
	public Human01(String str){
		System.out.println("Human class의 String 인자를 받는 Constructor");
		name = str;
	}
}//end of class