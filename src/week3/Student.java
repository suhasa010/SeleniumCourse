package week3;

public class Student {
	int rollno;
	int id;
	String name;
	Student(int rollno, int id, String name) {
		this.rollno=rollno;
		this.id = id;
		this.name = name;
		//System.out.println(rollno+" "+name+" "+id);
	}
	void Display() {
		System.out.println(rollno+" "+name+" "+id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(100, 12345, "Suhasa");
		s1.Display();
	}
}
