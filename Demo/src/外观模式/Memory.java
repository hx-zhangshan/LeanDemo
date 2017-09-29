package 外观模式;

public class Memory implements Able{

	@Override
	public void startUp() {
		System.out.println("内存已经启动&&&&&&&");
		
	}

	@Override
	public void close() {
		System.out.println("内存已经关闭&&&&&&&");
		
	}

}
