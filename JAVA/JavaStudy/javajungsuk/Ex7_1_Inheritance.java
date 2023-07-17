package JavaStudy.javajungsuk;

class Tv {
    boolean power; //전원상태(on/off)
    int channel; // 채널

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

// 상속은 사용에 제약이 있을 수 있으니 꼭 필요할 때 쓴다.
// SmartTv is a Tv (상속), Tv has a SmartTv (포함)
class SmartTv extends Tv {
    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

public class Ex7_1_Inheritance {
    public static void main(String[] args) {
        Tv t = new SmartTv(); // 인스턴스 초기화, 다형성
        // 다형성의 기능 : 자손이 조상의 참조 변수를 사용하면, 조상의 메서드만 사용 가능

        t.channel =10;             // channel 10 설정
        t.channelUp();             // 채널 올리는 메서드
        System.out.println(t.channel);

//        t.caption = true;          // caption on
//        t.displayCaption("Hello, World");
        // 에러, 자손의 메서드는 사용 불가
    }
}