package methods;



class emp{
	
}

class stu{
	
}

public class Case13 {
	
	//method return type is object.if you will print the value it will print hashcode
	
	emp m1() {
		
		emp e= new emp();
		return e;
		//return new emp();
	}
	
	stu m2() {
		
		stu s=new stu();
		//return s;
		return new stu();
		
	}
	
	static String m3() {
		
		//System.out.println("varsha");
		
		return "chauhan";
	}

	public static void main(String[] args) {
		
		Case13 c= new Case13();
		
		emp employee =c.m1();
		
		stu student=c.m2();
		
		String stru=Case13.m3();
		
		System.out.println(employee);
		System.out.println(student);
		System.out.println(stru);
		

	}

}
