package JavaStudy;

public class Ex4_15_WhileBasic {
    public static void main(String[] args) {
        int i = 5; // 반복 횟수를 넣는다.

        while (i-- != 0) { // Postfix 니 먼저 참조 후 실행
            System.out.println(i + " - Just do it.");
        }
    }
}
