package java0522;

public class Study08 {

  public static void main(String[] args) {

		/***********************************************
		 * 문제8) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
	     * ★
	     * ★★
	     * ★★★
	     * ★★★★
	     * ★★★★★
	     * ★★★★
	     * ★★★
	     * ★★
	     * ★
		 ************************************************/

		// 해결 코드 작성 시작

	    String 별 = "★";
	
	    /*** 코드 시작 ***/
	    String[][] 배열 = new String[9][5];
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
	    }
	    
	    for(int i = 0 ; i < 배열.length ; i++) {
	    	for(int j = 0; j < 배열[i].length; j++) {
	    		System.out.print(배열[i][j]);
	    	}
	    	System.out.println();	
	    }
	
	
	    /*** 코드 종료 ***/

  }

}