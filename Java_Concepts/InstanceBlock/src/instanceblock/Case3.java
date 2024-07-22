package instanceblock;

public class Case3 {
	Case3(){
		
		System.out.println(" zero argument constructor ");
	}
	

	{
		
		System.out.println("just an instance block");
	}


	public static void main(String[] args) {
		
		new Case3();
		new Case3();
		new Case3();

	}

}
