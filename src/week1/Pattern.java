package week1;

public class Pattern {
		public static void main(String args[]) {
			int row = 4;
			char letter = 'A';
			for ( int i = 0; i < row; i++) {
				for ( int j = 0; j <= i; j++) {
					System.out.print(letter+" ");
					letter++;
					letter++;
				}
				System.out.println();
			}
		}
}
