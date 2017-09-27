package 责任链模式;

public class MyHandler extends Abstracthandler{

	private String name;
	public MyHandler(String name) {
		this.name=name;
	}
	@Override
	public void operator() {
		if (getHandler()!=null) {
			System.out.println(name+"将bug交给了——》》");
			getHandler().operator();
		}else {
			System.out.println(name+"修改bug！！！");
		}
		
	}

}
