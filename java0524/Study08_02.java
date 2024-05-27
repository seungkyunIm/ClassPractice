package java0524;

public class Study08_02 extends Study08_01 {
	
	int a;
	
	Study08_02(){super(4);}   // 생성자 영역에서만 사용 가능
	
	Study08_02(int a){
		super.a = a;
		
		this.a = a;
	}
	
	void 함수2() {}
}
