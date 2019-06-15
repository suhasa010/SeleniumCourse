package week3;

public class Demo {
	static int i = 0;
	public void display() {
		System.out.println(" "+i);
	}
	public static void main(String[] args) {
		Demo d1 = new Demo();
		//System.out.println(" "+(d1.i+1));
		Demo.i+=1;
		d1.display();
		
		Demo d2 = new Demo();
		//System.out.println(" "+(d2.i+1));
		Demo.i+=2;
		d2.display();
	}

}
