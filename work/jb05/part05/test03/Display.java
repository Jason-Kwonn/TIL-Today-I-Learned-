//package jb05.part05.test03;

/*
	FileName : Display.java
	1. BusCharge.class �� charge() Method ���������?
	2. ����Ŭ���� (Student, Adult, Old) ���� charge() method �� OverRiding �ʴ´ٸ�?

	////////////////////////////////////////////////////////////////////////////////

	==> abstract method / abstract class �� �ʿ伺 �� ����

		abstract method
		: ��ü���� �ʿ� ���� method
		: �������� ��ü�� ������ �ϴ� �������� ���� method

		abstract class
		: ��ü���� �ʿ� ���� method �� ���ǵ� Ŭ����
		: �Ϲ�ȭ ������ ������, �Ϲ��� ������ �Ӽ��� ���� �������� ���ǵ� Ŭ����

*/

abstract class BusCharge
{
	//Field
	String section;

	//Constructor
	public BusCharge(){
	}

	public BusCharge(String section){
		this.section = section;
	}

	// method
	public void information() {
		System.out.println("������ݾȳ�");
	}


//==>	������ ������, ����Ŭ������ Over Riding �� �����ϴ� �߻�޼��� ����
//	public void charge(){
//		System.out.println("�л� : 300, �Ϲ��� : 500, ��� : ��¥");
//	}
	

	public abstract void charge();

	
} // end of class



//==> abstract class ��� �� abstract method ���� ������ (OverRiding) �ؾ���. <====== ������
class Student extends BusCharge
{
	public Student(){
		super("�л�");
	}
	
	//=======> �Ʒ� method �ּ�ó�� �ϰ� ������ ���� Ȯ��
	public void charge(){
		System.out.println("300��");
	}
} // end of class


//==> abstract class ��� �� abstract method ���� ������ (OverRiding) �ؾ���. <====== ������
class Adult extends BusCharge
{
	public Adult(){
		super("�Ϲ���");
	}
	public void charge(){
		System.out.println("500��");
	}
	
} // end of class


//==> abstract class ��� �� abstract method ���� ������ (OverRiding) �ؾ���. <====== ������
class Old extends BusCharge
{
	public Old(){
		super("���");
	}

	public void charge(){
		System.out.println("��¥");
	}
} // e o c


public class Display
{
	//main method
	public static void main(String[] args){
		

		// ���� ���۷����� ���� �ν��Ͻ��� ���� ���� (������ ����ȯ / ~ is a ~ Relation)

		Buscharge bc1 = new Student(); // Student b1 = new Student();
		Buscharge bc2 = new Adult(); // Adult b2 = new Adult();
		Buscharge bc3 = new Old(); // Old b3 = new Old();

		bc1.information();
		System.out.println(bc1.section);
		bc1.charge(); // � Ŭ������ Method ȣ��Ǿ����� Ȯ��
		
		bc2.information();
		System.out.println(bc2.section);
		bc2.charge(); // � Ŭ������ Method ȣ��Ǿ����� Ȯ��

		bc3.information();
		System.out.println(bc3.section);
		bc3.charge(); // � Ŭ������ Method ȣ��Ǿ����� Ȯ��

	} // end of main

} // end of class
