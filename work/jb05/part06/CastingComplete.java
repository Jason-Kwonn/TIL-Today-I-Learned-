//package jb05.part06;

/*
	1. Primitive type : 형변환 (묵시적/명시적) data 의 크기
	2. Reference type : 형변환 (묵시적/명시적) : 개념의 크기 (추상화 정도)
		: 중요!!!!!! 객체의 형변환 조건 : ~~ is a ~~ Relationship
*/

// 상위 class Super 정의
class Super
{

	// method
	public void a(){
		System.out.println("Super : a()");
	}

} // end of class


class Sub extends Super
{

	public void a(){
		System.out.println("overriding 된 Sub : a()");
	}

	public void b(){
		System.out.println("Sub : b()");
	}

} // end of class



public class CastingComplete
{
	public static void main(String[] args) 
	{
		
		// 1. 상위 class 인스턴스 생성 (data type == 인스턴스의 경우)
		System.out.println("\n여기는 Super s1 = new Super() 부분");
		Super s1 = new Super();
		s1.a();


		// 2. 하위 class 인스턴스 생성 (data type == 인스턴스의 경우)
		System.out.println("\n여기는 Sub s2 = new Sub() 부분");
		Sub s2 = new Sub();
		s2.a();
		S2.b();


		// 3. 상위 data type 으로 하위 인스턴스 생성 (data type != 인스턴스)
		System.out.println("\n여기는 Super s3 = new Sub() 부분");
		Super s3 = new Sub(); //<===== 묵시적 형변환
		s3.a();

		// 아래는 error 발생, s3 는 b() 를 참조할 수 없다. (꼭 이해 필)
		// s3.b();
		// s3.a() 를 사용하려면 ==> casting 연산자 사용 (즉 자신의 원상태 복귀(?))

		System.out.println("\n s3 는 b() 에 접근 불가하다.");
		System.out.println("casting 연산자를 이용 Sub sub = (Sub) s3 명시적 형변환");
		Sub sub = (Sub) s3;
		sub.b();

		// 4. 하위 data type 으로 상위 인스턴스 생성 (data type != 인스턴스)
		// error 부분 (하위 레퍼런스 변수는 상위 인스턴스를 레퍼런스 할 수 없다)
		// Sub s4 = new Super();

	}
}
