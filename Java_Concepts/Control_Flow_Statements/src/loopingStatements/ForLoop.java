package loopingStatements;

import java.util.Iterator;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scenario 1
		
		for (int i=0;i<10;i++) {
		System.out.println("varsha");
			
		}
		//scenario 2 initiliazation part is optional inside the for loop . we can initialize outside the loop. but we should not forgot to use semicolon inside the loop before the condition.
		int i=0;
		for (;i<10;i++) {
			System.out.println("var");
				
			}
		
		//scenario 3: we can write SOP statement in initialization part 
		// we can write multiple SOP statements seprated by comma.
		int j=0;
		for (System.out.println("country");j<10;j++) {
			System.out.println("india");
				
			}
		int k=0;
		for (System.out.println("country"),System.out.println("states");k<10;k++) {
			System.out.println("india");
				
			}
		
		//scenario 4: initialization can be done once, we cannot write int i=0,int j=0; inside the for loop
		//we can write int i=0,j=0;, it mean we can write datatype multiple times.one datatype with  multiple values are allowed
		for (int l=0,m=0;l<10;l++) {
			System.out.println("sha");
				
			}
		
 // sceeario 5:increment decerement part is optional to write it inside the for loop.
		
		for (int n=0;n<10;) {
		System.out.println("varsha_chauhan");
		n++;
			
		}
		//Scenario 6:we acn write SOP statement in place of increment and decrement.
		
		for (int n=0;n<10;System.out.println("varshu")) {
			System.out.println("chauhan");
			n++;
		
		
		
	}
		//scenario 7:if we will not give any condition in for loop. the compiler will take deafult boolean value and keep going on .
		for (;;) {
			System.out.println("chauhan");
			
		
		
	}

}
}
