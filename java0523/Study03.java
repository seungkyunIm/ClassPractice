package java0523;

import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스를 이용하여 반복문를 멈추기
 *********************************/

public class Study03 {

	public static void main(String[] args) {

		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		
		/** 객체 사용 **/
		System.out.println("멈추는 값을 입력해 주세요.");

		
		while(true)
		{
			String key = sc.nextLine();
			if("STOP".equals(key)) {
				System.out.println("STOP을 입력하였습니다.");
				break;
			}else {
			}
		}
		
		
		/** 객체 제거 **/
		sc.close();
		
	}

}
