package staticblock;

//Static block will execute during class loads into the memory 
//the instance block in the example will not be excuted before there is no object creation


public class Case2 {
	
	{
		System.out.println("just an instance block 1");
		
	}
	
		{
			System.out.println("just an instance block 2");
		}
		
		static{
			
			System.out.println("just an static block 1");
		}
		
		static{
			System.out.println("just an static block 2");
		}
		

	public static void main(String[] args) {
		

	}

}
