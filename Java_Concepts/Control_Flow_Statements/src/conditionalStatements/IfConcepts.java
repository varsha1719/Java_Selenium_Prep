package conditionalStatements;

public class IfConcepts {
	
	public static void main(String[] args) {
		
	// Case 1:The condition inside the if block should be boolean otherwise it will show error
		IfConcepts obj= new IfConcepts();
		
		
		int a=10;
		if(a==10) {
			System.out.println("true");
			
		}
		else {
			System.out.println("False");
			
		}
		IfConcepts.Case2();
		IfConcepts.Case3();
		//Case2();
		//obj.Case2();
	
		//obj.Case3();
	}
	
	//Case 2: we can directly pass pass boolean value i.e true or false inside the if block
	
	
	static void Case2() {
		
		if(true) {
			System.out.println("true");
			
		}
		else {
			System.out.println("False");
			
		}
	}
//Case 3: 0 and 1 does not mean boolean values in java.
	
//case 4 single statement inside the if else is possible to print without curly braces .but multiple statements are not allowed.
	
static void Case3() {
		
		if(true) 
			System.out.println("true");
			
		else
			System.out.println("False");
			
		
	}
	}


