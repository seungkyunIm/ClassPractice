package java0521;

public class Study02 {

	public static void main(String[] args) {
		int[] 배열 = new int[10];
		
		for(int i = 0; i < 배열.length; i++) {
			배열[i] = i;
		}
		
		/***********************************************
		 * 문제1) 인덱스와 값을 곱하여 다시 배열에 값넣기
		 * 출력 예시)
		 * 인덱스		초기값	곱셈할값		배열에들어갈 값
		 * 0		0		9			(0 * 9) = 0
		 * 1		1		8			(1 * 8) = 8
		 * 2		2		7			(2 * 7) = 14
		 * 3		3		6			(3 * 6) = 18
		 * 4		4		5			(4 * 5) = 20
		 * 5		5		4			(5 * 4) = 20
		 * 6		6		3			(6 * 3) = 18
		 * 7		7		2			(7 * 2) = 14
		 * 8		8		1			(8 * 1) = 8
		 * 9		9		0			(9 * 0) = 0
		 ************************************************/
		
		/*
		 * int c =0; while(c<배열.length) { 
		 * for(int j=9; j>-1; j--) { System.out.println(c+" * " +j +" = "+(c*j)); c++; } 
		 * }
		 */
		
		int 대상자 = 9;
		
		for(int i = 0; i < 배열.length; i++) {
			// 1단계 - 배열에서 해당 위치에 들어 있는 값 확인
			//System.out.println("인덱스: " + i + ", 초기값 : " + 배열[i]);
			
			// 3단계 - 배열에 들어갈 값 정의
			int 값 = (i * 대상자);
			//System.out.println(i +" * " + 대상자 + " = " + 값);
			배열[i] = 값;
			대상자--;
		}
		
		// 4단계 - 배열에 담겨 있는 값 확인
		for(int i = 0; i < 배열.length; i++) {
			System.out.println( 배열[i] );
		}
	}

}
