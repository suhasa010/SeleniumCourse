	package week3;
	
	public class Father extends Grandpa {
		int age = 40;
		String name = "Teja";
		int myFatherage = super.age;
		String hobbies = "Driving";
		public void Walking() {
			System.out.println("Father walking");
		}
		public void GrandpaWalking() {
			super.Walking();
		}
	}
