package JavaStudy.javajungsuk;

public class Ex4_17_WhileSumInput {
    public static void main(String[] args) {
        int num = 12345, sum = 0;

        // 10으로 나눈 나머지 값( 맨 오른쪽 자리 값을 차례로 더한다.
        // num = 12345, 1234, 123, 12, 1
        while(num>0){
            sum += num % 10;
            System.out.println("sum = " + sum + ", num % 10 = " + num);
            num = num / 10;
        }

        System.out.println("각 자리수의 합: " + sum);
    }
}
