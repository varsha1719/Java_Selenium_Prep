package methods;

public class Case7 {
	
	//Scenario: we can call instance method inside another instance method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Case7 c= new Case7();
		c.m1();

	}
	//instance methods
	void m1() {
		
		m2();
		System.out.println("I am instance method 1");
		m2();
	}
	void m2() {
		m3(10);
		System.out.println("I am instance method 2");
	}
	void m3(int a) {
		System.out.println("I am instance method 3");
	}
}
