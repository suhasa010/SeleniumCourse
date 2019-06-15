package week3;

public class Programmer extends Employee {
	int bonus = 10000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p = new Programmer();
		
		//Parent variable
		System.out.println("Salary = "+p.salary);

		//Child Variable
		System.out.println("Bonus= "+p.bonus);
	}
}
