package 代理模式;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		TargetAble target=new ProxyTarget();
		target.targetMethod();
		
		IuserDao iuserDao=new UserDao();
		UserPoxy userPoxy=new UserPoxy();
		userPoxy.setTarget(iuserDao);
		IuserDao iuser =(IuserDao) Proxy.newProxyInstance(iuserDao.getClass().getClassLoader(),iuserDao.getClass().getInterfaces(),
				userPoxy);
		iuser.add(new User("zhang","shan"));
	}
}
