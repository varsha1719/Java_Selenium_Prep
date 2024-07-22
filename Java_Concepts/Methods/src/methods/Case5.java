package methods;

public class Case5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Case5 c= new Case5();
		//c.m1();		
		Case5.m2();
		

	}
	//Sceanrio we cannot declare a method without return type
	/*
	 * m1() 
	 * { 
	 * System.out.println("I am instance method"); 
	 * }
	 */
	static void m2() {
		System.out.println("I am static method");
	}
}
