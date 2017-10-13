package ����ģʽ;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserPoxy implements InvocationHandler{

	private IuserDao target;
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		beforMethod();
		
		method.invoke(target, args);
		System.out.println("�������������"+method.getName());
		afterMethod();
		return null;
	}

	public IuserDao getTarget() {
		return target;
	}

	public void setTarget(IuserDao target) {
		this.target = target;
	}

	private void beforMethod(){
		System.out.println("��������֮ǰ���С�������");
	}
	private void afterMethod(){
		System.out.println("��������֮�󡣡�����");
	} 
}
