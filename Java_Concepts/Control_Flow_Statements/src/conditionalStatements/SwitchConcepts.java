package conditionalStatements;

public class SwitchConcepts {

	public static void main(String[] args) {
		
	//Scenario 1
		
	//int a=50;
		
		byte b=20;
		byte c=30;
		byte d=40;
		
		switch(b) // int byte ,short, char, enum, string
		{
		case 1:System.out.println("Hey");
			break;
		case 2:System.out.println("Hello");
			break;
			
		case 3:
			System.out.println("Hii");
			break;
			
		
			
	//scenario 2 :we can provide expression within the case labels
			
		case 3+2:
			System.out.println("Hii");
			break;
			
	//scenario 3 :we cannot provide duplicate case labels.
			
	//scenario 4 :default case is optional inside the swtich.you can have cases without default inside switch.
			
	//scenario 5 :cases also are optional, there can be only default.you can only default inside switch
	
	//Scenario 6: both cases na d default are optional. we can have swtich without case and default both.
			
	//scenario 7: inside the switch we can have a independent statement without any case or default.
	
	//scenario 8:
			
		default:System.out.println("Hayee");
	      break;		
			
		}
		
		
		
		
		}
		
		

	}


