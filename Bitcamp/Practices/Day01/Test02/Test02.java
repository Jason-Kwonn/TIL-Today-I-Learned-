package Practices.Day01.Test02;
import java.util.Scanner;
/*
[2] : 두 수를 입력받고 두 수를 비교하여 더하기 / 빼기 예제
        첫번째 인수가 크면 빼고 / 적으면 더하기
        FileName : Test02.java
        실행 예 > java Test02 2 1
        ==> 실행 결과 (출력결과..)
        첫번째 인수 : 2, 두번째 인수 : 1. 2-1 = 1 입니다.

        실행 예 > java Test02 1 2
        ==> 실행 결과 (출력결과..)
        첫번째 인수 : 1, 두번째 인수 : 2, 2+1 = 3 입니다.
 */

public class Test02 {
    static String a;

    public static void main(String[] args) {
        Scanner calScanner = new Scanner(System.in); // 계산 스캐너 추가
        int calTest1 = calScanner.nextInt(); // 정수로 반환
        int calTest2 = calScanner.nextInt(); // 정수로 반환

        System.out.println("첫번째 인수 : " + calTest1 + ", 두번째 인수 : " + calTest2 + ", "
                + calTest1 + addSubMark(calTest1, calTest2) + calTest2 + " = " + addSubCal(calTest1, calTest2) + " 입니다.");

        calScanner.close(); // 스캐너 종료
    } // end of main

    static int addSubCal(int calTest1, int calTest2) {
        if (calTest1 > calTest2) {
            return calTest1 - calTest2;
        } else {
            return calTest1 + calTest2;
        }
    } // end of addSubCal method

    static String addSubMark(int x, int y) {
        if (x > y) {
            a = "-";
        } else {
            a = "+";
        }
        return a;
    } // end of addSubMark method
} // end of class