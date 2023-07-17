package JavaStudy.javajungsuk;

class Point1 extends Object { // 2차원 좌표
    int x;
    int y;

    String getLocation() {
        return "x :" + x + ", y :" + y;
    }

    Point1() {}

    Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Object 클래스의 toString() 을 오버라이딩
    public String toString() {
        return "x :" + x + ", y :" + y;
    }
}

class Point3D extends Point1 {
    int z;

    Point3D(int x, int y, int z) { // 11번 줄의 Point1 기본 생성자로 정의
        this.x = x;
        this.y = y;
        this.z = z;
    }
    String getLocation() { // 오버라이딩: 조상의 메서드를 입맛에 맞게 덮어쓰는 것 (Overwrite)
        // 구현부{} 내의 내용 오버라이딩 가능, 선언부 내용은 오버라이딩 불가
        return "x :" + x + ", y :" + y + ", z :" + z;
    }
}

public class Ex7_3_Overriding {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(2, 4, 6);
//        p3.x = 2; 27번 줄 생성자를 추가하여, 별도 변수 초기화를 안해도 됨
//        p3.y = 4;
//        p3.z = 6;
        System.out.println("p3.getLocation() = " + p3.getLocation());

        Point1 point1 = new Point1(1, 2);
        System.out.println(point1);
        // System.out.println(point1.toString()); 에서 toString 생략
    }

}

/* 오버라이딩의 조건
1. 선언부가 조상 클래스의 메서드와 일치해야 한다. Ex. getLocation()
2. 접근 제어자{public, protected, (default) private} 를 조상 클래스의 메서드 보다 좁은 범의로 변경할 수 없다.
3. 예외 (Exception) 는 조상 클래스의 메서드 보다 많이 선언할 수 없다.
 */

/* 오버라이딩 조건 3번 예시
class Parent {
    void parentMethod() throws IOException, SQLException {
        ...
    }
}

class Child extends Parent {
    void parentMethod() throws IOException {
        ...
    }
    ...
}
 */