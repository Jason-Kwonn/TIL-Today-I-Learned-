package JavaStudy;

public class Ex7_6_AbstractClass {
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
        /* 지정된 위치로 이동 */
    }

    void stimPack() {
        /* 스팀팩을 사용한다. */
    }
}

class Tank extends Unit { // 탱크
    int x, y; // 현재 위치
    void move(int x, int y) {
        /* 지정된 위치로 이동 */
    }

    void changeMode() {
        /* 공격 모드로 전환한다. */
    }
}

class Dropship extends Unit { //수송선
    int x, y; // 현재 위치
    void move(int x, int y) {
        /* 지정된 위치로 이동 */
    }

    void load() {
        /* 선택된 대상을 태운다. */
    }

    void unload() {
        /* 선택된 대상을 내린다. */
    }
}