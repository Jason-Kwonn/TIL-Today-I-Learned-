package jb04.part06;

/*
	FileName : PackageTest01.java
	1.  rt.jar, src.zip, API  이해 , 활용
	2.  package , import  Keyword 의 이해
	3.  FQCN :: 완결한 클래스이름 :: package 를 포함한 className
*/
public class PackageTest01{
	
	/// Field
	String name = "홍길순";
	//java.lang.String add = "서울";

	/// Mainn Method
	public static void main(String[] args){
		String name = new String("홍길동");
		//java.lang.String job = new java.lang.String("의적");

		//A a = new A();

	}//end of main
}//end of class

/*
	1. A a = new A() ==> compile error 발생 이유는 ?
	
	2. String.class 즉 문자열을 추상화한 class
	    String 이 class 라면 현재폴더에 
	    String 이 있는가???  또한 compile error 발생하지 않는 이유는(A a = new A() 와 비교) ?
	    
	3. Java_Home\jre\lib\rt.jar  내부에 java\lang\String.class를 확인하고...
	
	5. Compiler 또는 JVM은 rt.jar내부의 String.class를 어떻게 인식하는가 ?
	    (classpath 의미를 다시 한번 확인)
	    
	6. classpath 의 의미를 이해한다면,  rt.jar내부의 java\lang\String.class를 어떻게 찾아가는가.
	    (==> package/import 을 이해할 것)
	    (==> java.lang.String job = new java.lang.String("의적")의 의미는 ???)
	    
	7. String.class 내부의 Field / Method 는 어떤것이 있는가...
	    ( Java_Home\src.jar  ==?  API 를 이해하자...)
*/