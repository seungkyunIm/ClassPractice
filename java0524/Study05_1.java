package java0524;

public class Study05_1 {
	
	private int a;
	
	Study05_1(){
		System.out.println(11111);
	}

	Study05_1(int a){     // 매개 변수를 채웠기 때문에 위에 디폴트로 생성되어있던 메소드가 무시가 된다.(디폴트가 적혀있지 않을 때) 디폴트를 다시 적어주면 활용 가능하다.
		System.out.println(a);
		this.a = a;
	}
	
	void b() {
		System.out.println(a);
	}
	
}
