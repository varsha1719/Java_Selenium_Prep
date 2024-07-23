package staticblock;

//static blocks are used to initialize the value of static variables.

public class Case4 {
	
	static int id;
	
	static {
		id=20;
	}
	
	static void display() {
		
		int a=Case4.id;
		
	 System.out.println(a);
	 
	}

	public static void main(String[] args) {
		
		Case4.display();
		
	}

}
