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

//********************************************************************************//
* * * * *   |   1 2 3 4 5   |   A B C D E 
* * * *     |   1 2 3 4     |   A B C D
* * *       |   1 2 3       |   A B C
* *         |   1 2         |   A B
*           |   1           |   A

* * * * *    |    1 2 3 4 5    |    A B C D E
  * * * *    |      1 2 3 4    |      A B C D
    * * *    |        1 2 3    |        A B C
      * *    |          1 2    |          A B
        *
        
        