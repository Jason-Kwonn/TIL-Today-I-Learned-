package jb04.part06;

/*
	FileName : PackageTest02.java
	1. 사용자 정의 package 의 사용
	2. javac -d . PackageTest02.java              <== 컴파일시 -d 옵션의 사용
	3. java jp05.part02.PackageTest02          <== package 사용 Application 의 실행방법
	                                                                               ( classpath 를 다시한번 이해하자. )
*/
public class PackageTest02{
	
	///Field
	String str1 = "홍길순";

	///main Method
	public static void main(String[] args){
		PackageTest02 pt = new PackageTest02();
		System.out.println(pt.str1);
	}//end of main

}//end of class

/*
	1. package : 같은 특징과 특성를 갖는 class 묶음
*/