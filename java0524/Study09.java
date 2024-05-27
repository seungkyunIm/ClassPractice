package java0524;

import java.util.Scanner;

public class Study09 {
	
	public static void main(String [] agrs) {
		
		Scanner d = new Scanner(System.in);
		Scanner k = new Scanner(System.in);
		
		System.out.println("구구구구구구단 두 값을 입력 해주세요");
		int key = d.nextInt();
		int key2 = k.nextInt();
		new Study09_01(key, key2);
		
	}
}
