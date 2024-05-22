package java0521;

public class Study06 {

	public static void main(String[] args) {
		
		/***********************************************
		 * 문제4) [4행 4열] 정수형 2차원 배열을 생성 후
		 *  인덱스 순서대로 1 ~ 16의 값을 넣고 출력 하시오.
		 * 출력 예시)
		 *  1,  2,  3,  4
		 *  5,  6,  7,  8
		 *  9, 10, 11, 12
		 * 13, 14, 15, 16
		 ************************************************/
		
		// 해결 코드 작성 시작
		int 배열[][] = new int[4][4];
		int a = 1;
		for(int i = 0; i < 배열.length ; i++) {
			for(int j = 0; j < 배열[i].length; j++) {
				배열[i][j] = a;
				System.out.print(a+ ",\t");
				a++;
			}
			System.out.println();
		}
	}
}
