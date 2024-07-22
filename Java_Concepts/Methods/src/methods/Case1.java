package methods;

public class Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring one static and one instance method and calling both  methods inside the main method
		
		Case1 c= new Case1();
		c.m1();
		Case1.m2();
		

	}
	
	void m1() {
		System.out.println("I am instance method");
	}
	static void m2() {
		System.out.println("I am static method");
	}

}
