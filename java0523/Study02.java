package java0523;

import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스를 이용하여 간단한 연산하기
 *********************************/

public class Study02 {

	public static void main(String[] args) {

		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		
		/** 객체 사용 **/
		System.out.println("두 값을 넣어주세요.");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		
		/** 객체 제거 **/
		sc.close();
		
	}

}
