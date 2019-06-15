package week3;

public class Cat extends Animal {

	void Meow() {
		System.out.println("Meow Meow");
	}
	public static void main(String args[]) {
		Cat c =  new Cat();
		c.Eating();
		c.Meow();
	}
}
