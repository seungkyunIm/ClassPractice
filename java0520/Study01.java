package java0520;


/***********
 * >>반복문
 * for : for(; ;) {}
 ***********/
public class Study01 {
	
	public static void main(String[] args) {
		
		int tot=0;
		
		for(int i = 1; i <= 10; i++) {      // 1 > 2 > 3 > 4 > 5 > 6 > 7 > 8 > 9 > 10
			//System.out.println("전 :" + i + tot);
			tot += i;
			//System.out.println("후 :" + i + tot);
		}
		
		System.out.println("반복문의 합: " + tot);

	}

}
