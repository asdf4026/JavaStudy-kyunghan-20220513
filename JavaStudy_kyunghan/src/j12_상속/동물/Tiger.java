package j12_상속.동물;

public class Tiger extends Animal {
	@Override
	public void move() {
		//super.move(); //상위클래스의 move()를 호출
		System.out.println("호랑이가 네발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	

}
