package 代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserPoxy implements InvocationHandler{

	private IuserDao target;
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		beforMethod();
		
		method.invoke(target, args);
		System.out.println("这个方法的名字"+method.getName());
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
		System.out.println("方法运行之前运行。。。。");
	}
	private void afterMethod(){
		System.out.println("方法运行之后。。。。");
	} 
}
