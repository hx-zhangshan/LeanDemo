package ���ģʽ;
/**
* @author zhangS
* @date 2017��9��29������1:44:49
* @Email 260262911@qq.com
* ���ģʽ;��Ϊ�˽�������֮���������ϵ������springһ����
* ��������Ĺ�ϵ���������ļ������ˡ�
* ���ģʽ���ǰ����ǵĹ�ϵ����Facade���У�������������֮�����Ϲ�ϵ��û���漰���ӿڡ�
*/
public class Test {
	public static void main(String[] args) {
		Computer computer=new Computer();
		computer.startUp();
		System.out.println("������������������������������������������������һ���������ķָ��ߡ�������������������������������������������������������-");
		computer.close();
	}
}
