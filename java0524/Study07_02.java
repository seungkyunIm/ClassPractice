package java0524;

public class Study07_02 extends Study07_01{
	
	void 호출() {         // 메소드
		함수();
	}

	void 함수() {         //Study07_01이 부모 클래스지만 여기걸로 출력이 된다.
		System.out.println("함수111");
	}
	
	@Override
	void 함수2() {		 // 오버라이드 여기에 메소드
	}
	
	void 함수2(int a) {   // 오버로드 똑같은 이름의 메소드 전달값 추가
		
	}

}
