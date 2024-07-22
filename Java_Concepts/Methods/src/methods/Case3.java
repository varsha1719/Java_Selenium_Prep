package methods;

//Taking object of different class as parameter in method
class A{
	
}
class B{
	
}
class C{
	
}
class D{
	
}

public class Case3 {
	
	

	public static void main(String[] args) {
		
		
		Case3 c1= new Case3();
		A a= new A();
		B b=new B();
		c1.m1(a, b);
		//OR
		c1.m1(new A(), new B());
		
		C c= new C();
		D d=new D();
		Case3.m2(c, d);
		//OR
		Case3.m2(new C(), new D());
		
	}

	void m1(A a, B b) {
		System.out.println("I am instance method");
	}
	static void m2(C c, D d) {
		System.out.println("I am static method");
	}
}
