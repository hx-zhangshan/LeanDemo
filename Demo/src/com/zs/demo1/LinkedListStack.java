package com.zs.demo1;
/**
 * @author zhangS
 * @date 2017年8月30日上午10:15:02
 * @Email 260262911@qq.com
 * @description  这个类是用 泛型实现的 数据存储栈
 * 栈数据结构 可以操作各种数据结构？？？
 */
public class LinkedListStack<T>{
	//节点内部类
	private static class Node<U>{
		U item;
		Node<U> next;
		Node(){
			item=null;
			next=null;
		}
		Node(Node<U> next,U item){
			this.item=item;
			this.next=next;
		}
		boolean end(){
			return item==null&&next==null;
		}
	}
	private Node<T> top=new Node<T>();
	public void push(T item){
		top=new Node<T>(top, item);
	}
	public T pop(){
		T result=top.item;
		if (!top.end()) {
			//假如这个内部类不是空的 话把他付出里面的控制 清空；这是要减少内存存储吗？
			//这句话才是真正的栈存储？
			top=top.next;
		}
		return result;
	}
}
