package jb02.part07.two;

/*  
 	FileName : 동물.java
	:: 사물/개념의 "속성,기능"의 Object Modeling 하여 java class 표현
	::  Bean /  POJO (Plain Old Java Object)
*/

//==> 독수리.class
class  독수리{

	///Field(Attribute)
	String 이름;
	String 이동방법;
	int 날개길이;
	
	///Method(behavior)
	public void 이동하다(){ 
		System.out.println( 이동방법 + "으로 이동함");
	}
	
	//기타 Method 생략
	
}//end of class


//==> 코끼리.class
class  코끼리{
	
	///Field(Attribute)
	String 이름;
	String 이동방법;
	int 귀크기;
	
	///Method(behavior)
	public void 이동하다(){
		System.out.println( 이동방법 + "으로 이동함");	
	}
	
	//기타 Method 생략
	
}//end of class


//==> 고래.class
class  고래{
	
	///Field(Attribute)
	String 이름;
	String 이동방법;
	int 지느러미크기;
	
	///Method(behavior)
	public void 이동하다(){
		System.out.println( 이동방법 + "으로 이동함");
	}
	
	//기타 Method 생략
	
}//end of class


//==> 동물.class 
public class  동물{
	
	///Field(Attribute)
	String 이름;
	String 이동방법;
	//int 날개길이;
	//int 귀크기;
	//int 지느러미크기;
	
	///Method(behavior)
	public void 이동하다(){
		System.out.println( 이동방법 + "으로 이동함");
	}
	
	//기타 Method 생략
	
}//end of class