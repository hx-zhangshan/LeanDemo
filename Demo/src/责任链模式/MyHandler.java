package ������ģʽ;

public class MyHandler extends Abstracthandler{

	private String name;
	public MyHandler(String name) {
		this.name=name;
	}
	@Override
	public void operator() {
		if (getHandler()!=null) {
			System.out.println(name+"��bug�����ˡ�������");
			getHandler().operator();
		}else {
			System.out.println(name+"�޸�bug������");
		}
		
	}

}
