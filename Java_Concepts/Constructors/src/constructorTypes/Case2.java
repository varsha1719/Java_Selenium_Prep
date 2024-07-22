package constructorTypes;

public class Case2 {
	
	// Constructors are used to initialize the value to instance variable during object creation.

	
	int eid;
	String ename;// instance variables
	float esal;
	
	Case2(){
		
		eid=2;
		 ename="varsha";
		esal=10.20f;
		
		
	}
	
	void display() {
		
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
	}
	
	public static void main(String[] args) {
		
		
		Case2 c= new Case2();
		c.display();
		
	}

}
