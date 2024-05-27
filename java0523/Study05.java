package java0523;

import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스와 반복문를 이용하여 계산기 만들기
 *********************************/

public class Study05 {

	public static void main(String[] args) {

		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		
		/** 객체 사용 **/

		
		while(true) {
//				System.out.println(배열[i]);
				System.out.println("첫 번째 값을 입력해주세요.");
				int a = sc.nextInt();
				System.out.println("두 번째 값을 입력해주세요.");
				int b = sc.nextInt();

				System.out.println("연산을 선택해 주세요 1.더하기,2.빼기,3.곱하기,4.나누기");
				int c = sc.nextInt();
				int d;
				if(c==1){
					d = a+b;
					System.out.println("두 숫자 "+a+" , "+b+" 의 더하기 값은"+d+"입니다.");
				}else if(c==2) {
					d = a-b;
					System.out.println("두 숫자 "+a+" , "+b+" 의 빼기 값은"+d+"입니다.");
				}else if(c==3) {
					d = a*b;
					System.out.println("두 숫자 "+a+" , "+b+" 의 곱하기 값은"+d+"입니다.");
				}else if(c==4) {
					d = a/b;
					System.out.println("두 숫자 "+a+" , "+b+" 의 나누기 값은"+d+"입니다.");
				}else {
					System.out.println("다시 돌아가세요");
				}
				
			}


		/** 객체 제거 **/
//		sc.close();
		
	}

}
