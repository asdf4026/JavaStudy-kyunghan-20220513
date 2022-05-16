package j03_연산;

public class Operation07 {

	public static void main(String[] args) {
		int year = 2000;
		String result = null;
		result = year % 4 == 0 && year % 100 !=0 || year % 400 == 0 ? "윤년" : "윤년이 아님";
		System.out.println("결과: " + result);
	}
		

}
