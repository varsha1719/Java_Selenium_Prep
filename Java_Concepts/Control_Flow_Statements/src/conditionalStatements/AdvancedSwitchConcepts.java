package conditionalStatements;

public class AdvancedSwitchConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case expressions/labels must be constant expressions
		
	//scenario 1:we can used final variables/constant variables as case label names	
	
	  final int a=10; final int b=20;
	  
	  switch(a) { case a: System.out.println("varsha"); break; case b:
	  System.out.println("world"); break;
	  
	  } //scenario 2:case labels must be matched with argument type 
	  String c="var";
	  switch(c) {
	  
	  case "var": System.out.println("world"); break; case "at":
	  System.out.println("wor"); break;
	  
	  
	  }
	  
	  //scenario 3:if the value of any char matched with unicode value then it will work inside the swtich
	  
	  int num =97; switch(num) {
	  
	  case 90: System.out.println("world"); break; case 'a':
	  System.out.println("wow"); break;
	  
	  
	  }
	  
	  //scenario 4:
	  
	  char ch ='d'; switch(ch) {
	  
	  case 100: System.out.println("girl"); break; case 'a':
	  System.out.println("wow"); break;
	  
	  
	  }
	 
		//scenario 5:
		int x= 6;
		
         switch(x) {
		
		case 1:
			
		
		case 2:
			
			
		case 3:
			System.out.println("waah");
			break;
			
		case 4:
			
		case 5:
			
			
		case 6:
			System.out.println("wowow");
			break;
		case 7:
			
		case 8:
			
		case 9:
			System.out.println("wondurful");
			break;
			
				
		
	}
         //Scenario7: if you are passing byte argument you should pass the case labels inside the byte range only
// the case labels must be in range of the argument type
         
   	   byte y=127;
   	   switch(y) {
   	  
   	  case 127: System.out.println("girl");
   	  break; 
   	  case  (byte) 128:
   	  System.out.println("wow"); break;
   	  
   	  
   	  }
   	   
   	   //Scenario 8: expressions are allowed as case labels
   	 int z=100;
  	 switch(z) {
  	  
  	  case (10+90): 
  		  System.out.println("girly");
  	  break; 
  	  case (2000-100):
  	  System.out.println("wow"); break;
  	  
  	  
  	  }
   	   
   	   
}
}
