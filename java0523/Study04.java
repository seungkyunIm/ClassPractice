package java0523;

import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스를 이용하여 설문조사 하기
 *********************************/

public class Study04 {

	public static void main(String[] args) {

		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		
		/** 객체 사용 **/
		while(true)
		{
			System.out.println("1.당신의 나이를 적어주세요.");
			int age = sc.nextInt();
			int a;
			a = age;
			String x = sc.nextLine();
			
			System.out.println("2.당신의 혈액형을 입력해주세요.");
			String key = sc.nextLine();
			String blood = "";
			if("O".equals(key)) {
				blood = key;
//				System.out.println("O형으로 입력되었습니다.");
//				break;
			}else if("A".equals(key)) {
				blood = key;
//				System.out.println("A형으로 입력되었습니다.");
//				break;
			}else if("B".equals(key)) {
				blood = key;
//				System.out.println("B형으로 입력되었습니다.");
//				break;
			}else if("AB".equals(key)) {
				blood = key;
//				System.out.println("AB형으로 입력되었습니다.");
//				break;
			}else {
				System.out.println("혈액형이 아닙니다 다시 입력 해주세요.");
			}
		
			System.out.println("3.당신의 MBTI의 첫번째를 적어주세요. E 또는 I");
			String key2 = sc.nextLine();
			String ie = "";
			if("E".equals(key2)) {
				ie = key2;
			}else if("e".equals(key2)) {
				ie = key2;
			}else if("I".equals(key2)) {
				ie = key2;
			}else if("i".equals(key2)) {
				ie = key2;
			}else {
				System.out.println("다시 입력 해주세요.");
			}
		
			System.out.println("4.당신의 MBTI의 두번째를 적어주세요. N 또는 S ");
			String key3 = sc.nextLine();
			String ns = "";
			if("N".equals(key3)) {
				ns = key3;
			}else if("n".equals(key3)) {
				ns = key3;
			}else if("S".equals(key3)) {
				ns = key3;
			}else if("s".equals(key3)) {
				ns = key3;
			}else {
				System.out.println("다시 입력 해주세요.");
			}
			
			System.out.println("5.당신의 MBTI의 세번째를 적어주세요. F 또는 T");
			String key4 = sc.nextLine();
			String ft = "";
			if("F".equals(key4)) {
				ft = key4;
			}else if("f".equals(key4)) {
				ft = key4;
			}else if("T".equals(key4)) {
				ft = key4;
			}else if("t".equals(key4)) {
				ft = key4;
			}else {
				System.out.println("다시 입력 해주세요.");
			}

			System.out.println("6.당신의 MBTI의 네번째를 적어주세요. P 또는 J");
			String key5 = sc.nextLine();
			String pj = "";
			if("P".equals(key5)) {
				pj = key5;
			}else if("p".equals(key5)) {
				pj = key5;
			}else if("J".equals(key5)) {
				pj = key5;
			}else if("j".equals(key5)) {
				pj = key5;
			}else {
				System.out.println("다시 입력 해주세요.");
			}
		
		
			System.out.println("당신의 나이는" +a +"입니다."); 
			System.out.println("당신의 혈액형은" +blood +"입니다.");
			System.out.println("당신의 MBTI는"+ie+ns+ft+pj+"입니다.");
			break;
		}
		
		/** 객체 제거 **/
		sc.close();
		
	}
}

