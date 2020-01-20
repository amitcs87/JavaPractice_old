package abstraction;

interface A{
	void a();
	void b();
	void c();
	void d();
}

abstract class B implements A{
	
	@Override
	public void c() {
		System.out.println("C");		
	}
}

class C extends B{
	@Override
	public void a() {
		System.out.println("A");
	}

	@Override
	public void b() {
		System.out.println("B");		
	}

	@Override
	public void d() {
		System.out.println("D");	
	}
	
}

public class Test1 {
	public static void main(String []args) {
		A a;
		a = new C();
		a.a();
		a.b();
		a.c();
		a.d();
	}
	
}
