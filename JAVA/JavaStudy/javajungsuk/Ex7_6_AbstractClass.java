package JavaStudy.javajungsuk;

public class Ex7_6_AbstractClass {
    public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new Dropship()};
//        Unit[] group = new Unit[3]; // 위 1줄과 같은 코드 (객체 = 참조변수의 배열)
//        Object 에는 move 가 없어서 Object 로는 생성 불가
//        group[0] = new Marine();
//        group[1] = new Tank();
//        group[2] = new Dropship();


        for (int i = 0; i < group.length; i++)
            group[i].move(100, 200);
        // group 의 타입은 Unit[], group[0], group[1], group[2] 의 타입은 Unit
//        group[0].move(100, 200); // Marine 객체의 move(100, 200) 을 호출
//        group[1].move(100, 200); // Tank 객체의 move(100, 200) 을 호출
//        group[2].move(100, 200); // Dropship 객체의 move(100, 200) 을 호출
    }
}

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        /* 현재 위치에 정지 */
    }
}
// 선언부는 일치, 구현부는 불일치 할 수 있음

class Marine extends Unit { //보병
    int x, y; // 현재 위치
    void move(int x, int y) {
        System.out.println("Marine[x = " + x + ",y = " + y + "]");
        /* 지정된 위치로 이동 */
    }

    void stimPack() {
        /* 스팀팩을 사용한다. */
    }
}

class Tank extends Unit { // 탱크
    int x, y; // 현재 위치
    void move(int x, int y) {
        System.out.println("Tank[x = " + x + ",y = " + y + "]");
        /* 지정된 위치로 이동 */
    }

    void changeMode() {
        /* 공격 모드로 전환한다. */
    }
}

class Dropship extends Unit { //수송선
    int x, y; // 현재 위치
    void move(int x, int y) {
        System.out.println("Dropship[x = " + x + ",y = " + y + "]");
        /* 지정된 위치로 이동 */
    }

    void load() {
        /* 선택된 대상을 태운다. */
    }

    void unload() {
        /* 선택된 대상을 내린다. */
    }
}