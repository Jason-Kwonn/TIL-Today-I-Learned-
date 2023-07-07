//package Practices.Day01.Test3;

/*
[3] : 두 수를 입력받고 입력받은 수가 짝수, 홀수, 3의 배수를 판단하기
        FileName : Test3.java

        실행 예 > java Test3 10 15
        ==> 실행결과 (출력결과..)(알아서 출력할 것)
        입력하신 1번째 인자값 10은 짝수 이며 3의 배수가 아닙니다..
        입력하신 2번째 인자값 15는 홀수 이며 3의 배수입니다.
 */

public class Test3 {
    public static void main(String[] args) {

		int numScan1 = Integer.parseInt(args[0]);
		int numScan2 = Integer.parseInt(args[1]);
		
		if (numScan1 % 2 == 1)
		{
			if (numScan1 % 3 == 0)
			{
				System.out.println("입력하신 1번째 인자값 " + numScan1 + "은(는) 홀수 이며 3의 배수 입니다.");
			} else {
				System.out.println("입력하신 1번째 인자값 " + numScan1 + "은(는) 홀수 이며 3의 배수가 아닙니다.");
			}
		} else {
			System.out.println("입력하신 1번째 인자값 " + numScan1 + "은(는) 짝수 이며 3의 배수가 아닙니다.");
		}

		if (numScan2 % 2 == 1)
		{
			if (numScan2 % 3 == 0)
			{
				System.out.println("입력하신 2번째 인자값 " + numScan2 + "은(는) 홀수 이며 3의 배수 입니다.");
			} else {
				System.out.println("입력하신 2번째 인자값 " + numScan2 + "은(는) 홀수 이며 3의 배수가 아닙니다.");
			}
		} else {
			System.out.println("입력하신 2번째 인자값 " + numScan2 + "은(는) 짝수 이며 3의 배수가 아닙니다.");
		}
    }
}
