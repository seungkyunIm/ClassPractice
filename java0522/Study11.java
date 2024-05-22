package java0522;

import java.util.Scanner;

public class Study11 {

		public static void main(String[] agrs) {
			
			Scanner a = new Scanner(System.in);
			boolean key = false;
			String 별 = "★";

			String[][] 배열1 = new String[5][9];
			String[][] 배열2 = new String[5][9];
			String[][] 배열3 = new String[9][5];
			String[][] 배열4 = new String[9][5];
			String[][] 배열5 = new String[7][7];
			
			while(true) {
			System.out.println("1~5까지 값을 입력해 주십시오.");
			int 입력값 = a.nextInt();
			
			String[][] 배열 = new String[1][1];
			
			if(입력값==1) {
				배열 = 배열1;
			}else if(입력값==2) {
				배열 = 배열2;
			}else if(입력값==3) {
				배열 = 배열3;
			}else if(입력값==4) {
				배열 = 배열4;
			}else if(입력값==5) {
				배열 = 배열5;
			}
			switch(입력값) {
				case 1: 
				    for(int i = 0 ; i < 배열.length ; i++) {
				    	for(int j = 0; j < 배열[i].length; j++) {
				    		//빈공간
				    		String 빈공간 = " ";
				        		if(i==1 && (j<=0 || j>=8)) {
				        			배열[i][j] = 빈공간;
				        		}else if (i==2 && (j<=1 || j>=7)) {
				        			배열[i][j] = 빈공간;
				        		}else if (i==3 && (j<=2 || j>=6)) {
				        			배열[i][j] = 빈공간;
				        		}else if (i==4 && (j<=3 || j>=5)) {
				        			배열[i][j] = 빈공간;
				        		}else {
				        			배열[i][j] = 별;
				        		}
				    	}
				    }break;
				case 2: 
				    for(int i = 0 ; i < 배열.length ; i++) {
				    	for(int j = 0; j < 배열[i].length; j++) {
				    		//빈공간
				    		String 빈공간 = " ";
				        		if(i==0 && (j<=3 || j>=5)) {
				        			배열[i][j] = 빈공간;
				        		}else if (i==1 && (j<=2 || j>=6)) {
				        			배열[i][j] = 빈공간;
				        		}else if (i==2 && (j<=1 || j>=7)) {
				        			배열[i][j] = 빈공간;
				        		}else if (i==3 && (j<=0 || j>=8)) {
				        			배열[i][j] = 빈공간;
				        		}else{
				        			배열[i][j] = 별;
				        		}
				        		
				    	}
				    }break;
				case 3:
				    for(int i = 0 ; i < 배열.length ; i++) {
				    	for(int j = 0; j < 배열[i].length; j++) {
				    		//빈공간
				    		String 빈공간 = "";
				        		if((i==1||i==7) && j>=4) { // i 가 1 또는 7 일때 j가 4와 같거나 크다면 빈공간으로 대입
				        			배열[i][j] = 빈공간;
				        		}else if ((i==2||i==6) && j>=3) {
				        			배열[i][j] = 빈공간;
				        		}else if ((i==3||i==5) && j>=2) {
				        			배열[i][j] = 빈공간;
				        		}else if (i==4 && j>=1) {
				        			배열[i][j] = 빈공간;	      
				            	}else {
				        			배열[i][j] = 별;
				        		}
				    	}
				    }break;
				case 4: 
				    for(int i = 0 ; i < 배열.length ; i++) {
				    	for(int j = 0; j < 배열[i].length; j++) {
				    		//빈공간
				    		String 빈공간 = "";
			        		if((i==0||i==8) && j>=1) {				// i 가 0 또는 8 이고 j가 1보다 큰 경우 빈공간 대입
			        			배열[i][j] = 빈공간;
			        		}else if ((i==1||i==7) && j>=2) {		// i 가 1 또는 7 이고 j가 2보다 큰 경우 빈공간 대입
			        			배열[i][j] = 빈공간;
			        		}else if ((i==2||i==6) && j>=3) {		// i 가 2 또는 6 이고 j가 3보다 큰 경우 빈공간 대입
			        			배열[i][j] = 빈공간;
			        		}else if ((i==3||i==5) && j>=4) {		// i 가 3 또는 5 이고 j가 4보다 큰 경우 빈공간 대입
			        			배열[i][j] = 빈공간;
			        		}else{									// 그 외자리에 별을 대입
			        			배열[i][j] = 별;
				        	}
				    	}
				    }break;
				case 5: 
				    for(int i = 0 ; i < 배열.length ; i++) {
				    	for(int j = 0; j < 배열[i].length; j++) {
				    		//빈공간
				    		String 빈공간 = " ";
			        		if((i==0||i==6) && (j<=2 || j>=4)) {        // i 가 0 또는 6이고 j는 2 또는 4 일때 빈공간 대입
			        			배열[i][j] = 빈공간;
			        		}else if ((i==1||i==5) && (j<=1 || j>=5)) { // i 가 1 또는 5이고 j는 1 또는 5 일때 빈공간 대입
			        			배열[i][j] = 빈공간;
			        		}else if ((i==2||i==4) && (j<=0 || j>=6)) { // i 가 2 또는 4이고 j는 0 또는 6 일때 빈공간 대입
			        			배열[i][j] = 빈공간;
			        		}else {										// 그 외에 나머지 공간에는 별 대입
			        			배열[i][j] = 별;
			        		}
				    	}
				    }break;
			default:
				System.out.println("1~5까지 숫자가 아닙니다. 다시 실행 해주세요");
				key = true;
			}
			if(key) break;
			for(int i = 0 ; i < 배열.length ; i++) {
				for(int j = 0; j < 배열[i].length; j++) {
					
					System.out.print(배열[i][j]);
				}
				System.out.println();
			}
			}
//		if(입력값 == 0) {
//			System.out.println("0을 입력하셨습니다.");
//		}
//		if(입력값 == 1) {
//			System.out.println("1을 입력하셨습니다.");
//		}
//		if(입력값 == 2) {
//			System.out.println("2을 입력하셨습니다.");
//		}
//		if(입력값 == 3) {
//			System.out.println("3을 입력하셨습니다.");
//		}
//		if(입력값 == 4) {
//			System.out.println("4을 입력하셨습니다.");
//		}
			
			
		}
}
