package 代理模式;

public class UserDao implements IuserDao{

	@Override
	public void add(User user) {
		System.out.println("添加用户数据成功了！！！！");
		
	}

}
