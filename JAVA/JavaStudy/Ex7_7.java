package JavaStudy;

class Car2 {
    String color;
    int door;

    void drive() { // 운전 기능
        System.out.println("drive, Brr~");
    }

    void stop() { // 멈춤 기능
        System.out.println("stop!!");
    }
}

class FireEngine1 extends Car2 { // 소방차
    void water() { // 물 뿌리는 기능
        System.out.println("water!!");
    }
}

public class Ex7_7 {
    public static void main(String[] args) {
        Car2 car2 = null;
        FireEngine1 fe1 = new FireEngine1();
        FireEngine1 fe2 = null; // 형변환 시에는 실제 인스턴스가 뭔지 중요

        fe1.water();
        car2 = fe1; // car2 = (Car2)fe1; 에서 형변환 생략됨
//        car2.water() // 에러. Car2 타입으로는 소방차 기능을 쓸 수 없음

        fe2 = (FireEngine1) car2; // 자손타입. 형변환 생략 불가
        fe2.water();
    }
}
