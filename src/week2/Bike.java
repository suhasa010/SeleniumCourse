package week2;

public class Bike {
	String bikename;
	Bike () { //default
		System.out.println("default constructor for bike class");
	}
	Bike(String name) {
		bikename=name;
		System.out.println("parametrized constructor");
	}
	public static void main(String[] args) {
		new Bike();
		
		new Bike("Pulsar");
	}

}
