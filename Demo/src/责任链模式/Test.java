package ������ģʽ;

public class Test {

	public static void main(String[] args) {
		MyHandler handler1=new MyHandler("��Ŀ����");
		MyHandler handler2=new MyHandler("�鳤");
		MyHandler handler3=new MyHandler("����Ա");
		handler1.operator();
		System.out.println("_____________________________");
		handler1.setHandler(handler2);
		handler2.setHandler(handler3);
		//handler2.operator();
		handler1.operator();
	}
}
