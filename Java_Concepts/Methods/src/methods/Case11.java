package methods;

public class Case11 {
	
	//Scenario other than void each method is gonna return the same type of value.
	int m1() {
		System.out.println("Hello");
		return 10;
	}

	public static void main(String[] args) {
		Case11 c= new Case11();
		int x= c.m1();
		System.out.println(x);
		
	}

}
