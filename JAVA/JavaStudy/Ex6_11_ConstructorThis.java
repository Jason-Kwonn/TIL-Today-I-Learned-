package JavaStudy;

public class Ex6_11_ConstructorThis {

    public static void main(String[] args) {
        CarSpec carSpec1 = new CarSpec();
        CarSpec carSpec2 = new CarSpec("black", "manual", 2);
        System.out.println(carSpec1.color);
        System.out.println(carSpec2.gearType);
    }
}

class CarSpec {
    String color;
    String gearType;
    int door;

    CarSpec(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }

    CarSpec() {
        this("white", "auto", 4); // 코드 중복 없애기
        color = "white";
        gearType = "auto";
        door = 4;
    }
}