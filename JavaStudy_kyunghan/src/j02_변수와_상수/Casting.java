package j02_변수와_상수;

public class Casting {
	/*
	 * 업캐스팅
	 * 문자 -> 정수 -> 실수
	 * 다운캐스팅
	 * 실수 -> 정수 -> 문자 
	 */
	
	public static void main(String[] args) {
		char a = 'A';
		System.out.println(a);
		int b = a;
		System.out.println(b);
		double c = b;
		System.out.println(c);
		int d = (int)c;
		System.out.println(d);
		char e = (char)d;
		System.out.println(e);
	}

}
