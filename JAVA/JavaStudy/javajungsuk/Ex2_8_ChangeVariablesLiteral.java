package JavaStudy.javajungsuk;

public class Ex2_8_ChangeVariablesLiteral {
    public static void main(String[] args) {
        int x = 10, y = 5; // 변수 선언을 한 줄로
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int tmp = x; // 1. x 값을 tmp 에 저장
        x = y;       // 2. y 값을 x 에 저장
        y = tmp;     // 3. tmp 값을 y 에 저장
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
