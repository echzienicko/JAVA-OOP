package practicev2;

public class Student extends Person {
	private Person student;
	private String teacherName;
	private String section;
	
	public Student() { }
	
	public Student(Person student, String teacherName, String section) {
		super();
		this.student = student;
		this.teacherName = teacherName;
		this.section = section;
	}
	
	public Person getStudent() {
		return student;
	}
	public void setStudent(Person student) {
		this.student = student;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	
}
