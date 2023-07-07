package jb02.part06;

/*
	FileName : 보드마카.java
	:  현실세계(Real World)의 물리적 사물(객체)을 "속성,기능"을 Java 의 class 로 표현
	:  ==> 비슷한 객체(검은색,청객,빨강색 보더마커등.. )를 일반적,공통적 특성,행위를
	    ==> 갖는 객체의 모임를 클래스로 표현  
 	:  Bean /  POJO (Plain Old Java Object)
*/
public class  보드마카{
	
	///상태/속성 정보==>Field 
	String 이름;
	String 칼라;
	int 잉크량;

	///행위 ==> method
	public void 사용하다(){
		잉크량--;
	}
	public boolean 사용가능유무(){
		if (잉크량 == 0){
			return false;
		}else{
			return true;
		}
	}
	
	///setter method
	public void set이름(String 이름)		{
		this.이름 = 이름;
	}
	public void set칼라(String 칼라)		{
		this.칼라 = 칼라;
	}
	public void set잉크량(int 잉크량)	{
		this.잉크량 = 잉크량;
	}

}//end of class