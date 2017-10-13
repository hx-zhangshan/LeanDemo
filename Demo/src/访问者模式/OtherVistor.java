package 访问者模式;

public class OtherVistor implements Vistor{

	@Override
	public void vistor(Subject subject) {
		System.out.println("我是另一个访问者XXXX"+subject.getFiled());
		subject.getFiled();
		
	}

}
