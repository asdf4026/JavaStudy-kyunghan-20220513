package j06_반복;

public class Star {

	public static void main(String[] args) {
		
//		for(int i = 0; i <5; i++) {
//			for(int j = 0; j <i + 1; j++) {
//				System.out.print("*");
//			}
//				System.out.println();
//		}
//		
//		for(int i = 0; i <5; i++) {
//			for(int j = 0; j <5 - i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i = 0; i <5; i++) {
			for(int j = 0; j <4- i; j++) { //공백 for문
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) { //별을 담당하는 for문
				System.out.print("*");
				}
			System.out.println();

		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
