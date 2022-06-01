package j18_최상위클래스.entity;

import java.util.Objects;

public class School {
	private String schoolName; //학교명
	private String address; //학교주소
	private String major; //전공
	private int number; //학교전화번호
	private String type; //초,중,고,대
	
	public School() {
		// TODO Auto-generated constructor stub
	}

	public School(String schoolName, String address, String major, int number, String type) {
		super();
		this.schoolName = schoolName;
		this.address = address;
		this.major = major;
		this.number = number;
		this.type = type;
	}
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, major, number, schoolName, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(address, other.address) && Objects.equals(major, other.major) && number == other.number
				&& Objects.equals(schoolName, other.schoolName) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", address=" + address + ", major=" + major + ", number=" + number
				+ ", type=" + type + "]";
	}
	
	
}
