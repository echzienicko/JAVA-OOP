package practicev2;

public class Teacher extends Person {
	private Person teacher;
	private String section;
	private String subject;
	
	public Teacher() { }
	
	public Teacher(Person teacher, String section, String subject) {
		super();
		this.teacher = teacher;
		this.section = section;
		this.subject = subject;
	}
	public Person getTeacher() {
		return teacher;
	}
	public void setTeacher(Person teacher) {
		this.teacher = teacher;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
