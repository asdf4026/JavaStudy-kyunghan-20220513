package j20_컬렉션.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //게터 세터 자동생성
@NoArgsConstructor //기본 생성자 자동생성
@AllArgsConstructor // 전체 생성자 자동생성
public class Student {
	private int sutdentcode;
	private String name;
	private String schoolName;
	
}
