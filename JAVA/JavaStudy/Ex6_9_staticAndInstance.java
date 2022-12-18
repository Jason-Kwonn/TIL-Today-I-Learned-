package JavaStudy;

class myMath {
    long a, b;

    long add() { // 인스턴스 메서드
        return a + b;
    }

    static long add(long a, long b) { // 클래스메서드 (static method)
        return a + b;
    }
}

public class Ex6_9_staticAndInstance {
    public static void main(String[] args) {
        System.out.println(myMath.add(500L, 1000L)); // call static method
        myMath mm = new myMath();
        mm.a = 300L;
        mm.b = 200L;
        System.out.println(mm.add()); // call instance method
    }
}

// 개별 속성은 인스턴스 메서드, 공통 속성은 static 메서드를 사용한다.
// iv 를 쓰는 메서드는 인스턴스 메서드, iv 를 안쓰면 static 을 붙인다.

class testClass {
    int iv;
    static int cv;

    void instanceMethod() { // 인스턴스 메서드
        System.out.println(iv); // 인스턴스 변수를 호출할 수 있다.
        System.out.println(cv); // static 변수를 호출할 수 있다.
    }

    static void staticMethod() {
//        System.out.println(iv); // 에러!! 인스턴스 변수를 호출 할 수 없다.
        System.out.println(cv); // static 변수를 호출할 수 있다.
    }
}