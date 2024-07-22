package transferStatements;

public class TryCatch {

	public static void main(String[] args) {
		
		
		//Scenario 1: try catch block
		
		try {
			System.out.println(10/0);
		}
    catch(ArithmeticException ae)
		{
    	System.out.println(10/5);
       }
	}

}
