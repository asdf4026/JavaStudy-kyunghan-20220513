package j06_반복;

public class While01 {

	public static void main(String[] args) {
		int i = 0;
		int result = 0;
		
		while(i<100) { //while()안에 조건식이 들어가야하고 참이 아닌 순간 반복 끝 
			result = result + (i+ 1);
			i++; //조건 변화 수식
		}
		System.out.println(result);
	}

}
