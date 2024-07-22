package instanceblock;

public class Case2 {
	
	Case2(){
		
		System.out.println(" zero argument constructor ");
		
	}
	Case2(int a){
		
		System.out.println(" one argument constructor ");
		
	}
	Case2(int a, int b){
		
		System.out.println(" Two argument constructor ");
	}
	{
		
		System.out.println("just an instance block");
	}

	public static void main(String[] args) {
		
		new Case2();
		new Case2(10);
		new Case2(10,20);
	}

}
