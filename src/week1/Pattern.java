package week1;

public class Pattern {
		public static void main(String args[]) {
		for (int i=66; i <= 84; i=i+2) {
			for (int j = 65; j < i; j=j+2) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
}
