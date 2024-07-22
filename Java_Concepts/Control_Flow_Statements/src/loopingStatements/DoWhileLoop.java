package loopingStatements;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scenario 1: do body will be exceuted
		
		  int i=0;
		  do 
		  { 
			  System.out.println("Hii"); 
			  i++;
		  
		  } 
		  while(i<5); 
		  
		  System.out.println("world");
		  
		  
		 
	
	//Scenario 2 :break can be used to reach th eunreachable statement
	int j=0;
	
	do 
	{
		System.out.println("Hey");
		
		if(j==2) {
			break;
		}
		i++;
	}
	
	while(true);
	System.out.println("india");
	
	
	//scenario 3 pass false in condition is valid
	
	do 
	{
		System.out.println("Hey");
		
	}
	
	while(false);
	System.out.println("india");
	
	
}

}

