package 状态模式;
/**
* @author zhangS
* @date 2017年9月28日下午4:15:25
* @Email 260262911@qq.com
* 状态模式：就是当一个对象的内部状态改变的时候，改变他的行为。
* 就是一个对象有不同的状态，不同的状态对应不同的行为。就像是switch语句的扩展
*/
public class Test {

	public static void main(String[] args) {
		Student student=new Student(new AddState());
		System.out.println("EEEE:::"+student.operate(11, 22));
		student.setState(new Substate());
		System.out.println("KKKKKK:L::::"+student.operate(11, 22));
	}
}
