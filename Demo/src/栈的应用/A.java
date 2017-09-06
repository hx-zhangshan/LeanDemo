package Õ»µÄÓ¦ÓÃ;

public class A extends SelfBounded<A>{
	A(){}
	A(A t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public void dd() {
		self();
		A data = getData();
	}
	
}
