package JavaStudy;

class AAA { // AAA 는 BBB 의 외부 클래스
    int i = 100;
    BBB b = new BBB();
    class BBB { // BBB 는 AAA 의 내부 클래스
        void method() {
//            AAA a = new AAA();
//            System.out.println(a.i);
            System.out.println(i); // 객체생성 없이 외부 클래스의 멤버 접근 가능
        }
    }
}

//class CCC {
//    BBB b = new BBB();
//}


public class Ex7_10_InnerClassTest {
    public static void main(String[] args) {
//        BBB b = new BBB();
//        b.method();
    }
}
