package ״̬ģʽ;

public class Student {

	private State state;

	public Student(State state) {
		super();
		this.state = state;
	}
	public void setState(State state){
		this.state = state;
	}
	public double operate(double num1,double num2){
		
		return state.operate(num1, num2);
	}
}
