package methods;

//return variables as a returntype

public class Case15 {
	
	int a=100;
	
	int m1() 
	{
		return a;//instance variable as there is no local variable
		
	}
	int m2(int a) 
	{
		return a;// local variable
	}
	
	int m3(int a) 
	{
		return this.a;//instance variable
	}

	public static void main(String[] args) {
		
		Case15 c=new Case15();
		 int x=c.m1();
		 int y=c.m2(20);
		 int z=c.m3(30);
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);

	}

}
