package ���ģʽ��ϰ;
/**
* @author zhangS
* @date 2017��10��18������2:55:34
* @Email 260262911@qq.com
* ��� ״̬ģʽ�뱸��¼ģʽ
* ���и�����ϰ
* 1.����״̬ģʽͨ���ı�һ��������ڲ�״̬���Ӷ��ı�������Ϊ��
* 2.����¼�Ǳ�����һ��������ض�ʱ���״̬����ĳ��ʱ��ָ�����״̬
* 3.����ʵ�ֵĲ����� ��ͨ��״̬ģʽ������ƶ���Ĳ�ͬ״̬��Ȼ������ӱ���¼ģʽ��
* ��ҪĿ���ǽ����ۺ���ϰ��
*/

public class Test {

	public static void main(String[] args) {
		People p=new People("wangJJ", new SubObj1());
		PeopleMemto createPM = p.createPM();
		//�����˴��µı���¼���Ұ����洢
		StorePM sp=new StorePM(createPM);
		System.out.print("û���޸�ǰL��");
		p.peopleState();
		//�ı�������Ϊ
		p.setState(new SubObj2());
		System.out.print("�ı��");
		p.peopleState();
		//�ָ�����¼��״̬
		p.recordP(sp.getPm());
		System.out.print("�ָ����״̬��");
		p.peopleState();
		
	}
}
