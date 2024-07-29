package inheritance;

//Use of this and super keyword to access the variables of parent class .

public class ParentVariables {
	//instance variables of parent class 
	int a=10;
	int b=20;
	
	public static void main(String[] args) {
		
		child c=new child();
		c.add(50,60);
		
	}
	
}
	class child extends ParentVariables{
		
		//instance variable of child class
		int a=30;
		int b=40;
		
		void add(int a, int b) { // 
			
			System.out.println(a+b);  //print local variables
			System.out.println(this.a+this.b);  // print current class variables
			System.out.println(super.a+super.b); //print parent class variables
		}
		
	
	}
	
	
	
		
	
	


