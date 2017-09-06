package com.zs.demo1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;

public class FuncGenric {
	public <T>  void go(T t) {  
	    System.out.println("generic function");  
	}  
	public void go(String str) {  
	    System.out.println("normal function");  
	}  
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {  
	        FuncGenric fg = new FuncGenric();  
	        fg.go("haha");//��ӡnormal function  
	        fg.<String>go("haha");//��ӡgeneric function  
	                fg.go(new Object());//��ӡgeneric function  
	        fg.go(new Object());//��ӡgeneric function  
	       test(null, fg);
	}  
	/**
	 *���Ƿ��ͷ�����һ��д�� ����ѷ�������д�� ����ֵ��ǰ��
	 *ע�⣺���ǵ��÷��ͷ�����ʱ����Ҫ���ݷ������ͣ�
	 *���� �������뷺�ͷ�����ͬ�ķ���ʱ����Ҫ���ݷ�������
	 * @param a
	 * @param c
	 */
	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {  
        for (T o:a) {  
                 c.add(o); //compile time error  
        }  
}  
	/**
	 * ��Ҫע����� ���������أ�
	 * 1>��������һ�� ������һ�������ز���
	 * 2>�������Ͳ�һ��������ֵ��һ�������ؿ��ԡ�
	 * 
	 * ��������һ�������������ȡ���ݣ�ʹ�� ? extends ͨ���
	 * �������Ѷ���д��һ�����ݽṹ�ʹ�� ? super ͨ���
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public static <T1,T2>void test(List<T1> i,T2 f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Method method = f.getClass().getMethod("test1", Integer.class);
		method.invoke(f,12);
	}
	public int test1(Integer li){
		System.out.println("�������ˣ�������");
		return 0;
	}
}
