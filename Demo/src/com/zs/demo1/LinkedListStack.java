package com.zs.demo1;
/**
 * @author zhangS
 * @date 2017��8��30������10:15:02
 * @Email 260262911@qq.com
 * @description  ��������� ����ʵ�ֵ� ���ݴ洢ջ
 * ջ���ݽṹ ���Բ����������ݽṹ������
 */
public class LinkedListStack<T>{
	//�ڵ��ڲ���
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
			//��������ڲ��಻�ǿյ� ��������������Ŀ��� ��գ�����Ҫ�����ڴ�洢��
			//��仰����������ջ�洢��
			top=top.next;
		}
		return result;
	}
}
