package week2;

public class StudentByConstructor {
	int id;
	String name;
	int phone;
	StudentByConstructor(int i, String n, int p) {
		id = i;
		name = n;
		phone = p;
		System.out.println("id is "+id+" name is "+ name +"phone is"+phone);
	}
	StudentByConstructor() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		StudentByConstructor s1 = new StudentByConstructor(100, "Suhasa",123);
		StudentByConstructor s2 = new StudentByConstructor(101, "Aravind",456);
		StudentByConstructor s3 = new StudentByConstructor(103, "Test",789);
		new StudentByConstructor();
	
		
	
		
		
	}

}
