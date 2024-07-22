package loopingStatements;

public class ForEachVSForLoop {
	
	

	static int m1() {
    	return 10;
    }
	static boolean m2() {
    	return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scenario 1: print the value of array elements
		
		int a[]= {10,20,30};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	

	//Scenario 2: print the value of array elements usig for loop
	
	for(int b=0;b<a.length;b++) {
		
		System.out.println(a[b]);
		
	}
	
	//Scenario 2: print the value of array elements usig for Eachloop
	
	for (int aa:a){
		System.out.println(aa);
		
	}
	
	//Scenario 3:unreachable statement:control is unable to reach apraticular i.e is called as unreachable statement
	
      for(int j=0;j<a.length;j++) {
		
		System.out.println("Varsha");
		
	}
      System.out.println("Chauhan");//unreachable statement if condition is true(boolean)
	

	
      //Scenario 4:
    for(int j=0;j<a.length;j++) {
		
		System.out.println("Varsha");////unreachable statement if condition is false(boolean), control will never enter inside for loop
		
	}
    System.out.println("Chauhan");
	

	
	//Scenario 5: it will execute the loop infinite time.
	
   for(int j=1;j>0;j++) {
		
		System.out.println("Varsha");
	}
    System.out.println("Chauhan");
    
    //Scenario 6: we can use any method or we can call any method in place of initilazation and condition
    
   for(int j=ForEachVSForLoop.m1();ForEachVSForLoop.m2();j++) {
		
		System.out.println("Varsha");
	}
	
}
	
}
