package instanceblock;

public class Case1 {
	
	//instance block will excute before constructor.
	
	Case1(){
		System.out.println("0 arg constructor");
	}
	{
		System.out.println("just an instance block");
	}

	public static void main(String[] args) {
		
		Case1 i= new Case1();
		
	}

}
