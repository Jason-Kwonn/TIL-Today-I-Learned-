package JavaStudy;

public interface Ex7_8_Fightable {
    void move(int x, int y);

    void attack(Unit u);
}

// 인터페이스 = 추상 메서드의 집합, 인터페이스의 추상메서드 몸통{} 만들(미완성 설계도 완성하기)

class Fighter implements Ex7_8_Fightable {
    public void move(int x, int y) {
        // 내용 생략
    }

    public void attack(Unit u) {
        // 내용 생략
    }
/*
추상클래스와 인터페이스의 공통점은? : 추상 메서드를 가지고 있다 (미완성 설계도)
추상클래스와 인터페이스의 차이점은? : 인터테이스는 iv 를 가지고 있다
 */

}