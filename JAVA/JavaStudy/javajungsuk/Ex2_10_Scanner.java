package JavaStudy.javajungsuk;

import java.util.Scanner;

public class Ex2_10_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 를 사용하기 위해 추가

        System.out.print("두 자리 정수를 입력해 주세요>");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input); // 입력 받은 문자열을 숫자로 변환

        System.out.println("입력 내용 : " + input);
        System.out.printf("num=%d%n", num);
    }
}
