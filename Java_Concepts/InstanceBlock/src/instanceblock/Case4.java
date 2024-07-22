package instanceblock;

// one class can have multiple instance block.

public class Case4 {
  Case4(){
		
		System.out.println(" zero argument constructor ");
	}
  Case4(int a){
	
	System.out.println(" one argument constructor ");
}
  {
	  System.out.println("just an instance block one ");
  }
  {
	  System.out.println("just an instance block two");
  }

	public static void main(String[] args) {
		
     new Case4();
     new Case4(10);
	}

}
