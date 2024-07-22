package transferStatements;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scenario 1: Stop the flow of execution:
		for(int i=0;i<10;i++) {
			if(i==4) {
				break;
			}
			System.out.println("Hello");
		}
		
		//scenario 2:break cannot be used without switch or loop statement.so below code will throe an error
		
		
		if(true) {
			System.out.println("Hello");
			System.out.println("Hello");
			//break;
			System.out.println("Hello");
			System.out.println("Hello");
		}

	}

}
