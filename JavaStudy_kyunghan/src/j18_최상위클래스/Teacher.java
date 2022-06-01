package j18_최상위클래스;

/*
 * Object class(최상위 클래스)
 */


public class Teacher{
	private String name;
	private String subject;
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;{
			Teacher teacher = (Teacher) obj;
			if(this.name.equals(teacher.name) && this.subject.equals(teacher.subject)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	
	public void classInto() {
	}
	
	
}
