package ״̬ģʽ;
/**
* @author zhangS
* @date 2017��9��28������4:15:25
* @Email 260262911@qq.com
* ״̬ģʽ�����ǵ�һ��������ڲ�״̬�ı��ʱ�򣬸ı�������Ϊ��
* ����һ�������в�ͬ��״̬����ͬ��״̬��Ӧ��ͬ����Ϊ��������switch������չ
*/
public class Test {

	public static void main(String[] args) {
		Student student=new Student(new AddState());
		System.out.println("EEEE:::"+student.operate(11, 22));
		student.setState(new Substate());
		System.out.println("KKKKKK:L::::"+student.operate(11, 22));
	}
}
