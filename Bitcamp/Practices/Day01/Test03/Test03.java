package Practices.Day01.Test03;
import java.util.Scanner;

/*
[3] : 두 수를 입력받고 입력받은 수가 짝수, 홀수, 3의 배수를 판단하기
        FileName : Test03.java

        실행 예 > java Test03 10 15
        ==> 실행결과 (출력결과..)(알아서 출력할 것)
        입력하신 1번째 인자값 10은 짝수 이며 3의 배수가 아닙니다..
        입력하신 2번째 인자값 15는 홀수 이며 3의 배수입니다.
 */

public class Test03 {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        int numScan1 = numberScanner.nextInt();
        int numScan2 = numberScanner.nextInt();

        System.out.println("입력하신 1번째 인자값 " + numScan1 + "은(는) "+ checkOddEven(numScan1) + " 이며 " + isMul3(numScan1));
        System.out.println("입력하신 2번째 인자값 " + numScan2 + "은(는) "+ checkOddEven(numScan2) + " 이며 " + isMul3(numScan2));
        // 'n' 번째 인자값의 'n' 도 메서드로 구현할 수 있을 것 같으나 지금은 방법을 모르겠음.. (numScan1, 2 를 Array 화 하면 될지도)
    }

    static String checkOddEven(int numScan) {
        if (numScan % 2 == 1) {
            return "홀수";
        } else return "짝수";
    }

    static String isMul3(int numScan) {
        if (numScan % 3 == 0) {
            return "3의 배수입니다.";
        } else return "3의 배수가 아닙니다..";
    }
}
