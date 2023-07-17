package JavaStudy.javajungsuk;

class A {
//    public void method(B b) {// 직접 B 에 의존하면, C에 의존할 시 코드 변경 필요 }
    public void method(I i) { // 인터페이스 I 를 구현한 애들만 들어와라
        i.method();
    }

}

// B 클래스의 선언과 구현을 분리
interface I {
    void method();
    }

class B implements I {
    public void method() {
        System.out.println("B 클래스의 메서드");
    }
}

class C implements I {
    public void method() {
        System.out.println("C 클래스의 메서드");
    }
}


public class Ex7_9_InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new C());    // A가 C를 사용(의존)
    }
}
