package ������ģʽ;

public class OtherVistor implements Vistor{

	@Override
	public void vistor(Subject subject) {
		System.out.println("������һ��������XXXX"+subject.getFiled());
		subject.getFiled();
		
	}

}
