package ����ģʽ��ö��д��;

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
