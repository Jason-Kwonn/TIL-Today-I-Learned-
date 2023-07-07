package jb02.part07.three;

/*  
	FileName : 동물.java
	:: 사물/개념의 "속성,기능"의 Object Modeling 하여 java class 표현
	::  Bean /  POJO (Plain Old Java Object)
*/

// 동물.class: 추상화 / 일반화 수준이 높은,  다른 class 의 상속등으로 사용.
public class  동물{
	
	///Field(Attribute)
	String 이름;
	String 이동방법;
	//int 날개길이;
	//int 귀크기;
	//int 지느러미크기;
	
	///Method(behavior)
	public void 이동하다() {
		System.out.println( 이동방법 + "으로 이동함");
	}

	//기타 Method 생략

}//end of class


//==> 독수리.class : 동물.class 를 상속(공유)받아 독수리 class 모델링
class  독수리 extends 동물{
	
	///Field(Attribute)
	//String 이름;
	//String 이동방법;
	int 날개길이;
	
	///Method(behavior)
	//public void 이동하다(){
	//	System.out.println( 이동방법 + "으로 이동함");
	//}
	
	//기타 Method 생략

	}//end of class


//==> 코끼리.class : 동물.class 를 상속(공유)받아 코끼리 class 모델링
class  코끼리 extends 동물{
	
	///Field(Attribute)
	//String 이름;
	//String 이동방법;
	int 귀크기;
	
	///Method(behavior)
	//public void 이동하다(){
	//	System.out.println( 이동방법 + "으로 이동함");
	//}
	
	//기타 Method 생략

}//end of class


//==> 고래.class :동물.class 를 상속(공유)받아 고래 class 모델링
class  고래 extends 동물{
	
	///Field(Attribute)
	//String 이름;
	//String 이동방법;
	int 지느러미크기;
	
	///Method(behavior)
	//public void 이동하다(){
	//	System.out.println( 이동방법 + "으로 이동함");
	//}
	
	//기타 Method 생략

}//end of class