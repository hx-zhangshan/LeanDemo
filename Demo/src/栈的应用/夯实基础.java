package 栈的应用;

import java.lang.reflect.Modifier;
/**
* @author zhangS
* @date 2017年9月7日下午3:03:35
* @Email 260262911@qq.com
*/
public class 夯实基础 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> cls = java.lang.Class.forName(innerClass.class.getName());
		int modifiers = cls.getModifiers();
		String string = Modifier.toString(modifiers);
		boolean final1 = Modifier.isFinal(modifiers);
		System.out.println("innerClass的修饰符："+string+"   "+final1);
	}
	public static final class innerClass{
		
	}
}
