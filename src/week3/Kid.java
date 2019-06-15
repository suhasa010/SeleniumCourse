package week3;

public class Kid extends Father {
	int age = 20;
	String name = "Rahul";
	int fatherAge = super.age;
	int grandpaAge = super.myFatherage;
	String hobbies = "pubg";
	String grandpaHobbies = super.hobbies;
	public void Walking() {
		//System.out.println("Kid walking");
		GrandpaWalking();
	}
	public static void main(String args[]) {
		Kid k = new Kid();
		System.out.println(k.age);
		System.out.println(k.fatherAge);
		System.out.println("Grandpa age = "+ k.grandpaAge);
		System.out.println(k.grandpaHobbies);
		k.Walking();
	}
}
