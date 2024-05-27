package java0524;

public class Study05 {
	
	public static void main(String[] args) {
		
		new Study05_1();     // <-- 실행 또 호출
		Study05_1 s51 = new Study05_1(1);    // 같은 클래스안에 있는 메소드가 여러개 일때 배열같은 형식으로 변경 하여 사용
		System.out.println(s51);
		s51.b();
	}
}
