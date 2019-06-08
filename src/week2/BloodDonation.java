package week2;

public class BloodDonation {
	public static void main(String args[]) {
		int age = 17;
		int weight = 40;
		
		if (age > 18)
			if (weight > 50)
				//Above two statements can be replaced by
				// if (age>18 && weight >50)
				System.out.println("Eligible to donate");
			else
				System.out.println("weight is low");
		else
			System.out.println("ineligible to donate due to age");
		
	}
}
