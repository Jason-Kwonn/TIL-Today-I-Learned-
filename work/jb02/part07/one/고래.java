package jb02.part07.one;

/*  
	FileName : 고래.java
	:: 사물/개념의 "속성,기능"의 Object Modeling 하여 java class 표현
	::  Bean /  POJO (Plain Old Java Object)
*/
public class 고래 {
	
	///Field(Attribute)
	String 이름;
	String 이동방법;
	int 지느러미크기;
	
	///Method(behavior)
	public void 이동하다(){
		System.out.println( 이동방법 + "으로 이동함");
	}
	
	//기타 Method 생략
}
