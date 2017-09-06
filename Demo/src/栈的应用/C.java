package Õ»µÄÓ¦ÓÃ;

public class C extends A{
	C(){
		
	}
	C(A t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	void ddc() {
		self();
		dd();
		
		A a=new C();
		SelfBounded<A> b = new B(a);
	}
}
