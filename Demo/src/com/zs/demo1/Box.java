package com.zs.demo1;

class Box<T>{
	private T data;
	
	public Box(){
		
	}
	public Box(T data){
		this.data=data;
	}
	public T getData(){
		return data;
	}
}
