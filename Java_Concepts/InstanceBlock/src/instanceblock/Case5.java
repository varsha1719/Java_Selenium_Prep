package instanceblock;

public class Case5 {
	
	//instance block is used to initialize the value of variable during object creation
	
	int eid;
	
	{
	this.eid=111;
	//eid=222;
		
	}
	void emp() {
		 System.out.println(eid);
	}

	public static void main(String[] args) {
		
		Case5 c=	new Case5();
		c.emp();

	}

}
