package Pattern1;

public class Left_Half_Pattern {

	public static void main(String[] args) {

		for (int i = 5; i > 0; i--) {

			for (int j = 0; j < i - 1; j++) {
				
				System.out.printf(" ");
			}

			for (int k = 0; k < 5 - i + 1; k++) {
				
				System.out.printf("*");
			}
			
			System.out.println("\n");
		}

	}
}