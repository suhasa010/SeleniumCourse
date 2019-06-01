package week1;
import week1.Student;

/**
 * @author Suhasa
 *
 */
public class Task1 {
	
	public static void main (String args[]) {
		Student student1 = new Student(1, "Suhasa", 12, 80);
		System.out.println("Student ID = "+student1.id+" "+"Student name = "+student1.name+" "+"Standard = "+student1.std+" "+"Marks Scored = "+student1.marks);
	}
}