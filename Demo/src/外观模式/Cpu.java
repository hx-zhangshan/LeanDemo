package 外观模式;

public class Cpu implements Able{

	@Override
	public void startUp() {
		System.out.println("cpu开启启动？？？？？？");
		
	}

	@Override
	public void close() {
		System.out.println("cpu关闭？？？？？？");
		
	}

}
