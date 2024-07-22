package methods;

public class Case2 {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			
		// Declaring one static and one instance method  with parameter and calling both  methods inside the main method
		// we will pass the parameter value while calling the method
			
			Case2 c= new Case2();
			c.m3(10,'b');
			Case2.m4("varsha", 10.5);
			

		}
		
		void m3(int a,char ch) {
			System.out.println("I am instance method");
			System.out.println( a);
			System.out.println(ch);
			
		}
		static void m4(String str, double d) {
			System.out.println("I am static method");
			System.out.println(str);
			System.out.println(d);
		

	}

}
