package ����¼ģʽ;
/**
* @author zhangS
* @date 2017��9��28������2:03:51
* @Email 260262911@qq.com
* ����ģʽ��������;����һ�������ĳ��״̬���Ա����ʵ���ʱ��ָ�����
*/
public class Test {

	public static void main(String[] args) {
		//����ԭʼ�Ķ���
		Original original=new Original("����ģʽ");
		System.out.println("original��ʼ�Ķ����ǣ�"+original.getState());
		//��������¼ 
		/**
		 * �����˴�ʱ״̬�ı���¼ ���ҽ����˴洢
		 */
		Storage storage=new Storage(original.createMemeto());
		//�޸�ԭʼ����
		original.setState("�����ģʽ");
		System.out.println("original�޸ĺ�Ķ���״̬��"+original.getState());
		//�ָ�����¼��״̬
		original.recordMemeto(storage.getMemeto());
		System.out.println("original�ָ�����¼֮���״̬��"+original.getState());
	}
}
