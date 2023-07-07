//package jb05.part06;

/*
	1. Primitive type : ����ȯ (������/�����) data �� ũ��
	2. Reference type : ����ȯ (������/�����) : ������ ũ�� (�߻�ȭ ����)
		: �߿�!!!!!! ��ü�� ����ȯ ���� : ~~ is a ~~ Relationship
*/

// ���� class Super ����
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
		System.out.println("overriding �� Sub : a()");
	}

	public void b(){
		System.out.println("Sub : b()");
	}

} // end of class



public class CastingComplete
{
	public static void main(String[] args) 
	{
		
		// 1. ���� class �ν��Ͻ� ���� (data type == �ν��Ͻ��� ���)
		System.out.println("\n����� Super s1 = new Super() �κ�");
		Super s1 = new Super();
		s1.a();


		// 2. ���� class �ν��Ͻ� ���� (data type == �ν��Ͻ��� ���)
		System.out.println("\n����� Sub s2 = new Sub() �κ�");
		Sub s2 = new Sub();
		s2.a();
		S2.b();


		// 3. ���� data type ���� ���� �ν��Ͻ� ���� (data type != �ν��Ͻ�)
		System.out.println("\n����� Super s3 = new Sub() �κ�");
		Super s3 = new Sub(); //<===== ������ ����ȯ
		s3.a();

		// �Ʒ��� error �߻�, s3 �� b() �� ������ �� ����. (�� ���� ��)
		// s3.b();
		// s3.a() �� ����Ϸ��� ==> casting ������ ��� (�� �ڽ��� ������ ����(?))

		System.out.println("\n s3 �� b() �� ���� �Ұ��ϴ�.");
		System.out.println("casting �����ڸ� �̿� Sub sub = (Sub) s3 ����� ����ȯ");
		Sub sub = (Sub) s3;
		sub.b();

		// 4. ���� data type ���� ���� �ν��Ͻ� ���� (data type != �ν��Ͻ�)
		// error �κ� (���� ���۷��� ������ ���� �ν��Ͻ��� ���۷��� �� �� ����)
		// Sub s4 = new Super();

	}
}
