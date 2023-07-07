package jb04.part04;

/*
	FileName : OverRidingTest.java
	1. Method OverLoading 	
		: 1개의 class 에서 Method  활용 :: Polymorphism 
	2. Method OverRiding 
		: class 간  관계에서의 Method 활용 :: Polymorphism 
		: 공유 Method 재정의( 하위 class 용도에 맞도록...)
*/
class FatherGeneration{
  ///Field
  ///Constructor
  public FatherGeneration(){  
  }
  ///Method
  public void returnHomeTimeRule(){
    System.out.println("오후 10시 귀가");
  }
  public void getUpTime(){
    System.out.println("오전 6시기상");
  }
}//end of class


class SonGeneration extends FatherGeneration{
  ///Field
  ///Constructor
  public SonGeneration(){
  }
  ///Method
  //상속을 받으면서 상위에 구현된 method 를 재정의 ( Method OverRiding )
  public void returnHomeTimeRule(){
    System.out.println("자기가 알아서 책임진다.");
  }
}//end of class


public class OverRidingTest{
   ///Main Method
  public static void main(String[] args){
    SonGeneration sg = new SonGeneration();
   //==> 출력결과확인 ( 상위클래스의 Method 또는 하위클래스이 Method 인가...)
    sg.getUpTime();
    sg.returnHomeTimeRule();
  }//end of main
}//end of class