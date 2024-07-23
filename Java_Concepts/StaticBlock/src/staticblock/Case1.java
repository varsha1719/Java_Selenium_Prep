package staticblock;

// scenario: class can have multiple instance block , multiple static block and multiple constructors as well

//static block will be exceuted once when the class loaded(class will load once in memore during execution)

//instance block will execute during each object creation

//consturctors will called during object creation

public class Case1 {
	
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
		
		Case1(){
			
			System.out.println(" zero argument constructor ");
		}
		
	  Case1(int a){
		
		System.out.println(" one argument constructor ");
	}
	  
		
	public static void main(String[] args) {
		new Case1();
		new Case1(10);
		

	}

}
