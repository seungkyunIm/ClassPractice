package java0522;

import java.util.Scanner;

public class Study97 {

  public static void main(String[] args) {

		/***********************************************
		 * 문제9) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
	     *    ★
	     *   ★★★
	     *  ★★★★★
	     * ★★★★★★★
	     *  ★★★★★
	     *   ★★★
	     *    ★
		 ************************************************/

		// 해결 코드 작성 시작

	    String 별 = "★";
	    String 빈공간 = " ";
		Scanner a = new Scanner(System.in);
		boolean key = false;
	
	    /*** 코드 시작 ***/
		
		while(true) {
		System.out.println("1~5까지 값을 입력해 주십시오.");
		int 입력값 = a.nextInt();
		
		String[][] 배열 = new String[1][1];
		String[][] 배열1 = new String[3][3];
		String[][] 배열2 = new String[5][5];
		String[][] 배열3 = new String[7][7];
		String[][] 배열4 = new String[9][9];
		String[][] 배열5 = new String[11][11];
		if(입력값==3) { 
			배열 = 배열1;
		}else if(입력값==4) {
			배열 = 배열2;
		}else if(입력값==5) {
			배열 = 배열3;
		}else if(입력값==6) {
			배열 = 배열4;
		}else if(입력값==7) {
			배열 = 배열5;
		}
		switch(입력값) {
			case 1: 
			    for(int i = 0 ; i < 배열1.length ; i++) {
			    	for(int j = 0; j < 배열1[i].length; j++) {
			    		//빈공간
		        		if((i==0||i==2) && (j<=0 || j>=2)) {        
		        			배열1[i][j] = 빈공간;
		        		}else {										
		        			배열1[i][j] = 별;
		        		}
			    	}
			    }
			    for(int i = 0 ; i < 배열1.length ; i++) {
			    	for(int j = 0; j < 배열1[i].length; j++) {
			    		System.out.print(배열1[i][j]);
			    	}
			    	System.out.println();	
			    }break;
			case 2:
			    for(int i = 0 ; i < 배열2.length ; i++) {
			    	for(int j = 0; j < 배열2[i].length; j++) {
			    		//빈공간
		        		if((i==0||i==4) && (j<=1 || j>=3)) {        
		        			배열2[i][j] = 빈공간;
		        		}else if ((i==1||i==3) && (j<=0 || j>=4)) { 
		        			배열2[i][j] = 빈공간;
		        		}else {										
		        			배열2[i][j] = 별;
		        		}
			    	}
			    }
			    for(int i = 0 ; i < 배열2.length ; i++) {
			    	for(int j = 0; j < 배열2[i].length; j++) {
			    		System.out.print(배열2[i][j]);
			    	}
			    	System.out.println();	
			    }break;
			case 3:
			    for(int i = 0 ; i < 배열3.length ; i++) {
			    	for(int j = 0; j < 배열3[i].length; j++) {
			    		//빈공간
		        		if((i==0||i==6) && (j<=2 || j>=4)) {        // i 가 0 또는 6이고 j는 2 또는 4 일때 빈공간 대입
		        			배열3[i][j] = 빈공간;
		        		}else if ((i==1||i==5) && (j<=1 || j>=5)) { // i 가 1 또는 5이고 j는 1 또는 5 일때 빈공간 대입
		        			배열3[i][j] = 빈공간;
		        		}else if ((i==2||i==4) && (j<=0 || j>=6)) { // i 가 2 또는 4이고 j는 0 또는 6 일때 빈공간 대입
		        			배열3[i][j] = 빈공간;
		        		}else {										// 그 외에 나머지 공간에는 별 대입
		        			배열3[i][j] = 별;
		        		}
			    	}
			    }
			    for(int i = 0 ; i < 배열3.length ; i++) {
			    	for(int j = 0; j < 배열3[i].length; j++) {
			    		System.out.print(배열3[i][j]);
			    	}
			    	System.out.println();	
			    }break;
			case 4:			    
				for(int i = 0 ; i < 배열4.length ; i++) {
					for(int j = 0; j < 배열4[i].length; j++) {
						//빈공간
						if((i==0||i==8) && (j<=3 || j>=5)) {        
							배열4[i][j] = 빈공간;
						}else if ((i==1||i==7) && (j<=2 || j>=6)) { 
							배열4[i][j] = 빈공간;
						}else if ((i==2||i==6) && (j<=1 || j>=7)) {
							배열4[i][j] = 빈공간;
						}else if ((i==3||i==5) && (j<=0 || j>=8)) {
							배열4[i][j] = 빈공간;
						}else {									
							배열4[i][j] = 별;
						}
					}
				}
				for(int i = 0 ; i < 배열4.length ; i++) {
					for(int j = 0; j < 배열4[i].length; j++) {
						System.out.print(배열4[i][j]);
					}
					System.out.println();	
				}break;
			case 5:
				for(int i = 0 ; i < 배열5.length ; i++) {
					for(int j = 0; j < 배열5[i].length; j++) {
						//빈공간
						if((i==0||i==10) && (j<=4 || j>=6)) {
							배열5[i][j] = 빈공간;
						}else if ((i==1||i==9) && (j<=3 || j>=7)) {
							배열5[i][j] = 빈공간;
						}else if ((i==2||i==8) && (j<=2 || j>=8)) {
							배열5[i][j] = 빈공간;
						}else if ((i==3||i==7) && (j<=1 || j>=9)) {
							배열5[i][j] = 빈공간;
						}else if ((i==4||i==6) && (j<=0 || j>=10)) {
							배열5[i][j] = 빈공간;
						}else {										
							배열5[i][j] = 별;
						}
					}
				}
				for(int i = 0 ; i < 배열5.length ; i++) {
					for(int j = 0; j < 배열5[i].length; j++) {
						System.out.print(배열5[i][j]);
					}
					System.out.println();	
				}break;
			default:
				System.out.println("1~5사이의 숫자값이 아닙니다. 다시 실행 해주세요.");
				key = true;
	    /*** 코드 종료 ***/
		}if(key) break;
  }
		}
}