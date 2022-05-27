package j12_상속;

public class Test1 extends Test{ //test부모클래스를 test1 자식에게 상속
	public Test1() {
		super();
		System.out.println("T1 생성자 호출");
		System.out.println("T1에서 확인: " + super.toString());
	}
	
}
