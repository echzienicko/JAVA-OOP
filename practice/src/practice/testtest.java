package practice;

public class testtest {

//	class sound{
//		public String dogSound(){
//			return "Wof Wof";
//		}
//	}
//	
//	class dog extends sound{
//		
//	}
//	
//	public static void main(String[] args){
//		dog();
//	}

	
		
		
		public static void main(String[] args) {
//			Animal pino = new Dog();
//			pino.animalSound();
//			pino = new Pig();
//			pino.animalSound();
//			
//			Person person1;
//			
			User user1 = new User();
			
			System.out.println(user1.getName());
			
			user1.setName("Got");
			
			System.out.println(user1.getName());
			
//			Dog pino1 = new Dog();
		} 
}

class User {
	private String name = "Mor";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

class Animal {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends Animal {
	 
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}
	
	interface Person {
		public String getName();
		public String getAge();
		public String getGender();
	}
	
	class Teacher implements Person {

		
		@Override
		public String getAge() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getGender() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	class Student implements Person {

		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getAge() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getGender() {
			// TODO Auto-generated method stub
			return null;
		}
		
		public int getGrade() {
			return 0;
		}
	}
	
	