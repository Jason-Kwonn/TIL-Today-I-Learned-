package jb02.part06;

/*
	FileName :  보드마커사용어플리케이션..java
	: Java Application class :   java 실행시 최초로 호출되는 main method 를 갖는다.
*/
public class  보드마커사용어플리케이션{

	///상태/속성 정보 ==> Field

	///행위   ==> method
	
	///main method ==> 실행시 JVM에 최초로 호출되는 method
	public static void main(String[] args){
		
		///객체를 사용하기 위해 class 를 memory 에 loading ( ==> new )		
		보드마카 검보 = new 보드마카();
		
		//객체의 상태를 변경할수 있는 행위( setter method )를 통해 객체의 상태를 setting
		검보.set이름("검은색보드마카");
		검보.set칼라("검은색");
		검보.set잉크량(100);

		///객체가 갖는 속성에 접근 ( ==> . 연산자)		
		System.out.println("검보 : "+검보.이름);
		System.out.println("검보 : "+검보.잉크량);
		
		///객체가 갖는 행위에 접근 ( ==> . 연산자)
		if(검보.사용가능유무()){
			검보.사용하다();
		}

		///객체가 갖는 속성에 접근 ( ==> . 연산자)		
		System.out.println("검보 : "+검보.잉크량);

		//////////////////////////////////////////////////////////////////////////////////
		/*
		System.out.println("/////////////////////////////////////////////////////////////////");
		
		보드마카 청보 = new 보드마카();

		//객체의 상태를 변경할수 있는 행위( setter method )를 통해 객체의 상태를 setting
		청보.set이름("청색보드마카");
		청보.set칼라("청색");
		청보.set잉크량(100);

		System.out.println("청보 : "+청보.이름);
		System.out.println("청보 : "+청보.잉크량);
		*/

	}//end of main

}//end of class