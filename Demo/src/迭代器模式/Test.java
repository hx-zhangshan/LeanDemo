package ������ģʽ;
/**
* @author zhangS
* @date 2017��9��29������10:24:49
* @Email 260262911@qq.com
* ������ ���ṩһ�ַ��� ���������ڲ�Ԫ�أ����ֲ���©�����ڲ��ṹ��
*/
public class Test {

	public static void main(String[] args) {
		MyCollection myCollection=new MyCollection();
		Iterator iterator = myCollection.iterator();
		while(iterator.hasNext()){
			Object next = iterator.next();
			System.out.println(next);
		}
	}
}
