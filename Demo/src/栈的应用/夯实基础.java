package ջ��Ӧ��;

import java.lang.reflect.Modifier;
/**
* @author zhangS
* @date 2017��9��7������3:03:35
* @Email 260262911@qq.com
*/
public class ��ʵ���� {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> cls = java.lang.Class.forName(innerClass.class.getName());
		int modifiers = cls.getModifiers();
		String string = Modifier.toString(modifiers);
		boolean final1 = Modifier.isFinal(modifiers);
		System.out.println("innerClass�����η���"+string+"   "+final1);
	}
	public static final class innerClass{
		
	}
}
