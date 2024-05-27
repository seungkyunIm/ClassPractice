package java0523;

import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스를 이용하여 설문조사 하기
 *********************************/

public class Study04_1 {

	public static void main(String[] args) {

		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		
		/** 객체 사용 **/
		String q1 = "1.당신의 나이는 적어주세요";
		String q2 = "2.당신의 혈액형을 입력해주세요";
		String q3 = "3.당신의 MBTI의 첫번째를 적어주세요";
		String q4 = "4.당신의 MBTI의 두번째를 적어주세요";
		String q5 = "5.당신의 MBTI의 세번째를 적어주세요";
		String q6 = "6.당신의 MBTI의 네번째를 적어주세요";
		String q7 = "7.당신의 주소를 적어주세요";
		String q8 = "8.당신의 학교를 적어주세요";
		String q9 = "9.당신의 취미를 적어주세요";
		String q10 = "10.당신의 직업을 적어주세요";
		
//		String[] 배열 = new String[] {q1,q2,q3,q4,q5,q6,q7,q8,q9,q10};
//		
//		for(int i = 0; i < 배열.length; i++){
//			System.out.println(배열[i]);
//			System.out.println(sc.nextLine());
//		}
		
		String[][] 배열2 = new String[][] {{q1,""},{q2,""},{q3,""},{q4,""},{q5,""},{q6,""},{q7,""},{q8,""},{q9,""},{q10,""}};
		
		for(int i = 0; i < 배열2.length; i++) {
			System.out.println(배열2[i][0]);
			String 답변 = sc.nextLine();
			배열2[i][1] = 답변;
		}
		
		for(int i = 0; i < 배열2.length; i++) {
			System.out.println(배열2[i][0]);
			System.out.println("당신의 " +배열2[i][1]+"입니다.");
		}
		
		
		/** 객체 제거 **/
		sc.close();
		
	}

}
