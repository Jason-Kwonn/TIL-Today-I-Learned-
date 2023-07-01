package Practices;

/*
[1] : 이름과 전화번호를 입력하고 출력하는 예제
        FileName : Test1.java

        실행 예 > java Test1 홍길동 011-111-1111
        ==> 실행결과 (출력결과...)
        나의 이름은 "홍길동" 입니다.
        "홍길동" 씨의 [hp] 는 "011-111-1111" 입니다.
 */

import java.util.Scanner; // 스캐너 가져옴

public class Test1 {

    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in); // 이름 스캐너 객체 생성
        Scanner numberScanner = new Scanner(System.in); // 번호 스캐너 객체 생성

        String name = nameScanner.nextLine(); // 이름 스캐너를 name 변수에 저장 (다음 input 을 개행 해서 입력해야 함)
        String number = numberScanner.nextLine(); // 번호 스캐너를 number 변수에 저장 (다음 input 을 개행 해서 입력해야 함)

        System.out.println("나의 이름은 \"" + name + "\" 입니다.");
        System.out.println("\"" + name + "\" 씨의 [hp] 는 \"" + number + "\" 입니다.");

        nameScanner.close();
        numberScanner.close();
    }
}
