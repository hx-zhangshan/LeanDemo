package Õ»µÄÓ¦ÓÃ;

class SelfBounded<T extends SelfBounded<T>>{  
	SelfBounded(){}
	void self(){}
	private T t;
	
	SelfBounded(T t){
		this.t=t;
	}
	T getData(){
		
		return t;
	}

}  
