package java0524;

public class Study01 {

	public static void main(String[] args) {
		
		int 값 = 더하기(1,2);               // 1 + 2 = 3
		int 값2 = 빼기(5,2);               // 5 - 2 = 3
		int 값3 = 나누기(9,3);			 	 // 9 / 3 = 3
		int 값4 = 곱하기(3,1);				 // 3 * 1 = 3
		System.out.println(값);
		System.out.println(값2);
		System.out.println(값3);
		System.out.println(값4);
	}
	
	static int 더하기(int a, int b) {
		return (a + b);
	}
	
	static int 빼기(int a, int b) {
		return (a - b);
	}
	
	static int 나누기(int a, int b) {
		return (a / b);
	}
	
	static int 곱하기(int a, int b) {
		return (a * b);
	}
	
}
