package j02_변수와_상수;

public class MaxMin {
	//대문자로 시작 : 클래스명
	//전부 대문자 : 상수
	//소문자로 시작: 변수
	

	public static void main(String[] args) {
		final int MAX_NUMBER = 100; 
		final int MIN_NUMBER;
		MIN_NUMBER = 10;
		
		final String PATH = "C:\\junil\\kyunghan\\workspace";
		
		final double PI = 3.14;
		
		System.out.println(MAX_NUMBER);
		System.out.println(MIN_NUMBER);
	}

}
