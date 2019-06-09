package week2;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int fact = 1;
		
		for (int i = num; i > 0 ; i--) {
			fact = i*fact;
		}
		System.out.println(fact);
	}

}
