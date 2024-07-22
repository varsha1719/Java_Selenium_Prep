package constructorTypes;

public class ParameterisedConstructor {
	
	void m1() {
		System.out.println("Hello World");
	}
	
	// Zero argument constructor with zero 
	ParameterisedConstructor(){
		
		System.out.println("Zero Argument");
		
	}
	ParameterisedConstructor(int a){
		
		System.out.println("Parameterized");
		
	}
	

	public static void main(String[] args) {
		
		ParameterisedConstructor P= new ParameterisedConstructor();
		
		P.m1();
		
		ParameterisedConstructor P1= new ParameterisedConstructor(10);
		
		
		P1.m1();
		
	}

}
