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
        SmartTv stv = new SmartTv();

        stv.channel =10;
        stv.channelUp();
        System.out.println(stv.channel);

        stv.caption = true;
        stv.displayCaption("Hello, World");
    }
}