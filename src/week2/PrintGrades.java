package week2;

public class PrintGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 70;
		
		if (marks < 35 )
			System.out.println("Fail");
		
		else if (marks >= 35 && marks < 50)
			System.out.println("Grade is C ");
		
		else if (marks >=50 && marks < 60 )
			System.out.println("Grade is B");
		
		else if (marks >=60 && marks <=100 )
			System.out.println("Grade is A");
		
		else
			System.out.println("invalid result");
		
	}

}
