package constructorTypes;

public class Case1 {
	
	// if there is parameterized constructor available, then compiler will not create any default constructor.
	
	Case1(int a){
		System.out.println("hello");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		//Case1 c = new Case1();//zero argument/default constructor
		Case1 c= new Case1(10);  //parameterized constructor
		

	}

}
