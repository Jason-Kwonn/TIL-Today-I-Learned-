package JavaStudy;

/* 오버로딩 vs. 오버라이딩
오버로딩 = 기존에 없는 새로운 메서드를 정의하는 (new)
오버라이딩 = 상속받은 메서드의 내용을 변경하는 것 (change, modify)
 */
public class Ex7_4_OverloadingVSOverriding {
}

class Parent {
    void parentMethod() {
    }
}

class Child extends Parent {
    void parentMethod() { // 오버라이딩
    }
    void parentMethod(int i) { // 오버로딩
    }

    void childMethod() { // 메서드 정의
    }

    void childMethod(int i) { // 21번 줄 오버로딩
    }

//    void childMethod() { // 중복정의. 에러
//    }
}