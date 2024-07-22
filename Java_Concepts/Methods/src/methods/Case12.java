package methods;

public class Case12 {
	//Scenario : method returning primitive values like int float, and char
	int m1() {
		
			System.out.println("hello");
			return 10;
	}
	
	float m2() {
		System.out.println("hii");
		return 10.5f;
	}
	
	static char m3()
	{
		System.out.println("hey");
		return 'h';	
				}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Case12 c= new Case12();
		int x= c.m1();
		System.out.println(x);
		
		float y= c.m2();
		System.out.println(y);
		
		 char z =Case12.m3();
		 System.out.println(z);
		 
		 

	}

}
