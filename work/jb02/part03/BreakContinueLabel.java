//package jb02.part03;

/*
 * FieName : BreakContinueLabel.java
 *  	1. break  ==> 자신이 속한 반복문은 종료
 *  	2.  continue ==> continue 이후  실행문을 중단 , 다시 반복문 실행
 * 		3. break / continue 는 자신을 포함한 반복문만 적용.
 *          중첩 반복문일 경우는 label 을 사용하여 특정 반복문에 적용될수 있다.
 */
public class BreakContinueLabel {
	
	///main Method
	public static void main(String[] args) {
		
		System.out.println("\n\n=====<<<<<1. 중접 for 문 >>>>> =====");
		for(int i=1; i<5; i++){
			System.out.println("\n=>"+i+"단을 출력합니다.");
			for (int j = 1; j<10; j++){
				System.out.println( "\t"+i+" * "+j+" = "+i*j);
			}//end of innerFor
		}//end of outterFor
		
		System.out.println("\n\n=====<<<<<2. 중접 for 문 / break 사용 >>>>> =====");
		for(int i=1; i<5; i++){
			System.out.println("\n=>"+i+"단을 출력합니다.");
			for (int j = 1; j<10; j++){
				if ( i % 2 == 0) { //==> 짝수라면....
					break; //==> 자신을 포함한 반복문 종료
				} 
				System.out.println( "\t"+i+" * "+j+" = "+i*j);
			}//end of innerFor
		}//end of outterFor
		
		System.out.println("\n\n=====<<<<<3. 중접 for 문 / break / label사용 >>>>> =====");
		outerFor01: for(int i=1; i<5; i++){
			System.out.println("\n=>"+i+"단을 출력합니다.");
			for (int j = 1; j<10; j++){
				if ( i % 2 == 0) { //==> 짝수라면..
					break outerFor01; //==> outerFor01 까지  반복문 종료
				} 
				System.out.println( "\t"+i+" * "+j+" = "+i*j);
			}//end of innerFor
		}//end of outterFor
		
		System.out.println("\n\n=====<<<<<4. 중접 for 문 / continue  >>>>> =====");
		for(int i=1; i<5; i++){
			System.out.println("\n=>"+i+"단을 출력합니다.");
			for (int j = 1; j<10; j++){
				if ( j % 2 == 0) { //==> 짝수라면..
					continue ; //==> 하부수횅 중지 
				} 
				System.out.println( "\t"+i+" * "+j+" = "+i*j);
			}//end of innerFor
		}//end of outterFor
		
		System.out.println("\n\n=====<<<<<5. 중접 for 문 / break / label사용 >>>>> =====");
		outerFor02: for(int i=1; i<5; i++){
			System.out.println("\n=>"+i+"단을 출력합니다.");
			for (int j = 1; j<10; j++){
				if ( j % 2 == 0) { //==> 짝수라면..
					continue outerFor02; //==> outerFor02 까지  
				} 
				System.out.println( "\t"+i+" * "+j+" = "+i*j);
			}//end of innerFor
		}//end of outterFor
		
	}// end of main
}//end of class