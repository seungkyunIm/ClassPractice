package java0524;

public class Study00 {

	/*******
	 * *
	 * 객체를 다루기 위해서 두가지를 학습하자!
	 * 메소드 > 함수형 : 호출(입력) 		->>> 반환(출력)
	 * 클래스 > 객체형 : 생성자(인스턴스)    ->>> 객체를 받는다.
	 *******/
	
	public static void main(String[] args) {	
		함수();
		Study000 abcd = new Study000();
		abcd.함수();
//		abcd.함수(5);      Study000 클래스의 정수형 함수 앞에 private 가 붙어 있어 사용이 안되어 주석 처리
//		abcd.함수("");	  Study000 클래스의 문자열 함수 앞에 private 가 붙어 있어 사용이 안되어 주석 처리
		
	
	}
	
	Study00() {}
	Study00(int a) {}
	Study00(String a) {}
	
	static void 함수() {}
	static void 함수(int a) {}
	static void 함수(String a) {}
	
}