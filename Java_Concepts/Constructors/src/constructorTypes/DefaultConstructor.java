package constructorTypes;

// Compiler will generate default constructor with zero argument and empty implementation

public class DefaultConstructor {
	
	//default constructor created by compliler , if user will not create any constructor
	
	DefaultConstructor(){
		
	}


	public static void main(String[] args) {
		
		// object 
		DefaultConstructor c= new DefaultConstructor();
		
		c.m1();
		
	}
	
	void m1() {
		System.out.println("default constructor");
	}

}
