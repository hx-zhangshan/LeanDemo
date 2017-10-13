package 访问者模式;

public class MyVistor implements Vistor{

	@Override
	public void vistor(Subject subject) {
		System.out.println("我是MMMM的访问者。"+subject.getFiled());
		
	}

}
