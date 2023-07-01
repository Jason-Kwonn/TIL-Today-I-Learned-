package Practices.Day01.Example01;
import java.util.Scanner;

/*
[4] : 숫자를 입력받아 (1~100) 90이상 수, 80점 이상 우, 70점 이상 미, 60점 이상 양
      그 이하는 가를 출력하기
      (입력한 값이 0~100 이어야 한다. 그 이상 그 이하일 경우 어떻게 처리할 것인가)
        FileName : Example1.java

        실행 예 > java Example1 95
        ==> 실행결과 (출력결과..)
        입력하신 값 95점은 수입니다.
 */

public class Example01 {
    public static void main(String[] args) {
        Scanner hundredScanner = new Scanner(System.in);
        int zeroToHundred = hundredScanner.nextInt();
        System.out.println("입력하신 값 " + zeroToHundred+"점은 " + checkKoreanScore(zeroToHundred) + "입니다.");

        hundredScanner.close();
    }

    static String checkKoreanScore(int zeroToHundred) {
        if (zeroToHundred <= 100 && zeroToHundred >= 0) {
            if (zeroToHundred > 90) {
                return "수";
            } else if (zeroToHundred > 80) {
                return "우";
            } else if (zeroToHundred > 70) {
                return "미";
            } else if (zeroToHundred > 60) {
                return "양";
            } else return "가";
        } else return "채점할 수 없는 값";
    }
}
