package staticblock;


public class Case3 {
	
static{
		
		System.out.println("just an static block of class Case3");
	}

	public static void main(String[] args) throws ClassNotFoundException  {
		
		Class.forName("A");
		Class.forName("B");

	}

}
