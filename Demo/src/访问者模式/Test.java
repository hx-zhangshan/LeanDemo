package ������ģʽ;
/**
* @author zhangS
* @date 2017��10��13������9:27:02
* @Email 260262911@qq.com
* ������ģʽ�������ǰ����ݽṹ�����������ݽṹ�ϵĲ������н��
* �ǵĲ����������ɵ��ݻ���
* ������ģʽ���Ƿ������ݽṹ����Ϊ�Ĳ�����
* ���ַ�����Դﵽ�����ݽṹ��̬����Ӳ���������Ҫ���������޸ġ�
*/

public class Test {

	public static void main(String[] args) {
		Subject sb=new MySubject("��JJ");
		Vistor myvistor=new MyVistor();
		Vistor otvistor=new OtherVistor();
		myvistor.vistor(sb);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^6");
		otvistor.vistor(sb);
		
	}
}
