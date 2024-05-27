package java0524;

public class Study06 {

	public static void main(String[] args) {
		
		new Study06_01().함수();
		Study06_02.함수();  //new 키워드를 사용하지 않고 메소드 실행하기
		System.out.println(Study06_02.a);
		
		System.out.println(Study01.더하기(500, 200));
		System.out.println(Study01.빼기(500, 200));
		System.out.println(Study01.나누기(500, 200));
		System.out.println(Study01.곱하기(500, 200));
		
	}
	
}
