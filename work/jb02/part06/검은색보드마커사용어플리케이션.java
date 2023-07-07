//package jb02.part06;

/*
	FileName : 검은색보드마커사용어플리케이션.java
	: Java Application class :  java 실행시 최초로 호출되는 main method 를 갖는다.
*/
public class  검은색보드마커사용어플리케이션{

	///상태/속성 정보 ==> Field

	///행위   ==> method
	
	///main method ==> 실행시 JVM에 최초로 호출되는 method
	public static void main(String[] args){
		
		///인스턴스를 사용하기 위해 class 를 memory 에 loading ( ==> new )
		검은색보드마카 검보 = new 검은색보드마카();

		///객체가 갖는 속성에 접근 ( ==> . 연산자)
		System.out.println("검보 : "+검보.이름);
		System.out.println("검보 : "+검보.잉크량);
		
		///객체가 갖는 행위에 접근 ( ==> . 연산자)
		if(검보.사용가능유무()){
			검보.사용하다();
		}

		///객체가 갖는 속성에 접근 ( ==> . 연산자)
		System.out.println("검보 : "+검보.잉크량);
		
	}//end of main

}//end of class