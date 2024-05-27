package java0523;

import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스와 반복문를 이용하여 계산기 만들기
 *********************************/

public class Study05_1 {

	public static void main(String[] args) {

		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		
		/** 객체 사용 **/
		while(true) {
		String 더하기 = "+";
		String 빼기 = "-";
		String 나누기 = "/";
		String 곱하기 = "*";

		System.out.println("첫번째 숫자를 입력하세요.");
		int a = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int c = sc.nextInt();

		System.out.println("사칙연산을 선택하세요");
		int b = sc.nextInt();
		String d = "";
		switch(b) {
			case 1:
				d = a +" "+ 더하기+" "+ + c + " = " + (a+c);
				break;
			case 2:
				d = a +" "+ 빼기+" " + c + " = " + (a-c);
				break;
			case 3:
				d = a +" "+ 나누기+" " + c + " = " + (a/c);
				break;
			case 4:
				d = a +" "+ 곱하기+" " + c + " = " + (a*c);	
				break;
			default:break;
		}
		System.out.println(d);
		}
		
		/** 객체 제거 **/
//		sc.close();
		
	}

}