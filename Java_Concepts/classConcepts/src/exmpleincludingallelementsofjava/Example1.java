package exmpleincludingallelementsofjava;

//Example including below five elements of class

//variables
//methods
//constructors
//instance block
//static block

public class Example1 {
	
	int id=10; //instance variable
	static int eid=20; //static variable
	
	{
		
		System.out.println("instance block 1");//instance block
	}
	{
		System.out.println("instance block 2");//instance block
	}
	
	void display() //instance method
	
	{	
		
	    int ei=	Example1.eid;
		System.out.println(id);
		System.out.println(ei);
		
	}
	
	static {
		
		System.out.println("static block number 1");//static block
	}
    static {
		
		System.out.println("static block number 2");//static block
	} 
    
	static void employee(int a) //static method
	{
		Example1 e= new Example1();
		int x=e.id;
		System.out.println(x);
		
	}
	
	Example1()//Zero argument constructor
	{
		System.out.println("Zero argument constructor");
	}
	Example1(int a)//one argument constructor
	{
		System.out.println("one argument constructor");
	}
	public static void main(String[] args) {
		
		Example1 z= new Example1();
		z.display();
		
		Example1 y=new Example1(10);
		y.employee(10);
		
		
		

	}

}
