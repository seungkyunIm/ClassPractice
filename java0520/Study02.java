package java0520;

public class Study02 {

	public static void main(String[] args) {
		
		//구구단
		//단 * 증가값 = 결과값
		
		/*for(int 단 = 1; 단 <= 9 ; 단++) { //단을 위한 반복문                      // 짝수 구구단
			if(단==2) {				
			for(int 증가값 = 1; 증가값 <= 9; 증가값++){ //증가값을 위한 반복문
			
				 //출력 하는 곳
				System.out.println(단+ " * " + 증가값 + " = " +(단*증가값));
			}
			} else if(단==4) {
				for(int 증가값 = 1; 증가값 <= 9; 증가값++){ //증가값을 위한 반복문
					
					 //출력 하는 곳
					System.out.println(단+ " * " + 증가값 + " = " +(단*증가값));
				}
			} else if(단==6) {
				for(int 증가값 = 1; 증가값 <= 9; 증가값++){ //증가값을 위한 반복문
					
					 //출력 하는 곳
					System.out.println(단+ " * " + 증가값 + " = " +(단*증가값));
			}
			} else if(단==8) {
				for(int 증가값 = 1; 증가값 <= 9; 증가값++){ //증가값을 위한 반복문
					
					 //출력 하는 곳
					System.out.println(단+ " * " + 증가값 + " = " +(단*증가값));
			} 
			}
		}*/
		// 문제1) 짝수 단수만 출력
		/*
		 * for(int 단 = 1; 단 <= 9 ; 단++) { //단을 위한 반복문
		 * 
		 * //if( (단%2) == 1) continue; if( (단%2) == 0) {
		 * 
		 * for(int 증가값 = 1; 증가값 <= 9; 증가값++){ //증가값을 위한 반복문
		 * 
		 * //출력 하는 곳 System.out.println(단+ " * " + 증가값 + " = " +(단*증가값)); } } }
		 */
		// 문제2) 한줄에 단수를 3개 출력
		/*
		 * for(int 단 = 1; 단 <= 9; 단+=3) { //3단계식을 위한 반복문
		 * 
		 * for(int 증가값 = 1; 증가값 <= 9; 증가값++) {
		 * 
		 * //출력하는 곳 System.out.print(단+ " * " + 증가값 + " = " +(단*증가값) +"\t"); 
		 * int a = 단 + 1; //인덱스 값을 변경하지 않기 위해 새로운 변수 
		 * int b = a + 1; 
		 * System.out.print(a+ " * " + 증가값 + " = " +(a*증가값) + "\t"); 
		 * System.out.println(b+ " * " + 증가값 + " = "+(b*증가값)); 
		 * } 
		 * System.out.println(); }
		 */
		// 문제3) 증가될 단수를 제어 하세요.
		
		int step = 4;  //step > 1, 4
		for(int 단 = 1; 단 <= 9; 단+=step) {  //3단계식을 위한 반복문
			
			for(int 증가값 = 1; 증가값 <= 9; 증가값++) {
				
				for(int s = 단; s < (단+step);s++) {
					System.out.print(s+ " * " + 증가값 + " = " +(s*증가값) +"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
