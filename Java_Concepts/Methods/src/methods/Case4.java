package methods;

public class Case4 {
	
	//Scenario duplicate method signature is not allowed.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Case4 c= new Case4();
		c.m1();
		c.m1(10);

	}
	void m1() {
		System.out.println("I am instance method");
	}
	/*
	 * void m1() { System.out.println("I am static method"); }
	 */
	void m1(int a) {
		System.out.println("I am also instance method with parameter");
	}
}
