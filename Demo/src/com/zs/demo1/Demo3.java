package com.zs.demo1;

public class Demo3 {

	public static void main(String[] args) {
		Box<String> box=new Box<String>("string");
		System.out.println("name:"+box.getData());
		LinkedListStack<String> linkedListStack = new LinkedListStack<String>();
		linkedListStack.push("bushiwo1");
		linkedListStack.push("bushiwode2");
		linkedListStack.push("bushiwode3");
		System.out.println("KKKKKKKKKKKKK:"+linkedListStack.pop()+linkedListStack.pop()+linkedListStack.pop());
	}
}
