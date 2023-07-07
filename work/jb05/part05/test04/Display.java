//package jb05.part05.test04;

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
	

	public abstract void charge();

	
} // end of class



//==> abstract class ��� �� abstract method ���� ������ (OverRiding) �ؾ���. <====== ������
class Student extends BusCharge
{
	public Student(){
		super("�л�");
	}
	
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
		// abstract class �� ��ü ���� �Ұ� �׷��� type ������ ????

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


		//==> �� �ڵ��� �Ʒ��� �ڵ��� ���ϸ�..
		//==> 1. �ݺ��� �κ��� ���°�
		//==> 2. ���� Data Type ����(Array) �� �̿��Ͽ� �ϰ������� ������ �� ���°�?
		
		BusCharge[] bc = new BusCharge[3];

		bc[0] = new Student();	// Buscharge bc1 = new Student(); // Student b1 = new Student();
		bc[1] = new Adult();	// Buscharge bc2 = new Adult(); // Adult b2 = new Adult();
		bc[2] = new Old();		// Buscharge bc3 = new Old(); // Old b3 = new Old();

		for (int i = 0; i < bc.length ; i++)
		{

			bc[i].information();
			System.out.print(bc[i].section);
			bc[i].charge();

		} // end of for

	} // end of main

} // end of class
