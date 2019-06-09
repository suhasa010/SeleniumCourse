package week2;

public class Student {
	int id;
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize with reference
		Student student1 = new Student();
		student1.id = 100;
		student1.name= "Suhasa";
		
		//Initialize through method
		System.out.println("student id is "+student1.id+" "+"Student name is "+student1.name);
		
	
	}

}
