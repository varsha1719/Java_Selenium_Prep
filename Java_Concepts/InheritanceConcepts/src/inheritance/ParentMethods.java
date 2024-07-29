package inheritance;

class ParentMethods {

	void m1() {
		System.out.println("parentmethod m1");
	}
	public static void main(String[] args) {
		
		childMethods c= new childMethods();
		c.m2();
	}

}

  class childMethods extends ParentMethods{
	  
	  void m1() {
		  System.out.println("childMethod m1");
	  }
	  
	  void m2() {
		  this.m1();
		  super.m1();
	  }
  

}