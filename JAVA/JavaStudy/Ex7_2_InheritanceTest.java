package JavaStudy;

class MyPoint extends Object{
    // 부모가 없는 모든 클래스는 Object 클래스를 자동으로 상속받도록 컴파일러가 자동 추가해 줌.
    int x;
    int y;
}

//class Circle extends MyPoint { // 상속
//    int r;
//}

class Circle {
    MyPoint p = new MyPoint();
    int r;
}

public class Ex7_2_InheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        Circle c2 = new Circle();
        c.p.x = 1; // Circle c 에서 MyPoint p 의 x 값을 1로 저장한다.
        c.p.y = 2;
        c.r = 3;
        System.out.println("c.p.x = " + c.p.x);
        System.out.println("c.p.y = " + c.p.y);
        System.out.println("c.r = " + c.r);
        System.out.println(c.toString()); // toString 메서드로 Circle c 의 주소값을 보여줌 Circle@35bbe5e8
        System.out.println(c); // 위의 주소와 같아서, 참조변수만 넣어주는게 간편함 Circle@35bbe5e8
        System.out.println(c2.toString()); //Circle@2c8d66b2

    }
}
