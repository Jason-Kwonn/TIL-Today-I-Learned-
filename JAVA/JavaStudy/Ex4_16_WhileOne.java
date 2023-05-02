package JavaStudy;

public class Ex4_16_WhileOne {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        // i 를 1 증가시켜 sum 에 계속 더한다.
        while (sum <= 100) {
            System.out.printf("%d -> %d%n", i, sum);
            sum += ++i;
        }
    }
}
