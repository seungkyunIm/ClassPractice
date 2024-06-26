package java0522;

public class Study09 {

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
	
	    /*** 코드 시작 ***/
	    String[][] 배열 = new String[7][7];
	    String 빈공간 = " ";
	    for(int i = 0 ; i < 배열.length ; i++) {
	    	for(int j = 0; j < 배열[i].length; j++) {
	    		//빈공간
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