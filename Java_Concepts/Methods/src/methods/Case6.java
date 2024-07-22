package methods;
//Scenario :java doesn't support inner method concept. we cannot declare a method inside a method.
public class Case6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void m1() {
		
		System.out.println("I am instance method");
		/*
		 * void m2() { System.out.println("I am static method"); }//illegal start of exepression
		 */
		
	}
	void m2() {
		System.out.println("I am static method");
	}
}
