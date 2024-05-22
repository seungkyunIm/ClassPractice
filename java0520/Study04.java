package java0520;

public class Study04 {
	
	public static void main(String[] args) {
		
		int[] 정수형배열 = new int[8];
		정수형배열[2] = 5;
		
		/*
		 * for(int i = 0; i < 정수형배열.length; i++) { // 조건문에서 <= 일때 배열의 범위를 넘어가게 되는 경우
		 * 콘솔창에서 오류남.
		 * 
		 * System.out.println(정수형배열[i]); }
		 */
		//문제 1) 인덱스 마지막에 10의 값을 넣고 마지막 인덱스만 출력하시오.
		//int s = 정수형배열.length;
		//System.out.println(s);
		// 인덱스는 0 부터 시작 
		// 크기 1 부터 시작
		정수형배열[정수형배열.length-1] = 10;
		System.out.println(정수형배열[정수형배열.length-1]);
		
		for(int i = 0; i < 정수형배열.length; i++) {
			System.out.println(정수형배열[i]);
		}
	}

}
