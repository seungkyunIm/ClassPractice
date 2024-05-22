package java0520;

/*********************************
 * >> 반복문 
 * while : while() {}
 * do while : do {} while();
 *********************************/

public class Study03 {

	public static void main(String[] args) {
		
		int s = 0;
		int a = 4;
		while(a < s) {                  //while 문 안의 조건이 참일때만 발동
			//System.out.print(s +"\t");
			//System.out.print(a +"\t");
			//System.out.println(s>=a);
			//if(s >= a) break;            //검사 횟수
			//System.out.println("반복문");
			s++;
		}
		do {
			System.out.println("반복문");  // do안에 있을때 먼저 1번 실행한다.
			
		} while(a < s);
		
	}

}
