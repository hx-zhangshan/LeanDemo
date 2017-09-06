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
	        fg.go("haha");//打印normal function  
	        fg.<String>go("haha");//打印generic function  
	                fg.go(new Object());//打印generic function  
	        fg.go(new Object());//打印generic function  
	       test(null, fg);
	}  
	/**
	 *这是泛型方法的一种写法 必须把泛型类型写到 返回值的前面
	 *注意：我们调用泛型方法的时候不需要传递泛型类型，
	 *但是 当存在与泛型方法相同的方法时候需要传递方法类型
	 * @param a
	 * @param c
	 */
	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {  
        for (T o:a) {  
                 c.add(o); //compile time error  
        }  
}  
	/**
	 * 需要注意的是 方法的重载：
	 * 1>参数类型一样 返回者一样的重载不行
	 * 2>参数类型不一样，返回值不一样的重载可以。
	 * 
	 * 如果你想从一个数据类型里获取数据，使用 ? extends 通配符
	 * 如果你想把对象写入一个数据结构里，使用 ? super 通配符
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
		System.out.println("我运行了！！！！");
		return 0;
	}
}
