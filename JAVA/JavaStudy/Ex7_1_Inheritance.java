package JavaStudy;

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
        SmartTv stv = new SmartTv(); // 인스턴스 초기화

        stv.channel =10;             // channel 10 설정
        stv.channelUp();             // 채널 올리는 메서드
        System.out.println(stv.channel);

        stv.caption = true;          // caption on
        stv.displayCaption("Hello, World");
    }
}