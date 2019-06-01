package week1;

public class Student {
	int id;
	String name;
	int std;
	float marks;
	public Student(int i, String string, int j, float d) {
		id=i;
		name=string;
		j=std;
		marks=d;
	}	
	public static void main (String args[]) {
		Student student1 = new Student(1, "Suhasa", 12, 80);
		System.out.println("Student ID = "+student1.id+" "+"Student name = "+student1.name+" "+"Standard = "+student1.std+" "+"Marks Scored = "+student1.marks);
	}
}
