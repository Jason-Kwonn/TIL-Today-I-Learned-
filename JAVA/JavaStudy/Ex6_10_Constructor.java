package JavaStudy;

public class Ex6_10_Constructor {

}

class Car1 {
    String color;    // 색상
    String gearType; // 변속기 종류 - auto(자동), manual(수동)
    int door;        // 문의 개수

    Car1(){} //기본 생성자

    Car1(String c, String g, int d) { // 매개변수가 있는 생성자
        color = c;
        gearType = g;
        door = d;

        Car1 car1 = new Car1("white", "auto", 4);
    }
/*
1. 참조변수 car1 생성 : Car1 c
2. new 연산자로 객체 생성 : new
3. 생성자 호출 Car1 (매개변수, 매개변수, Parameter)
4. 대입 : Car1 c = new Car(...);
 */
}