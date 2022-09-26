package practicev2;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		HashMap<String, Student> students = new HashMap<String, Student>();
//		HashMap<String, Teacher> teachers = new HashMap<String, Teacher>(); 
//		Student student1 = new Student(new Person("Nick", "Manuel", "S.", "MALE", 23), "LESLY", "KAMONGGAY");
//		students.put(student1.getStudent().getFirstName(), student1);
//		Student student2 = new Student(new Person("Mor", "Cellan", "L.", "MALE", 69), "KADITA", "KAMATIS");
//		students.put(student2.getStudent().getFirstName(), student2);
//		Student student3 = new Student(new Person("Marvin", "Pino", "J.", "MALE", 109), "GOAT", "SAGBOT");
//		students.put(student3.getStudent().getFirstName(), student3);
//		
//		Teacher teacher1 = new Teacher(new Person("LESLY", "ONE", "SHOT", "FEMALE", 24), "KAMONGGAY", "Math");
//		teachers.put(teacher1.getTeacher().getFirstName(), teacher1);
//		Teacher teacher2 = new Teacher(new Person("KADITA", "SEAS", "S.", "FEMALE", 24), "KAMATIS", "Math");
//		teachers.put(teacher2.getTeacher().getFirstName(), teacher2);
//		Teacher teacher3 = new Teacher(new Person("GOAT", "SHEEP", "K.", "FEMALE", 24), "SAGBOT", "Math");
//		teachers.put(teacher3.getTeacher().getFirstName(), teacher3);
//		
//		System.out.println(teachers.get(teacher1.getTeacher().getFirstName()));
////		System.out.println(teachers.get(teacher1.getTeacher().getFirstName()).getSubject());
//		Scanner myObj = new Scanner(System.in);
//		System.out.println("Teacher Name: ");
//		String teacher = myObj.nextLine();
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		String fName, lName, mName, sex, tName, sect;
		int edge;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("SElECT OPTION\n1. ADD STUDENT\n2. VIEW STUDENT");
			int option = sc.nextInt();
			
			if(option == 1) {
				String firstName = "";
				String middleName = "";
				String lastName = "";
				String gender = "";
				int age = 0;
				String teacherName = "";
				String section = "";
				
				System.out.print("Student firstName: ");
				firstName = sc.next();
				
				
				
				System.out.print("Student middleName: ");
				middleName = sc.next();
				
				System.out.print("Student lastName: ");
				lastName = sc.next();
				
				System.out.print("Student gender: ");
				gender =  sc.next();
				
				System.out.print("Student age: ");
				age = sc.nextInt();
				
				System.out.print("Student teacherName: ");
				teacherName = sc.next();
				
				System.out.print("Student section: ");
				section = sc.next();
				
				studentList.add(new Student(new Person(firstName, middleName, lastName, gender, age), teacherName, section));
				
				System.out.println("Succesfully added");
				
			} else {
				
				for(int i = 0; i < studentList.size(); i++) {
					
					fName = studentList.get(i).getStudent().getFirstName();
					mName = studentList.get(i).getStudent().getMiddleName();
					lName = studentList.get(i).getStudent().getLastName();
					tName = studentList.get(i).getTeacherName();
					sect = studentList.get(i).getSection();
					edge = studentList.get(i).getStudent().getAge();
					
					System.out.println((i + 1) + ". Name: " + fName + " " + mName + " " + lName + "  Teachers Name: " + tName + " Section: " +  sect + " Age: " + edge);
				}
				

			}
			
		System.out.println("--------------------------------------------------------");
			
			
		} while(1 == 1);
		
	}
}
