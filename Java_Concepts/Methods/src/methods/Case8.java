package methods;

public class Case8 {
	
	//Scenario :if a class contains local variable and instance variable with the same name use this keyword to denote/represent instance variable
	
	int a=10;int b=20;//instance variable

	public static void main(String[] args) {
		
		
		// declaring one static and one instance method and calling both  methods inside the main method
		
		Case8 c= new Case8();
		c.m1(100,200);
		
		

	}
	
	void m1(int a , int b) {//local variable
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	

}
