package 责任链模式;

public class Test {

	public static void main(String[] args) {
		MyHandler handler1=new MyHandler("项目经理");
		MyHandler handler2=new MyHandler("组长");
		MyHandler handler3=new MyHandler("程序员");
		handler1.operator();
		System.out.println("_____________________________");
		handler1.setHandler(handler2);
		handler2.setHandler(handler3);
		//handler2.operator();
		handler1.operator();
	}
}
