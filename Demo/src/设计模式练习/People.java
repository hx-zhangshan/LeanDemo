package ���ģʽ��ϰ;

public class People {

	private String name;
	private State state;
	
	

	public People(String name, State state) {
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
	
	public void peopleState(){
		System.out.println("����ʲô���֣�"+getName());
		state.say();
	}
	//��������¼
	public PeopleMemto createPM(){
		PeopleMemto pm=new PeopleMemto(getName(), state);
		return pm;
	}
	//�ָ�����¼
	public void recordP(PeopleMemto pm){
		this.name=pm.getName();
		this.state=pm.getState();
		
	}
}
