package 设计模式练习;
//备忘录
public class PeopleMemto {

	private String name;
	private State state;
	
	public PeopleMemto(String name, State state) {
		super();
		this.name = name;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
