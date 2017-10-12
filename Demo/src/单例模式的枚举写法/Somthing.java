package 单例模式的枚举写法;

public enum Somthing {

		INSTENCE;
	private Resoure resoure;
	private Somthing(){
		resoure=new Resoure();
	}
	public Resoure getInstence(){
		return resoure;
	}
}
