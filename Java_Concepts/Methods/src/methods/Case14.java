package methods;

//scenario :return current or same class object using this keyword

public class Case14 {
	
	Case14 m1() {
		
		System.out.println("hi");
		return new Case14();
		
	}
     Case14 m2() {
    	 System.out.println("hey");
    	 return this;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Case14 A= new Case14();
		A.m1();
		A.m2();
		
		//or
		Case14 C=A.m1();
		Case14 D=A.m2();
		

	}

}
