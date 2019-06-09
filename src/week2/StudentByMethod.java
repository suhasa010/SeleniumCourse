package week2;

public class StudentByMethod {
	int id;
	String name;
	public void insertRecords(int i, String n) {
		id = i;
		name = n;
	}
	public void displayData() {
		System.out.println("student id is "+id+" "+"Student name is "+name);
	}
	public static void Main(String args[]) {

	//INitialize with method
	StudentByMethod s1 = new StudentByMethod();
	StudentByMethod s2 = new StudentByMethod();
	s1.insertRecords(101, "Aravind");
	s2.insertRecords(102, "Suhasa");
	
	s1.displayData();
	s2.displayData();
	}

}
