package j05_조건;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		System.out.println("X와 Y를 입력 해주세요");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if((x > 1000 || y > 1000 || x <-1000 || y <-1000 ||x == 0 || y == 0)
				&& (x != 0 || y !=0)) { 
			System.out.println("계산 불가");
		}else if(x > 0 && y > 0) {
			System.out.println("1사분면입니다");
		}else if(x < 0 && y > 0) {
			System.out.println("2사분면입니다");
		}else if(x < 0 && y < 0) {
			System.out.println("3사분면입니다");
		}else if(x > 0 && y < 0) {
			System.out.println("4사분면입니다");
		}else {
			System.out.println("원점");
		}
		
		String result =( x > 1000 || y > 1000 || x <-1000 || y <-1000 ||x == 0 || y == 0)
		&& (x != 0 || y !=0) ? "계산 불가"
				: x > 0 && y > 0 ? "1사분면"
						:x < 0 && y > 0 ? "2사분면"
								:x < 0 && y < 0 ? "3사분면"
										:x > 0 && y < 0 ? "4사분면" :"원점";
		System.out.println(result);
	}

}
