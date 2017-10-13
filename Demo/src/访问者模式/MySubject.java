package 访问者模式;

public class MySubject implements Subject{

	private String name;
	public MySubject(String name) {
		this.name=name;
	}
	@Override
	public void accpet(Vistor vistor) {
		vistor.vistor(this);
		
	}

	@Override
	public String getFiled() {
		
		return name;
	}

}
